package com.psl.jdbc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie 
{
	void displayTodayMovie(String mDate)
	{

		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to write");
			System.out.println(con.getClass().getName());
			
			String query;
			
			query = "select * from movies where release_date=?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, mDate);
			
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt(1)+"\t");
				System.out.print(resultSet.getString(2) + "\t");
				System.out.print(resultSet.getString(3) + "\t");
				System.out.print(resultSet.getString(4) + "\t");
				System.out.println();
			}
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
			catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		
		
	}
	
	void displayMoviesOfLanguage(String language)
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to write");
			System.out.println(con.getClass().getName());
			
			String query;
			
			query = "select * from movies where language=?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, language);
			
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt(1)+"\t");
				System.out.print(resultSet.getString(2) + "\t");
				System.out.print(resultSet.getString(3) + "\t");
				System.out.print(resultSet.getString(4) + "\t");
				System.out.println();
			}
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
			catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}
	String[] getAllLanguages()
	{
	
		Connection con = null;
		String[] languages = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to write");
			System.out.println(con.getClass().getName());
			
			String query = "select distinct language from movies";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			StringBuilder sb = new StringBuilder();
			while(resultSet.next())
			{
				sb.append(resultSet.getString(1)).append("#");
			}
			
			languages = sb.toString().split("#");
		
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
			catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		return languages;
	}

	void display()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to write");
			System.out.println(con.getClass().getName());
			
			String query = "select * from movies";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt(1)+"\t");
				System.out.print(resultSet.getString(2) + "\t");
				System.out.print(resultSet.getString(3) + "\t");
				System.out.print(resultSet.getString(4) + "\t");
				System.out.println();
			}
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
			catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		
	}
	void addDataInMovietable(String movieId, String name, String language, String date)
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to write");
			System.out.println(con.getClass().getName());
			
			String query;
			
			if(movieId!=null)
				query = "insert into movies values(?,?,?,?)";
			else
				query = "insert into movies(movie_name, language, release_date) values(?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(query);
			if(movieId!=null)
			{
				statement.setInt(1, Integer.valueOf(movieId));
				statement.setString(2, name);
				statement.setString(3, language);
				statement.setString(4, date);
			}
			else
			{
				statement.setString(1, name);
				statement.setString(2, language);
				statement.setString(3, date);
			}
			int records = statement.executeUpdate();
			if(records > 0)
				System.out.println("1 record inserted");
			else
				System.out.println("record not inserted");

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
			catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	void addMoviesFromFile(String filename)
	{
		InputStream inputStream = null;
		BufferedReader bufferedReader = null;
		String[] data = null;
		
		try 
		{
			inputStream = new FileInputStream(filename);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line;
			while( (line=bufferedReader.readLine()) != null)
			{
				data = line.split(",");
				addDataInMovietable(data[0], data[1], data[2], data[3]);
			}
			
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		finally
		{
			if(data != null)
			{
				try 
				{
					inputStream.close();
					bufferedReader.close();
					
				} 
				catch (IOException e2) 
				{
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}
