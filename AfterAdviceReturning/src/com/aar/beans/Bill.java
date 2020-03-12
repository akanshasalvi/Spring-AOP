package com.aar.beans;

public class Bill {
	
	private int billNo;
	private String customer_Name;
	private double amount;
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", customer_Name=" + customer_Name + ", amount=" + amount + "]";
	}
	
	

}
