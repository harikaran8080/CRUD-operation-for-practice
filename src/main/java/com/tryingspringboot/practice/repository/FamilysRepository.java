package com.tryingspringboot.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tryingspringboot.practice.entity.FamilysEntity;

@Repository
public interface FamilysRepository extends JpaRepository<FamilysEntity, Integer> {

}
