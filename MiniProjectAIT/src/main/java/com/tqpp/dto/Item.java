package com.tqpp.dto;

public class Item {

	private int productid;
	private String productname;
	private double price;
	private int qty;
	@Override
	public String toString() {
		return "Item [productid=" + productid + ", productname=" + productname + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	public Item(int productid, String productname, Double double1, int qty) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = double1;
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Item(int productid, String productname, int qty) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.qty = qty;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
}
