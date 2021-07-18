package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SearchParam;

@RestController
@RequestMapping("/api")
public class getController {
	
	@RequestMapping(method = RequestMethod.GET, path = "getMethod") //localhost:8080/api/getmethod
	public String getRequest() {
		
		return "HI getMethod";
	}

	@GetMapping("/getParameter")	//localhost:8080/api/getParameter?id=1234&password=asdf
	public String getParameter(@RequestParam String id,  @RequestParam(name = "password") String pwd) {
		System.out.println("id : " + id);
		System.out.println("password : " + pwd);
		
		return id + pwd;
		
	}
	
	@GetMapping("/getMultiParameter")	//localhost:8080/api/getMultiParameter?account=1234&email=study@gmail.com&page=1
	public SearchParam getMultiParameter(SearchParam searchParam) {
		System.out.println(searchParam.getAccount());
		System.out.println(searchParam.getEmail());
		System.out.println(searchParam.getPage());
		
		
		
		//{"account" : "", "email" : "", "page" : 0}
		
		return searchParam;
	}
}
