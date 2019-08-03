package com.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.exception.CityNotFoundException;
import com.exception.InvalidStateException;


// Override and implement the methods of Interface DataManager here 
public class DataManagerImpl implements DataManager {

	@Override
	public Map<String, List<String>> populateCityDataMap(String fileName)
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		Map<String, List<String>> scMap = new HashMap<String, List<String>>();
		List<String> internalList = null;
		InputStream inputStream = null;
		BufferedReader bufferedReader = null;
		
		try 
		{
			inputStream = new FileInputStream(fileName);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
			String line = null;
			String[] data = new String[2];
			while( (line = bufferedReader.readLine()) != null )
			{
				data  = line.split("-");
				if(data.length == 2)
				{				
					internalList = scMap.get(data[0]);
					if(internalList==null)
						internalList = new ArrayList<String>();
					internalList.add(data[1]);
					scMap.remove(data[0]);
					scMap.put(data[0], internalList);
				}
			}
		} 
		catch (IOException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				bufferedReader.close();
				inputStream.close();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return scMap;
	}

	@Override
	public List<String> getCities(Map<String, List<String>> stateCityMap,
			String state) throws InvalidStateException {
		// TODO Auto-generated method stub
		List<String> cities = stateCityMap.get(state);
		if(cities==null)
			throw new InvalidStateException();
		
		return cities;
	}

	@Override
	public String getState(Map<String, List<String>> stateCityMap, String city)
			throws CityNotFoundException {
		// TODO Auto-generated method stub
		Set<String> states = stateCityMap.keySet();
		String foundState = null;
		for(String state : states)
		{
			List<String> cities = stateCityMap.get(state);
			if(cities.contains(city))
			{
				foundState = state;
				break;
			}
		}
		if(foundState==null)
			throw new CityNotFoundException();
		
		return foundState;
	}

}
