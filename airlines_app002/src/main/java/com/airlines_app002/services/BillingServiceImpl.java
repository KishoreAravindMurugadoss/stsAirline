package com.airlines_app002.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlines_app002.entity.Billing;
import com.airlines_app002.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	public BillingRepository billRepo;

	@Override
	public void saveBillPassInfo(Billing bill) {
		billRepo.save(bill);
	}

	@Override
	public List<Billing> listBill(Billing bill) {
		List<Billing> findBills = billRepo.findAll();
		return findBills;
	}

	@Override
	public Billing updateOnePass(long id) {
		Optional<Billing> findById = billRepo.findById(id);
		Billing billing = findById.get();
		return billing;
	}

	@Override
	public void updateOneData(Billing bill) {
		billRepo.save(bill);
	}

	@Override
	public void deleteOneBill(long id) {
		billRepo.deleteById(id);
	}

	@Override
	public Billing genBill(long id) {
		Optional<Billing> byId = billRepo.findById(id);
		Billing billing = byId.get();
		return billing;
	}
	
	
	
}
