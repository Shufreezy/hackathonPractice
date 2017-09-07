package com.hackathonPractice.entry.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hackathonPractice.entry.models.Event;

@RepositoryRestResource
public interface EventRepository extends JpaRepository<Event, Long> {
	
}
