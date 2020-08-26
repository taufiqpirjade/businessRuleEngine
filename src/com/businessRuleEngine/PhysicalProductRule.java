package com.businessRuleEngine;

import java.util.ArrayList;
import java.util.List;

public class PhysicalProductRule implements RuleInterface {

	private static final String BOOK = "Book";

	@Override
	public boolean shouldRun(Order order) {
		return Order.PRODUCT_CATEGORY.PHYSICAL.equals(order.getProductCategory());
	}

	@Override
	public void runRule(Order order) {
		DeliveryUtils devUtils = new DeliveryUtils();
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order);
		devUtils.generatePackingSlip(orderList, false);
		devUtils.generateCommission();
		if (BOOK.equalsIgnoreCase(order.getPrductType())) {
			devUtils.generatePackingSlip(orderList, true);
		}
	}

}
