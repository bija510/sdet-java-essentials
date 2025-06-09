package com.mysql.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class CreateTabelTest {

	private static String hostName = "localhost";
	private static String portNum = "3306";
	private static String dataBaseName = "/cityhospital";
	private static String userName = "root";
	private static String password = "12345";
	
	@Test
	public void createTableEmployee() {
		
		// SQL statement to create the employee table
		String createTableSQL = """
				CREATE TABLE employee (
				    id INT PRIMARY KEY,
				    name VARCHAR(100),
				    age INT,
				    sex CHAR(1),
				    title VARCHAR(100)
				);
				""";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://" +  hostName + ":" +  portNum +  dataBaseName, 
				  userName, password);
				Statement s = con.createStatement();) {

			// Execute the SQL statement
			s.executeUpdate(createTableSQL);
			System.out.println("Table 'employee' created successfully in database 'cityhospital'.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
