package com.tryingspringboot.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tryingspringboot.practice.entity.FamilysEntity;
import com.tryingspringboot.practice.service.FamilysService;

@RestController
@RequestMapping("/rest/api")
public class FamilysController {
	@Autowired
	FamilysService familysService;
	
	@PostMapping("/post")
	public FamilysEntity post(@RequestBody FamilysEntity entity) {
		return familysService.post(entity);
		
	}
	
	@PostMapping("/all/post")
	public List<FamilysEntity> allpost(@RequestBody List<FamilysEntity> familysEntities){
		return familysService.allpost(familysEntities);
		 
	}
	@GetMapping("/getall")
	public List<FamilysEntity> getall() {
		return familysService.getall();
	 
	}
	@GetMapping("/get/{id}")
	public Optional<FamilysEntity>get(@PathVariable int id){
		 Optional<FamilysEntity> optional=familysService.get(id);
		 return optional;
		
		
	}
	@PutMapping("/update")
	public FamilysEntity update(@RequestBody FamilysEntity entity) {
		return familysService.update(entity);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return familysService.delete(id);
	}
	
}
