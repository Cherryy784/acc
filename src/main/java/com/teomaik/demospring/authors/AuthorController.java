package com.teomaik.demospring.authors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("authors")
public class AuthorController {
	
	@Autowired
	AuthorServices authorServices;
	
	
	@PostMapping("/add")
	public List<Author> addAuthor(@RequestBody Author a){
		return authorServices.addAuthor(a);
	}
	
	@GetMapping("/all")
	public List<Author> allAuthors(){
		return authorServices.getAllAuthors();
	}
	
	@DeleteMapping("/delete")
	public List<Author> deleteAuthor(@RequestParam int id){
		return authorServices.removeAuthor(id);
	}
	
	@PutMapping("/update")
	public List<Author> updateAuthor(@RequestParam int id, @RequestParam(required = false) String firstName,@RequestParam(required = false) String lastName,@RequestParam(required = false) String dateOfBirth ){
		return authorServices.updateAuthor(id, firstName, lastName, dateOfBirth);
		
	}
}