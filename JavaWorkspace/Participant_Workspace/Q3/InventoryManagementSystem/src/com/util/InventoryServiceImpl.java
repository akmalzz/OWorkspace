package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.bean.Item;
import com.exception.NoDataFoundException;

// Override and implement all the methods of DBConnectionUtil Interface in this class
public class InventoryServiceImpl implements InventoryService {

	@Override
	public List<Item> readAllItemsFromDb() {
		// TODO Auto-generated method stub
		
		List<Item> allList = new ArrayList<Item>();
		Connection con = null;
		Item i = null;
		Date d = null;
		String query = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Calendar c = Calendar.getInstance();
		DatabaseConnectionManager dcb = null;
		try 
		{
			dcb = new DatabaseConnectionManager();
			con = dcb.getConnection();
			query = "select * from cheese_tbl";
			
			preparedStatement = con.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			
			while(resultSet.next())
			{
				i = new Item();
				i.setId(resultSet.getInt(1));
				i.setDescription(resultSet.getString(2));
				i.setWeight(resultSet.getFloat(3));
				i.setPrice(resultSet.getFloat(4));
				try 
				{
					i.setManufacturingDate( new SimpleDateFormat("yyyy-MM-dd").parse( new SimpleDateFormat("yyyy-MM-dd").format(resultSet.getDate(5)) ) );
				} 
				catch (ParseException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i.setUseBeforeMonths(resultSet.getInt(6));
				
				try 
				{
					d = new SimpleDateFormat("yyyy-MM-dd").parse( new SimpleDateFormat("yyyy-MM-dd").format(resultSet.getDate(5)) );
				} 
				catch (ParseException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				c.setTime(d);
				c.add(Calendar.MONTH, resultSet.getInt(6));
				i.setExpiryDate(c.getTime());
				
				allList.add(i);

			}				
				
				
			query = "select * from milk_tbl";
			
			preparedStatement = con.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			
			while(resultSet.next())
			{
				i = new Item();
				i.setId(resultSet.getInt(1));
				i.setDescription(resultSet.getString(2));
				i.setWeight(resultSet.getFloat(3));
				i.setPrice(resultSet.getFloat(4));
				try 
				{
					i.setManufacturingDate( new SimpleDateFormat("yyyy-MM-dd").parse( new SimpleDateFormat("yyyy-MM-dd").format(resultSet.getDate(5)) ) );
				} 
				catch (ParseException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i.setUseBeforeMonths(resultSet.getInt(6));
				
				try 
				{
					d = new SimpleDateFormat("yyyy-MM-dd").parse( new SimpleDateFormat("yyyy-MM-dd").format(resultSet.getDate(5)) );
				} 
				catch (ParseException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				c.setTime(d);
				c.add(Calendar.MONTH, resultSet.getInt(6));
				i.setExpiryDate(c.getTime());
				
				allList.add(i);
 				
			}
				

			query = "select * from wheat_tbl;";
			
			preparedStatement = con.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			
			while(resultSet.next())
			{
				i = new Item();
				i.setId(resultSet.getInt(1));
				i.setDescription(resultSet.getString(2));
				i.setWeight(resultSet.getFloat(3));
				i.setPrice(resultSet.getFloat(4));
				try 
				{
					i.setManufacturingDate( new SimpleDateFormat("yyyy-MM-dd").parse( new SimpleDateFormat("yyyy-MM-dd").format(resultSet.getDate(5)) ) );
				} 
				catch (ParseException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i.setUseBeforeMonths(resultSet.getInt(6));
				
				try 
				{
					d = new SimpleDateFormat("yyyy-MM-dd").parse( new SimpleDateFormat("yyyy-MM-dd").format(resultSet.getDate(5)) );
				} 
				catch (ParseException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				c.setTime(d);
				c.add(Calendar.MONTH, resultSet.getInt(6));
				i.setExpiryDate(c.getTime());
				
				allList.add(i);
 				
			}
			
			
			
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				dcb.closeConnection();
				preparedStatement.close();
				resultSet.close();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return allList;
	}

	@Override
	public void calculateExpiryDate(List<Item> items) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		
		for(Item i : items)
		{
			c.setTime(i.getManufacturingDate());
			c.add(Calendar.MONTH, i.getUseBeforeMonths());
			i.setExpiryDate(c.getTime());
		}
		
	}

	@Override
	public void removeExpiredItems(List<Item> items) {
		// TODO Auto-generated method stub
		Date d = new Date();
		List<Item> tempList = new ArrayList<Item>();
		tempList.addAll(items);
		for(Item i : items)
		{
			if(d.getTime() >= i.getExpiryDate().getTime())
				tempList.remove(i);
		}
		items.clear();
		items.addAll(tempList);
		
	}

	@Override
	public void sortItems(List<Item> items) {
		// TODO Auto-generated method stub
		
		Collections.sort(items, new Comparator<Item>() {
			
			@Override
			public int compare(Item o1, Item o2) {
				// TODO Auto-generated method stub
				
				if( o1.getExpiryDate().getTime() > o2.getExpiryDate().getTime() )
					return -1;
				else if( o1.getExpiryDate().getTime() < o2.getExpiryDate().getTime() )
					return 1;
				else
					return 0;
			}
			
		});
		
	}

	@Override
	public void applyDiscount(List<Item> items) {
		// TODO Auto-generated method stub
	
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 6);
		for(Item i : items)
		{
			if(i.getExpiryDate().getTime() <= c.getTimeInMillis())
				i.setPrice( i.getPrice() * 0.80f );			
		}
		
		
	}

	@Override
	public List<Item> searchItem(String ItemType, List<Item> list)
			throws NoDataFoundException {
		// TODO Auto-generated method stub
		List<Item> sList = new ArrayList<Item>();
		
		for(Item i : list)
		{
			if(i.getDescription().contains(ItemType))
				sList.add(i);
		}
		
		if(sList.isEmpty())
			throw new NoDataFoundException();
		
		return sList;
	}
		
}
