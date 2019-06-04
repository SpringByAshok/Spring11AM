package com.csv.dao;

import org.springframework.stereotype.Repository;

import com.csv.book.Book;

@Repository
public interface InsertDataDao {
	
	public void save(Book book) throws Exception;
}
