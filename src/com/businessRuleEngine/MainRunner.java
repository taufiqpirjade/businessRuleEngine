package com.businessRuleEngine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainRunner {
	
	private static List<RuleInterface> rules;
	
	public static void main(String[] args) {
		ruleInitializer();
		//Order order = new Order(Order.PRODUCT_CATEGORY.VIDEO,"Learning to Ski","VIDEO");
		Order order = new Order(Order.PRODUCT_CATEGORY.PHYSICAL,"Toy","Toy");
		//Order order = new Order(Order.PRODUCT_CATEGORY.PHYSICAL,"Rich Dad Poor Dad","Book");
//		Order order = new Order(Order.PRODUCT_CATEGORY.MEMBERSHIP,"Prime","Membership");
//		Order order = new Order(Order.PRODUCT_CATEGORY.MEMBERSHIP,"Prime","upgrade");
		for ( RuleInterface rule : rules){
            if(rule.shouldRun(order)){
                rule.runRule(order);
            }
        }
	}
	
	public static void ruleInitializer(){
        rules = Collections.unmodifiableList(Arrays.asList(new PhysicalProductRule(), new MembershipRule(), new MultimediaRule()));
    }

}
