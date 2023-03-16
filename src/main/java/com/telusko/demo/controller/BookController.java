package com.telusko.demo.controller;

import com.telusko.demo.dao.BookRepo;
import com.telusko.demo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

@Controller
public class BookController
{
	@Autowired
	BookRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	} //by default this is called

	@RequestMapping("/addBook")
	public String addBook(Book book)
	{
		repo.save(book);
		return "home.jsp"; //addBookForm
	}

	@RequestMapping("/allbooks") //incomplete
	public String allBooks(Model model){
		Iterable<Book> allBooks = repo.findAll();
		model.addAttribute("books", allBooks);

		return "allBooks.jsp";
	}
}
