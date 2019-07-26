package com.psl.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSorting 
{
	static Map<String, String> sorted = new LinkedHashMap<String, String>();
	static Map<String, String> map = new HashMap<String, String>();

	
	static void mySort()
	{		
		Set<String> keySet = map.keySet();
		if(!keySet.isEmpty())
		{
			double max = 0.0;
			String maxKey = null;
			String value;
			
			for(String key : keySet)
			{
				value = map.get(key);
				if(Double.valueOf(value.split("-")[0]) >= max)
				{
					max = Double.valueOf(value.split("-")[0]);
					maxKey = key;
				}
			}
			sorted.put(maxKey, map.get(maxKey));
			map.remove(maxKey);
			//keySet = map.keySet();
			mySort();

		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		map.put("Dirshyam", "9000-Super Hit");
		map.put("Kite", "400-Average");
		map.put("Dabang", "5000-Hit");
		map.put("Dangal", "7000-Super Hit");
		map.put("XYZ", "10-Flop");
		
		
		
		System.out.println("Before Sort");
		System.out.println(map);
		System.out.println("\n\n");
		
		mySort();

		System.out.println("After Sort");
		System.out.println(sorted);
		System.out.println("\n\n");

		
		
//		//Make list using mao.entry
//		List<Map.Entry<String, String>> list = new LinkedList<Map.Entry<String,String>>(map.entrySet());
//		
//		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
//			
//			@Override
//			public int compare(Map.Entry<String, String> o1,
//					Map.Entry<String, String> o2) {
//			 	// TODO Auto-generated method stub
//				
//				String stro1 = o1.getValue();
//				String stro2 = o2.getValue();
//				double amto1 = Double.valueOf(stro1.split("-")[0]);
//				double amto2 = Double.valueOf(stro2.split("-")[0]);
//				
//				if(amto2 > amto1)
//					return 1;
//				else if(amto2 < amto1)
//					return -1;
//				else if(amto2 == amto1)
//					return 0;
//				
//				return 0;
//			}
//			
//		});
//		
//		
//		Map<String, String> sortedMap = new LinkedHashMap<String, String>();
//		
//		for(Map.Entry<String, String> entry : list)
//		{
//			sortedMap.put(entry.getKey(), entry.getValue());
//		}
//		
//		
//		System.out.println("After Sort\n");
//		System.out.println(sorted);
		
	}

}
