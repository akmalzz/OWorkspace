package com.psl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Show 
{


	void updateFromShowtable(int showId)
	{
		String[] data = searchShow(showId);
		String[] dataNew = new String[4];
		Scanner sc = new Scanner(System.in);
		
		dataNew[0]="nn";
		
		System.out.println("The data with show Id :"+data[0]+" will be shown enter 'nn' if you dont want to update it");
		System.out.println("Show Time : "+ data[1]+"  Enter new one:");
		dataNew[1] = sc.next();
		System.out.println("Total seats : "+ data[2]+"  Enter new one:");
		dataNew[2] = sc.next();
		System.out.println("MovieId : "+ data[3]+"  Enter new one:");
		dataNew[3] = sc.next();
		
		for (int i = 0; i < dataNew.length; i++) 
		{
			if(dataNew[i].toLowerCase().equals("nn"))
			{
				dataNew[i] = data[i];
			}
		}
		
		updateShow(Integer.valueOf(dataNew[0]), dataNew[1], Integer.valueOf(dataNew[2]), Integer.valueOf(dataNew[3]));
		
		//sc.close();
	}
	
	void updateShow(int showId, String movieTime, int seats, int movieId)
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to write");
			System.out.println(con.getClass().getName());
			
			String query;
			
			query = "update shows set show_time=?, seats=?, mid=? where sid=?";
			
			PreparedStatement statement = con.prepareStatement(query);
			
		
			statement.setString(1, movieTime);
			statement.setInt(2, seats);
			statement.setInt(3, movieId);				
			statement.setInt(4, showId);	
			
			int records = statement.executeUpdate();
			
			if(records > 0)
				System.out.println("record updated");
			else
				System.out.println("record not updated");

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
	
	String[] searchShow(int showId)
	{
		Connection con = null;
		String[] data = new String[4];
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to write");
			System.out.println(con.getClass().getName());
			
			String query = "select sid, show_time, seats, mid from shows where sid="+showId+" " ;
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			resultSet.next();
				
			data[0] = String.valueOf( resultSet.getInt(1) );
			data[1] = resultSet.getString(2);
			data[2] = String.valueOf( resultSet.getInt(3) );
			data[3] = String.valueOf( resultSet.getInt(4) );
		
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
		return data;

		
	}

	void deleteFromShowtable(int showId)
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to delete");
			System.out.println(con.getClass().getName());
			
			String query;
			
			query = "delete from shows where sid=? ";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			statement.setInt(1, showId);
			
			int records = statement.executeUpdate();
			if(records > 0)
				System.out.println("Record Deleted");
			else
				System.out.println("record not found to be deleted");

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

	
	
	void addDataInShowtable(int showId, String movieTime, int seats, int movieId)
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to write");
			System.out.println(con.getClass().getName());
			
			String query;
			
			if(showId != 0)
				query = "insert into shows values(?,?,?,?)";
			else
				query = "insert into shows(show_time, seats, mid) values(?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			if(showId == 0)
			{
				statement.setString(1, movieTime);
				statement.setInt(2, seats);
				statement.setInt(3, movieId);
			}
			else
			{
				statement.setInt(1, showId);
				statement.setString(2, movieTime);
				statement.setInt(3, seats);
				statement.setInt(4, movieId);				
			}
			
			System.out.println(statement.toString());
			
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

	
	void display()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "root");
			System.out.println("Connected to write");
			System.out.println(con.getClass().getName());
			
			String query = "select s.sid, s.show_time, s.seats, m.mid, m.movie_name, m.language from movies m, shows s where s.mid=m.mid;";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt(1)+"\t");
				System.out.print(resultSet.getString(2) + "\t");
				System.out.print(resultSet.getInt(3)+"\t");
				System.out.print(resultSet.getInt(4)+"\t");
				System.out.print(resultSet.getString(5) + "\t");
				System.out.print(resultSet.getString(6) + "\t");
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

	
}
