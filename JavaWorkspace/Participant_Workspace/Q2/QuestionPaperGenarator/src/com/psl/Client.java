package com.psl;

import java.util.ArrayList;
import java.util.List;

import com.bean.Category;
import com.bean.Complexity;
import com.bean.Criteria;
import com.bean.Question;
import com.util.DataManagerImpl;

public class Client 
{
	public static void main(String[] args) 
	{
		// Call your functionalities from here to test your code.
		List<Criteria> template = new ArrayList<Criteria>();
		
		template.add(new Criteria(Category.GK, Complexity.Simple, 2));		
		template.add(new Criteria(Category.GK, Complexity.Medium, 1));
		template.add(new Criteria(Category.GK, Complexity.Complex, 1));
		template.add(new Criteria(Category.Science, Complexity.Complex, 1));
		template.add(new Criteria(Category.History, Complexity.Medium, 2));
		template.add(new Criteria(Category.History, Complexity.Simple, 2));
		template.add(new Criteria(Category.Geography, Complexity.Medium, 1));
		
		DataManagerImpl d = new DataManagerImpl();
		List<Question> qList  = d.populateData();
		
		for(Question q : qList)
		{
			System.out.println(q);
		}
		System.out.println("\n\n\n\n\n");
		for(Question q : d.generateQuestionPaper(qList, template))
		{
			System.out.println(q);
		}
		
	}
}
