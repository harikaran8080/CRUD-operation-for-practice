package com.tryingspringboot.practice.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tryingspringboot.practice.entity.FamilysEntity;
import com.tryingspringboot.practice.repository.FamilysRepository;
@Service
public class FamilysService implements FamilysServiceImplement {
	@Autowired
	FamilysRepository familysRepository;
	@Override

	public FamilysEntity post(FamilysEntity entity) {
		return familysRepository.save(entity);
		
		
	}
    @Override
	public List<FamilysEntity>  allpost(List<FamilysEntity> familysEntities) {
		return familysRepository.saveAll(familysEntities);
		
		
	}
    @Override
	public List<FamilysEntity> getall() {
    	return familysRepository.findAll();
	}
    @Override
	public Optional<FamilysEntity> get(int id) {
		return familysRepository.findById(id);
		 
		
	}
    @Override
	public FamilysEntity update(FamilysEntity entity) {
		Optional<FamilysEntity>optional=familysRepository.findById(entity.getId());
		FamilysEntity entity2=optional.get();
		entity2.setAge(entity.getAge());
		entity2.setId(entity.getId());
		entity2.setName(entity.getName());
		return familysRepository.save(entity);
	}
    @Override
	public String delete(int id) {
		familysRepository.deleteById(id);
	
		return "Deleted";
	}
	
}
