package com.example.demo.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SearchParam;

/**
 * HTML <From>
 * ajax °Ë»ö
 * http post body -> data
 * json, xml, multiport - from / text-plain
 * */


@RestController
@RequestMapping("/api")
public class PostController {

	@PostMapping("/postMethod")
	public SearchParam postMetohd(@RequestBody SearchParam searchParam) {
		
		
		
		return searchParam;
	}
	
	@PutMapping
	public void put(){
		
	}
	
	@PatchMapping
	public void patch() {
		
	}
}
