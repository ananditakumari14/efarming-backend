package com.wipro.velocity.efarming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.efarming.module.Farmer;
import com.wipro.velocity.efarming.repository.FarmerRepository;

@RestController
@RequestMapping("/e-farming")
//@CrossOrigin(origins="http://localhost:4200")

public class FarmerController {
	
	@Autowired
	private FarmerRepository frepo;

	//create farmer
	@PostMapping("/farmer")
	public Farmer createFarmer(@Validated @RequestBody Farmer farmer) {

		Farmer f = new Farmer();
		f.setFullName(farmer.getFullName());
        f.setContactNumber(farmer.getContactNumber());
        f.setState(farmer.getState());
        f.setCity(farmer.getCity());
        f.setAccountnumber(farmer.getAccountnumber());
        f.setIfsc(farmer.getIfsc());
        f.setAadhar(farmer.getAadhar());
        f.setPan(farmer.getPan());
        f.setTradelicense(farmer.getTradelicense());
        f.setEmail(farmer.getEmail());
        f.setAddress(farmer.getAddress());
        f.setPin(farmer.getPin());
        f.setPassword(farmer.getPassword());
        
		frepo.save(f);
		return farmer;
	}
	
	//Login farmer
	@PostMapping("/farmers")
	public Boolean loginUser(@Validated @RequestBody Farmer farmer) {
		Boolean a = false;
		String email = farmer.getEmail();
		String password = farmer.getPassword();

		Farmer f = frepo.findByEmail(email);

		if (email.equals(f.getEmail()) && password.equals(f.getPassword())) {
			a = true;
		}
		return a;
	}

	//Delete farmer
 	@DeleteMapping("/deleteFarmer/{id}")
    public Boolean deletefarmer(@PathVariable("id") long id) {
		frepo.deleteById(id);
        return true;      
    }

 	//Admin Login
	@PostMapping("/admin")
	public Boolean loginAdmin(@Validated @RequestBody Farmer farmer) {
		Boolean b = false;
		String email = farmer.getEmail();
		String password = farmer.getPassword();

		if (email.equals("admin@gmail.com") && password.equals("admin")) {
			b = true;
		}
		return b;
	}	
	
	//Select All farmer
	@GetMapping("/farmer")
	public List<Farmer> getAllFarmer()
	{
		return frepo.findAll();
	}
	
	/* @PutMapping("/farmer/{id}")
	public ResponseEntity<Farmer> updateFarmer(@PathVariable(value = "id") Long id, @Validated @RequestBody Farmer farmer){
		Farmer f = frepo.findById(id);
		
		f.setFullName(farmer.getFullName());
        f.setContactNumber(farmer.getContactNumber());
        f.setState(farmer.getState());
        f.setCity(farmer.getCity());
        f.setAccountnumber(farmer.getAccountnumber());
        f.setIfsc(farmer.getIfsc());
        f.setAadhar(farmer.getAadhar());
        f.setPan(farmer.getPan());
        f.setTradelicense(farmer.getTradelicense());
        f.setEmail(farmer.getEmail());
        f.setAddress(farmer.getAddress());
        f.setPin(farmer.getPin());
        f.setPassword(farmer.getPassword());
        
        final Farmer updateFarmer = frepo.save(f);
        return ResponseEntity.ok(updateFarmer); 
	
	
	}*/
}


