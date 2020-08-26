package com.businessRuleEngine;

public class Order {
	
	public enum PRODUCT_CATEGORY {
        PHYSICAL,
        MEMBERSHIP,
        VIDEO
    }
	
	
	
	public Order(PRODUCT_CATEGORY productCategory, String productName, String prductType) {
		super();
		this.productCategory = productCategory;
		this.productName = productName;
		this.prductType = prductType;
	}

	private PRODUCT_CATEGORY productCategory;
	
	private String productName;
	
	private String prductType;

	public String getProductName() {
		return productName;
	}

	public String getPrductType() {
		return prductType;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrductType(String prductType) {
		this.prductType = prductType;
	}

	public PRODUCT_CATEGORY getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(PRODUCT_CATEGORY productCategory) {
		this.productCategory = productCategory;
	}

}
