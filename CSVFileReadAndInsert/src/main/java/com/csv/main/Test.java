package com.csv.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.csv.beans.CSVReader;
import com.csv.book.Book;
import com.csv.configurer.AppConfig;

public class Test {

	public static void main(String[] args) throws Exception{
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CSVReader csv = context.getBean(CSVReader.class);
		
		
		List<Book> list = csv.readCSVFile("Book.csv");
		
		for(Book b : list) {
			
			System.out.println(b);
		}
		

	}

}
