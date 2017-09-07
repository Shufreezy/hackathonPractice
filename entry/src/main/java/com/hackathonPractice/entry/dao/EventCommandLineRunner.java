package com.hackathonPractice.entry.dao;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hackathonPractice.entry.models.Event;

@Component
public class EventCommandLineRunner implements CommandLineRunner {

	private final EventRepository repository;

	public EventCommandLineRunner(EventRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		Stream.of("HackIt Challenge 2017", "ASI Biggest Loser 2017").forEach(name -> repository.save(new Event(name)));
		repository.findAll().forEach(System.out::println);
	}

}
