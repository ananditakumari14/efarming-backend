package com.wipro.velocity.efarming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.velocity.efarming.module.Bidder;

public interface BidderRepository extends JpaRepository<Bidder, Long> {

	Bidder findByEmail(String email);

}
