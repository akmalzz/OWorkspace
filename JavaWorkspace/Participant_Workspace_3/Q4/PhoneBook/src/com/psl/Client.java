package com.psl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.psl.exception.NoDataFoundException;
import com.psl.util.PhoneBookContacts;
import com.psl.util.PhoneBookContactsImpl;

public class Client {
	
	public static void main(String[] args){
		
		//test your code by calling methods of the PhoneBookContacts from here
		
		PhoneBookContacts contacts=new PhoneBookContactsImpl();
		List<String> list = new ArrayList<String>();
		list.add("9673329383");
		list.add("9890355767");
		contacts.addContact("Akmal", list);
		
		list = new ArrayList<String>();
		list.add("8237773385");
		list.add("8329065533");
		contacts.addContact("Ajinkya", list);
		
		Map<String, List<String>> cMap = contacts.getContactMap();
		Set<String> names = cMap.keySet();
		
		for(String name : names)
		{
			System.out.print(name+" : ");
			System.out.println(cMap.get(name));
		}
		
		try 
		{
			System.out.println(contacts.searchContact("Akmal"));
			//System.out.println(contacts.searchContact("Akram"));
		} 
		catch (NoDataFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
