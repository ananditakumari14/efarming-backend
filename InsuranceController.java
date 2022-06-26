package com.wipro.velocity.efarming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.velocity.efarming.module.insurance;
import com.wipro.velocity.efarming.repository.InsuranceRepository;

@RestController
@RequestMapping("/e-farming")
@CrossOrigin(origins="http://localhost:4200")
public class InsuranceController {
	@Autowired
	private InsuranceRepository irepo;
	
	@PostMapping("/insurance")
	public insurance createInsurance(@Validated @RequestBody insurance insurance) {

		insurance i = new insurance();
		i.setArea(insurance.getArea());
		i.setCrop(insurance.getCrop());
		i.setSeason(insurance.getSeason());
		i.setSumOfInsured(insurance.getSumOfInsured());
        i.setYear(insurance.getYear());
        
		irepo.save(i);
		return insurance;
	}
	
}
