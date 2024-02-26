package com.airlines_app002.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlines_app002.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

	
}
