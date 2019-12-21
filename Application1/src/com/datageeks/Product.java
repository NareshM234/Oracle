package com.datageeks;

public class Product {
	private Integer productId ;
	private String productName;
	private Float productPrice;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(Integer productId, String productName, Float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	
	public int hashCode()
	{
		return this.productId;
	}

	public boolean equals(Object obj)
	{
		Product p = (Product) obj;
		
		return this.productId.equals(p.getProductId());
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
}
