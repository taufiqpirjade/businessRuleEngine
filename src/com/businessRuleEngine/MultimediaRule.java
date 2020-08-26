package com.businessRuleEngine;

import java.util.ArrayList;
import java.util.List;

public class MultimediaRule implements RuleInterface {

	@Override
	public boolean shouldRun(Order order) {
		return Order.PRODUCT_CATEGORY.VIDEO.equals(order.getProductCategory());
	}

	@Override
	public void runRule(Order order) {
		if ("Learning to Ski".equalsIgnoreCase(order.getProductName())) {
			DeliveryUtils devUtils = new DeliveryUtils();
			Order addonOrder = new Order(Order.PRODUCT_CATEGORY.VIDEO,"First Aid","VIDEO");
			List<Order> orderList = new ArrayList<Order>();
			orderList.add(order);
			orderList.add(addonOrder);
			System.out.println("Added 'First Aid' video");
			devUtils.generatePackingSlip(orderList, false);
		}
	}

}
