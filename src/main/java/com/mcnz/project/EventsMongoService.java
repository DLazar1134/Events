package com.mcnz.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class EventsMongoService implements EventsService {
	
	@Autowired
	EventsMongoRepository mongoRepository;
	
	@Override
	public void loadData() {
		
		Event event1 = new Event("abc","Cars and Coffee","Fun Event");
		Event event2 = new Event("def","Taylor Swift","Sing");
		Event event3 = new Event("ghi","Planes","Take Flight");
		mongoRepository.save(event1);
		mongoRepository.save(event2);
		mongoRepository.save(event3);
	}
	
	@Override
	public List<Event> findAllEvents(){
		return mongoRepository.findAll();
	}
	
	@Override
	public Optional<Event> findEventById(String id) {
		return mongoRepository.findById(id);
	}

	@Override
	public void deleteEventById(String id) {
		mongoRepository.deleteById(id);
	}
	
	@Override
	public void deleteEvent(Event event) {
		mongoRepository.delete(event);
	}
	
	@Override
	public Event saveOrUpdate(Event event) {
		event = mongoRepository.save(event);
		return event;
	}
}
