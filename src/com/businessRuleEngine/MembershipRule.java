package com.businessRuleEngine;

public class MembershipRule implements RuleInterface {

	@Override
	public boolean shouldRun(Order order) {
		return Order.PRODUCT_CATEGORY.MEMBERSHIP.equals(order.getProductCategory());
	}

	@Override
	public void runRule(Order order) {
		DeliveryUtils devUtils = new DeliveryUtils();
		devUtils.membershipOpration(order);
	}

}
