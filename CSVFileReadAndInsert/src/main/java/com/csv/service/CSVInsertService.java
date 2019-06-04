package com.csv.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csv.book.Book;
import com.csv.dao.InsertDataDao;



@Service
public class CSVInsertService {
	
	@Autowired
	private InsertDataDao insertDao;
	


	public void insertData(List<Book> list) throws Exception{
		
		if(!list.isEmpty()) {
			for(Book b : list) {
				//System.out.println(b);
				insertDao.save(b);
			}
		}
		
	}


}
