package com.tryingspringboot.practice.service;

import java.util.List;
import java.util.Optional;

import com.tryingspringboot.practice.entity.FamilysEntity;

public interface FamilysServiceImplement {

	FamilysEntity post(FamilysEntity entity);

	List<FamilysEntity> allpost(List<FamilysEntity> familysEntities);

	List<FamilysEntity> getall();

	Optional<FamilysEntity> get(int id);

	FamilysEntity update(FamilysEntity entity);

	String delete(int id);



	

}
