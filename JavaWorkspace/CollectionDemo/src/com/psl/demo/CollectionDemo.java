package com.psl.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Harshada");
		list.add("Akash");
		list.add("Aniket");
		list.add("Amogh");
		list.add("Rucha");
		list.add("Kajal");
		
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.remove(1));
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		for(String str : list)
		{
			System.out.println(str);
		}
		
		Iterator<String> itr = list.iterator();
		
//		list.add("Akmal"); will give error as concurrent modification is not allowed
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
//		for(Iterator<String> it = list.iterator(); it.hasNext(); it.next())
//		{
//			System.out.println(it.next());
//		}


		System.out.println("Setsssssssssssssssssssssssssssssssssss");
		
		Set<String> treeSet = new TreeSet<String>();
		
	//	Set<String> concTreeSet = new CopyOnWriteArraySet<String>();
		
		treeSet.add("Harshada");
		treeSet.add("Akash");
		treeSet.add("Aniket");
		treeSet.add("Amogh");
		treeSet.add("Rucha");
		treeSet.add("Kajal");
		treeSet.add("Kajal");
		treeSet.add("Rucha");
		
		System.out.println();
	//	System.out.println(treeSet.get(1));
	//	System.out.println(treeSet.remove(1));
		System.out.println(treeSet.remove("Amogh"));
		
//		for (int i = 0; i < treeSet.size(); i++) 
//		{
//			System.out.println(treeSet.get(i));
//		}
		
		for(String str : treeSet)
		{
			System.out.println(str);
		}
		
		Iterator<String> itr2 = treeSet.iterator();
		
//		treeSet.add("Akmal"); will give error as concurrent modification is not allowed
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}

		
		System.out.println("\n\n\n");
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "Amogh");
		map.put(2, "Akmal");
		map.put(1, "Pushpa");
		map.put(2, "Jmes");
		map.put(3, "Akmal");
		map.put(4, "Sam");
		
		Iterator<Integer> it3 = map.keySet().iterator();
		
		int i = 0;
		while(it3.hasNext())
		{
			i = it3.next();
			System.out.println(i);
			System.out.println(map.get(i));
		}
		Set<Integer> keys = map.keySet();
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Entry<Integer, String>> it4 = entrySet.iterator();
		
		while(it4.hasNext())
		{
			System.out.println(it4.next());
		}
		
		for(Entry<Integer, String> entry: entrySet)
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
