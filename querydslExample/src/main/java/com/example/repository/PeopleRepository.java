package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.People;

public interface PeopleRepository extends JpaRepository<People, Long> {
	
}
