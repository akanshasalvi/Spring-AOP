package com.aar.beans;

import java.util.List;

public class BillGeneration {
	
	public Bill generator(List<Bill> bill, String mobileNo)
	{
		Bill bills = new Bill();
		bills.setBillNo(01);
		bills.setCustomer_Name("Ajay");
		bills.setAmount(678);
		return bills;
		
	}

}
