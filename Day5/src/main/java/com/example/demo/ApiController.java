package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@Autowired
	BookRepo serviceRepository;
	@Autowired
	ApiService service;
	@GetMapping("/getvalues")
	List<Book>getList(){
		return serviceRepository.findAll();
		
	}
@PostMapping("/post")
public Book create(@RequestBody Book det) {
	return serviceRepository.save(det);
}
@GetMapping("/getvalues/{id}")
	public Optional<Book>getbyid(@PathVariable int id){
		return service.getBook(id);
	}
	@PutMapping("/student")
	public String update(@RequestBody Book det) {
		return service.updateBook(det);
	}
	@DeleteMapping("/student")
	public String delete(@RequestParam int id) {
		return service.deleteBook(id);
	}
}