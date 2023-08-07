package com.mcnz.project;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

public interface EventsService {

	void loadData();

	List<Event> findAllEvents();

	Optional<Event> findEventById(String id);

	void deleteEventById(String id);

	void deleteEvent(Event event);

	Event saveOrUpdate(Event event);

//	public ResponseEntity<?> deleteEvent(Long id);
}