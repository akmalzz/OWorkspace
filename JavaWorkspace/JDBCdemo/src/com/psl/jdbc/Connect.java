package com.psl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect 
{

	public static void main(String[] args) 
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
			System.out.println("Connected Bro!!");
			System.out.println(con.getClass().getName());
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				con.close();
			} 
			catch (SQLException e2) 
			{
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

}
