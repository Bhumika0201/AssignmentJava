package com.example.assignment.mongo.controller;

import com.example.assignment.mongo.model.Location;
import com.example.assignment.mongo.dao.Locationdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
	@Autowired
	private Locationdao repository;
	
	@CrossOrigin(origins = "https://bhumika0201.github.io")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Location> getAllLocation() {
		return repository.findAll();
	}

	@CrossOrigin(origins = "https://bhumika0201.github.io")
	@PostMapping("/addCity")
	public Location creatLocationa(@RequestBody Location locationName) {
		repository.save(locationName);
		return locationName;
	}

}