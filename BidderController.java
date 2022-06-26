package com.wipro.velocity.efarming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.efarming.module.Bidder;
import com.wipro.velocity.efarming.repository.BidderRepository;

@RestController
@RequestMapping("/e-farming")
@CrossOrigin(origins="http://localhost:4200")
public class BidderController {
	
	@Autowired
	private BidderRepository brepo;

	//create farmer
	@PostMapping("/bidder")
	public Bidder createBidder(@Validated @RequestBody Bidder bidder) {

		Bidder b = new Bidder();
		b.setFullName(bidder.getFullName());
        b.setContactNumber(bidder.getContactNumber());
        b.setState(bidder.getState());
        b.setCity(bidder.getCity());
        b.setAccountnumber(bidder.getAccountnumber());
        b.setIfsc(bidder.getIfsc());
        b.setAadhar(bidder.getAadhar());
        b.setPan(bidder.getPan());
        b.setTradelicense(bidder.getTradelicense());
        b.setEmail(bidder.getEmail());
        b.setAddress(bidder.getAddress());
        b.setPin(bidder.getPin());
        b.setPassword(bidder.getPassword());
        
		brepo.save(b);
		return bidder;
	}
	
	//Login bidder
	@PostMapping("/bidders")
	public Boolean loginUser(@Validated @RequestBody Bidder bidder) {
		Boolean a = false;
		String email = bidder.getEmail();
		String password = bidder.getPassword();

		Bidder b = brepo.findByEmail(email);

		if (email.equals(b.getEmail()) && password.equals(b.getPassword())) {
			a = true;
		}
		return a;
	}

	//Delete farmer
 	@DeleteMapping("/deleteBidder/{id}")
    public Boolean deleteBidder(@PathVariable("id") long id) {
		brepo.deleteById(id);
        return true;      
 	}
	
	//Select All farmer
	@GetMapping("/bidder")
	public List<Bidder> getAllBidder()
	{
		return brepo.findAll();
	}
	
 }



