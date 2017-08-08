package com.example.postconstruct;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.People;
import com.example.repository.PeopleRepository;

@Component
public class PostConstructInit {
	@Autowired
	private PeopleRepository peopleRepository;
	
	@PostConstruct
	public void dd() {
		People p1 = new People();
		p1.setName("aaa");
		
		People p2 = new People();
		p2.setName("bbb");
		
		People p3 = new People();
		p3.setName("ccc");
		
		People p4 = new People();
		p4.setName("ddd");
		
		peopleRepository.save(p1);
		peopleRepository.save(p2);
		peopleRepository.save(p3);
		peopleRepository.save(p4);
	}
}
