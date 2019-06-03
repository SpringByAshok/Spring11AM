package com.csv.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csv.model.Book;

@Service
public class ReadingValues {
	
	public ReadingValues() {
		System.out.println("ReadingValues :: constructor ");
	}
	
@Autowired
	private Book book;
	
	public void readingValuesFromCSV() throws IOException {
	
		

		
		try { 
	        BufferedReader bReader = new BufferedReader(new FileReader("E:/Ashok Sir Resources/Book.csv") );
	        String line = ""; 
	        while ((line = bReader.readLine()) != null) {
	            try {

	                if (line != null) 
	                {
	                    String[] array = line.split(",+");
	                    for(String result:array)
	                    {
	                        //System.out.println(result);
	 /*//Create preparedStatement here and set them and excute them
	                PreparedStatement ps = yourConnecionObject.createPreparedStatement(sql);
	                 ps.setString(1,str[0]);
	                 ps.setString(2,str[1]);
	                 ps.setString(3,str[2]);
	                 ps.setString(4,strp[3])
	                 ps.excuteUpdate();
	                 ps. close()*/
	   //Assuming that your line from file after split will folllow that sequence
	                        
	                      /* String strArray[] = result.split("/n");
	                		
	                		
	                		//print elements of String array
	                		for(int i=0; i < strArray.length; i++){
	                			System.out.println(strArray[i]);
	                			
	                			book.setBookName(strArray[0]);
	                			book.set
	                		}
*/
	                    }
	                } 
	            }
	            finally
	            {
	               if (bReader == null) 
	                {
	                    bReader.close();
	                }
	            }
	        }
	    } catch (FileNotFoundException ex) {
	        ex.printStackTrace();
	    }
		
		
	}

}
