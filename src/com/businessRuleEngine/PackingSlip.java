package com.businessRuleEngine;

import java.util.List;

public class PackingSlip {
	
	private List<Order> orders;
	private boolean isDuplicate;
	
	public List<Order> getOrders() {
		return orders;
	}
	public boolean isDuplicate() {
		return isDuplicate;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public void setDuplicate(boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}

}
