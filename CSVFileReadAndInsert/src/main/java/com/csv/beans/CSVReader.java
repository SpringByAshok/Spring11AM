package com.csv.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.csv.book.Book;

@Component
public class CSVReader {
	
	List<Book> books = new ArrayList<Book>();

	public List<Book> readCSVFile(String csvFileName) throws Exception{
		
	
		FileReader fileReader = new FileReader(csvFileName);
		
		//reading values from Book.csv
		BufferedReader bufferReader = new BufferedReader(fileReader);
		
		//read single line  
		String br = bufferReader.readLine();
		
		while(!(br == null)) {
			 
			//splitting values by using delimeter (,) separator
			 String[] str = br.split(",");
			 br =bufferReader.readLine();
			 
			 Integer bookId = Integer.parseInt(str[0]); 
			 String bookName = str[1];
			 String authorName = str[2];
			 
			 //assgining values to object
			Book book = new Book(bookId, bookName, authorName);
			books.add(book);
			 //System.out.println(book);
		} 
		
		return books;
		

	}

}
