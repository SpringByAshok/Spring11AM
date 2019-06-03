package com.csv.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.csv.configurer.ConfigurationFile;
import com.csv.service.ReadingValues;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationFile.class);
		ReadingValues read = context.getBean(ReadingValues.class);
		read.readingValuesFromCSV();
		
		
	}
	
	

}
