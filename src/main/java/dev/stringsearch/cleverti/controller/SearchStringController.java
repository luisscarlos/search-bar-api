package dev.stringsearch.cleverti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.stringsearch.cleverti.data.SearchStringData;
import dev.stringsearch.cleverti.service.SearchStringService;

@RestController
@RequestMapping()
public class SearchStringController {
	
	@Autowired
	private SearchStringData data;
	
	@Autowired
	private SearchStringService service;

	@GetMapping
	public String[] getAll() {
		return data.getStations();
	}
	
	@GetMapping(value = "/search/{name}")
	public List<String> listFounds(@PathVariable("name") String station) {
		return service.stringMatch(data.getStations(), station);
	}
}
