package com.sc.SpringbootWebProj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sc.SpringbootWebProj.impl.SearchService;

@RestController
public class SearchController {

	@Autowired
	SearchService searchService;
	
	@GetMapping("/searchService/{numberToBeSearched}")
	public String isNumberPresent(@PathVariable("numberToBeSearched") int number) {
		boolean isPresent	=	searchService.search(number);
		System.out.println(">>>> Value "+isPresent);
		return ""+searchService.search(number);
	}
}
