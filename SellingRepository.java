package com.wipro.velocity.efarming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.velocity.efarming.module.SellingItem;

public interface SellingRepository  extends JpaRepository<SellingItem, Long> {
		
		SellingItem findById(long id);


}
