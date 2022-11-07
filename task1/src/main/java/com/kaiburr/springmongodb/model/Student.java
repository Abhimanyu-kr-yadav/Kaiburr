package com.kaiburr.springmongodb.model;

import java.math.BigDecimal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "Student")
public class Student {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Gender gender;
	private Address address;
	private List<String> favouriteSubjects;
	private BigDecimal totalSpentInBooks;
	
	
	
	//Constructor
	public Student(String firstName, String lastName, String email, com.kaiburr.springmongodb.model.Gender gender,
			com.kaiburr.springmongodb.model.Address address, List<String> favouriteSubjects,
			BigDecimal totalSpentInBooks) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.favouriteSubjects = favouriteSubjects;
		this.totalSpentInBooks = totalSpentInBooks;
		
	}
	
	
	
}
