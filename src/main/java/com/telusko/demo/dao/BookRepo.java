package com.telusko.demo.dao;

import com.telusko.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
