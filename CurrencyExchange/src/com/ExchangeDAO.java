
package com;
import java.sql.*;

public class ExchangeDAO {

	private static ExchangeDAO instance = new ExchangeDAO();
	static final String Driver = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/jdbcdb";
	static final String user = "root";
	static final String password = "password";
	
	private Connection createConnection() {
		
		try {
			Class.forName(Driver);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, user, password);
		}
		catch(SQLException e) {
			System.out.println("ERROR: Unable to connect to database");
		}
		
		return connection;
	}
	
	public Connection getConnection() {
		return instance.createConnection();
	}
	
}
