package com.businessRuleEngine;

public interface RuleInterface {
	
	public boolean shouldRun(Order order);
	
	public void runRule(Order order);

}
