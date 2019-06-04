package com.csv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.csv.book.Book;

@Repository
public class InsertDataDaoImpl implements InsertDataDao {

	public void save(Book book) throws Exception {
		//System.out.println(book);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		  
		PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?,?)");  
		
		stmt.setInt(1,book.getBookId());//1 specifies the first parameter in the query  
		stmt.setString(2,book.getBookName());  
		 stmt.setString(3, book.getAuthorName());
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		  
		con.close();  
		  
		
	}

	
}
