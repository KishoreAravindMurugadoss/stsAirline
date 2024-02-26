package com.airlines_app002.services;

import java.util.List;

import com.airlines_app002.entity.Billing;

public interface BillingService {

	public void saveBillPassInfo(Billing bill);

	public List <Billing> listBill(Billing bill);

	public Billing updateOnePass(long id);

	public void updateOneData(Billing bill);

	public void deleteOneBill(long id);

	public Billing genBill(long id);

	
}
