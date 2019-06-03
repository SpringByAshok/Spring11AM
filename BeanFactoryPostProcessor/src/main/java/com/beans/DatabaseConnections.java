package com.beans;

import lombok.Data;

@Data
public class DatabaseConnections {
	
	private String url;
	private String driver;
	private String username;
	private String password;

}
