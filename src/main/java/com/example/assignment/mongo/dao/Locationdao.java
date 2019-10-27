package com.example.assignment.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment.mongo.model.Location;

@Repository
public interface Locationdao extends MongoRepository<Location, String> {

}