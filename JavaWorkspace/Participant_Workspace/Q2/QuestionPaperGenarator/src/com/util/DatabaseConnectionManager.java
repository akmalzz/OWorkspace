package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Override and implement all the methods of DBConnectionUtil here to create and close db connection 
public class DatabaseConnectionManager implements DBConnectionUtil {

	Connection con = null;
	@Override
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questiondb", "root", "root");
		
		return con;
	}

	@Override
	public void closeConnection() throws SQLException {
		// TODO Auto-generated method stub
		if(con!=null)
			con.close();
	}


}
