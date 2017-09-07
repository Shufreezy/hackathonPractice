package com.hackathonPractice.entry.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathonPractice.entry.dao.EventRepository;
import com.hackathonPractice.entry.models.Event;

@RestController
public class EventController {
	private EventRepository repository;
	
	public EventController(EventRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/get-all-events")
	@CrossOrigin(origins = "http://localhost:4200")
	public Collection<Event> getAllEvents() {
		return repository.findAll();
	}
}
