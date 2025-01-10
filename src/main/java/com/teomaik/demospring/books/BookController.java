package com.teomaik.demospring.books;
import java.util.List;

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

import com.teomaik.demospring.authors.Author;
import com.teomaik.demospring.themes.Theme;
import com.teomaik.demospring.themes.ThemeServices;


@RestController
@RequestMapping("books")
public class BookController {
	
	@Autowired
	BookServices bookServices;
	@Autowired
	ThemeServices themeServices;
	
	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		return bookServices.getAllBooks();
	}
	
	@PostMapping("/add")
	public List<Book> addBook(@RequestBody Book b){
		return bookServices.addBook(b);
	}
	
	@DeleteMapping("/delete")
	public List<Book> deleteBook(@RequestParam Integer id){
		return bookServices.removeBook(id);
	}
 	
	@PutMapping("/update")
	public List<Book> updateBook(@RequestParam Integer id ,@RequestParam(required = false) String title,@RequestParam(required = false) Author author,@RequestParam(required = false) String publiser,@RequestParam(required = false) Integer publishYear,@RequestParam(required = false) String description,
			@RequestParam(required = false) List<Theme> theme){
		int newyear=0;
		if(publishYear != null) {
			newyear=publishYear;
		}
		return bookServices.updateBook(id, title, author, publiser, newyear, description, theme);
	}
	
	@PutMapping("/addTheme")
	public List<Book> addThemeToBook(@RequestParam Integer idBook,@RequestParam Integer idTheme){
		return bookServices.addTheme(idBook, idTheme);
	}
	
	
}