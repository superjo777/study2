package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * {"account" : "", "email" : "", "page" : 0}
 * */

@Data
@AllArgsConstructor
public class SearchParam {
	private String account;
	private String email;
	private int page;
	

}
