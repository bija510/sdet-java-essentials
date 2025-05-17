package com.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class InsertDataToTableTest {

	private static String hostName = "localhost";
	private static String portNum = "3306";
	private static String dataBaseName = "/cityhospital";
	private static String userName = "root";
	private static String password = "12345";

	@Test
	public void insertDataIntoTableEmployee() {

		  // SQL INSERT statement
        String insertSQL = """
            INSERT INTO employee (id, name, age, sex, title) VALUES
            (1, 'Alice Johnson', 30, 'F', 'QA Engineer'),
            (2, 'Bob Smith', 35, 'M', 'Automation Lead'),
            (3, 'Carol Davis', 28, 'F', 'Test Analyst'),
            (4, 'David Lee', 40, 'M', 'Senior QA Engineer'),
            (5, 'Eva Chen', 26, 'F', 'Junior Tester');
            """;

		try (Connection con = DriverManager.getConnection("jdbc:mysql://" + hostName + ":" + portNum + dataBaseName,
				userName, password); Statement s = con.createStatement();) {

			 // Execute the insert statement
            int rowsInserted = s.executeUpdate(insertSQL);
            System.out.println(rowsInserted + " rows inserted into the 'employee' table.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
