package com.mcnz.project;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventsMongoRepository extends MongoRepository<Event, String> {

}
