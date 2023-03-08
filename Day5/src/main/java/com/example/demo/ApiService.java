package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
@Autowired
BookRepo repository;
public Optional<Book>getBook(int id){
	return repository.findById(id);
}
public String updateBook(Book det) {
	repository.save(det);
	return "updated";
}

public String deleteBook(int id) {
	repository.deleteById(id);
	return "Id deleted";
}
}