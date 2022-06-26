package com.wipro.velocity.efarming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.velocity.efarming.module.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {

	Farmer findByEmail(String email);
	
	Farmer findById(long id);

}
