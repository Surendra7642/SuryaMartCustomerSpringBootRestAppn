package com.surya.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	private Integer cid;
	private String cname;
	private String prodName;
	private int qty;
	private double price;
	private double total;
	private double discount;
	private double bill;
	public Customer() {
		super();
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	public Customer(Integer cid, String cname, String prodName, int qty, double price, double total, double discount,
			double bill) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.prodName = prodName;
		this.qty = qty;
		this.price = price;
		this.total = total;
		this.discount = discount;
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", prodName=" + prodName + ", qty=" + qty + ", price="
				+ price + ", total=" + total + ", discount=" + discount + ", bill=" + bill + "]";
	}
	

}
