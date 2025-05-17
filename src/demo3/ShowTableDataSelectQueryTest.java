package com.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class ShowTableDataSelectQueryTest {

	private static String hostName = "localhost";
	private static String portNum = "3306";
	private static String dataBaseName = "/cityhospital";
	private static String userName = "root";
	private static String password = "12345";

	@Test
	public void selectAllFromTableEmployee() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://" +  hostName + ":" +  portNum +  dataBaseName, 
													  userName, password);
		Statement s = con.createStatement();
	
		ResultSet rs =s.executeQuery("select * from employee"); //give all

		while (rs.next()) {
			
			 System.out.println("Id:- " + rs.getString("id"));
			 System.out.println("Name:- " + rs.getString("name"));
			 System.out.println("Age:- " + rs.getString("age")); 
			 System.out.println("Sex:- "+ rs.getString("sex"));
			 System.out.println("Title:- "+ rs.getString("title"));
			 System.out.println("-----------------------");
		}
	}

}
