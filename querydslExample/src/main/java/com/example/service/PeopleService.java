package com.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.People;
import com.example.entity.QPeople;
import com.example.repository.PeopleRepository;
import com.mysema.query.jpa.impl.JPAQuery;

@Service
public class PeopleService {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	public void gg() {
		QPeople people = QPeople.people;
		JPAQuery query = new JPAQuery(entityManager);
		
		List<People> list = entityManager.createQuery("select p from People p", People.class).getResultList();
		
		List<People> ps = query.from(people).listResults(people).getResults();
				
		for (int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		
		for (int i = 0; i < ps.size(); i++) {
			System.out.println(ps.get(i).getId());
		}
	}
}
