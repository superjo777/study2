package com.example.demo.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity // == table
//@Table(name = "user") class의 이름과 table의 이름이 동일하다면 설정 생략
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Column(name = "account") 변수명과 column명이 같을경우 생략
	private String account;
	private String email;
	private String phoneNumber;
	private LocalDateTime createdAt;
	private String createdBy;
	private LocalDateTime updatedAt;
	private String updatedBy;
}
