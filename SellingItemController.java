package com.wipro.velocity.efarming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.efarming.module.SellingItem;
import com.wipro.velocity.efarming.repository.SellingRepository;

@RestController
@RequestMapping("/e-farming")
//@CrossOrigin(origins="http://localhost:4200")
public class SellingItemController {
	
	@Autowired
	private SellingRepository srepo;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/sellingItem")
	public SellingItem createSellingItem(@Validated @RequestBody SellingItem sitem) {

		SellingItem s = new SellingItem();
		s.setFarmerId(sitem.getFarmerId());
        s.setCropType(sitem.getCropType());
        s.setCropName(sitem.getCropName());
        s.setFertilizerType(sitem.getFertilizerType());
        s.setQuantity(sitem.getQuantity());
        s.setSoilPhCertificate(sitem.getSoilPhCertificate());
        s.setBidderid(sitem.getBidderid());
        s.setBidAmount(sitem.getBidAmount());
        s.setStatus(sitem.getStatus());
        
		srepo.save(s);
		return sitem;
	}
	
	
	//Select All Selling item
 	@GetMapping("/sellingitem")
    public List<SellingItem> getAllSellingItem(){
 		
        return srepo.findAll();
 	}
   
 	//get item by ID
 	@GetMapping("/sellingitem/{id}")
	public SellingItem getItemById(@PathVariable(value = "id") Long id, @Validated @RequestBody SellingItem sellingitem){
		
		SellingItem s = srepo.findById(id).get();
		
		return s;
 	}	
	
}
