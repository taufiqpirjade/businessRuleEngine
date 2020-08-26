package com.businessRuleEngine;

import java.util.List;

public class DeliveryUtils {
	
	private static final String PACKING_SLIP_IS_GENERATED = "Packing Slip is generated";
	private static final String COMMISION_IS_GENERATED_TO_AGENT = "Commision is generated to Agent";

	
	public void generatePackingSlip(List<Order> orders, boolean isDuplicate) {
		PackingSlip packingSlip = new PackingSlip();
		packingSlip.setOrders(orders);
		packingSlip.setDuplicate(false);
		if (isDuplicate) {
			System.out.println("Duplicate "+PACKING_SLIP_IS_GENERATED);
		} else {
			System.out.println(PACKING_SLIP_IS_GENERATED);
		}
		
	}
	
	
	public void generateCommission() {
		System.out.println(COMMISION_IS_GENERATED_TO_AGENT);
	}
	
	
	public void membershipOpration(Order order) {
		if ("Membership".equalsIgnoreCase(order.getPrductType())) {
			System.out.println("Activating mumbership");
		} else if ("Upgrade".equalsIgnoreCase(order.getPrductType())) {
			System.out.println("Applying Upgrade");
		}
		System.out.println("Sending Email to User");
	}

}
