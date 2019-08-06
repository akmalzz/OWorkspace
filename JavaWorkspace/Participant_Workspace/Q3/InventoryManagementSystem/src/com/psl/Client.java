package com.psl;

import java.util.List;

import com.bean.Item;
import com.exception.NoDataFoundException;
import com.util.InventoryServiceImpl;

public class Client {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// Call all the functionalities from here to test your code.
		InventoryServiceImpl impl = new InventoryServiceImpl();
		
		List<Item> itemList = impl.readAllItemsFromDb();
		
		for(Item i : itemList)
		{
			System.out.println(i);
		}
		
		impl.calculateExpiryDate(itemList);

		System.out.println("ExpiryAdded...");
		for(Item i : itemList)
		{
			System.out.println(i);
		}

//		impl.removeExpiredItems(itemList);

		impl.sortItems(itemList);
		System.out.println("SortedBasedOnExpiry...");
		for(Item i : itemList)
		{
			System.out.println(i);
		}


		impl.applyDiscount(itemList);
		System.out.println("DiscountApplied...");
		for(Item i : itemList)
		{
			System.out.println(i);
		}
		

		List<Item> sList = null;
		try {
				sList = impl.searchItem("heart", itemList);
		} catch (NoDataFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Searched..");
		for(Item i : sList)
		{
			System.out.println(i);
		}
		
	}
		
}
