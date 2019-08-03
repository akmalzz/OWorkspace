package com.psl;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.util.DataManager;
import com.util.DataManagerImpl;


public class Client {
	
	public static void main(String[] args) {
		//Call your methods from here  to test the code implemented
		
		Map<String, List<String>> scMap = null;
		DataManagerImpl d = new DataManagerImpl();
		try 
		{
			scMap = d.populateCityDataMap("StateCityDetails.txt");
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> keys = scMap.keySet();
		
		for(String key : keys)
		{
			System.out.print("Key : "+key+"\t : ");
			for(String city : scMap.get(key))
			{
				System.out.print(city + "  ");
			}
			System.out.println();
		}
		
		
	}
}