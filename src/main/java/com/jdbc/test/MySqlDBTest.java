package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MySqlDBTest {
	
	/**
	 * @param args
	 */
	static String host = "localhost:3306/";
	static String dbName = "testdb?";
	static String uname = "root";
	static String pass = "root";
	
	public static void dbConnect(String query) throws SQLException {
		
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://" + host + dbName + "user=" + uname + "&password=" + pass);
		System.out.println("Connection done");
		
		Statement stmt = null;
		ResultSet rs = null;
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				if (i > 1)
					System.out.print(",  ");
				String columnValue = rs.getString(i);
				System.out.print(columnValue + " " + rsmd.getColumnName(i));
			}
			System.out.println("");
		}
		
	}
	@Test
	public void allEmployeeTest() throws SQLException{
		dbConnect("select * from EMP_TBL");
		dbConnect("select email from emp_tbl where id=1");
		//Assert.assertEquals("sagar@gmail.com", dbConnect("select email from emp_tbl where id=1"));
	}


}
