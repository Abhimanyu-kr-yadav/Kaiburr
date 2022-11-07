package com.kaiburr.springmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kaiburr.springmongodb.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer>{
	List<Student> findByFirstName(String firstName);
}
