package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.bean.Category;
import com.bean.Complexity;
import com.bean.Criteria;
import com.bean.Question;

// Override and implement all the methods of DataManager Interface here
public class DataManagerImpl implements DataManager {

	@Override
	public List<Question> populateData() 
	{
		// TODO Auto-generated method stub
		List<Question> mlist = new ArrayList<Question>();
		
		PreparedStatement preparedStatement = null;
		
		String query = "select * from questionbank";
		DatabaseConnectionManager d = new DatabaseConnectionManager();
		Connection con = null;
		Question q = null;
		
		try 
		{
			con = d.getConnection();
			preparedStatement = con.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				q = new Question();
				q.setSrno(resultSet.getInt(1));
				q.setQuestion(resultSet.getString(2));
				q.setOption1(resultSet.getString(3));
				q.setOption2(resultSet.getString(4));
				q.setOption3(resultSet.getString(5));
				q.setOption4(resultSet.getString(6));
				q.setCorrectAns(resultSet.getString(7));
				for(Category c: Category.values())
				{
					if(c.toString().equals(resultSet.getString(8)))
						q.setType(c);
				}
				for(Complexity c: Complexity.values())
				{
					if(c.toString().equals(resultSet.getString(9)))
						q.setComplexity(c);
				}
				mlist.add(q);
			}
			
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				d.closeConnection();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return mlist;
	}

	@Override
	public List<Question> getQuestionByCategory(Category category,
			List<Question> questionsList) {
		
		List<Question> sList = new ArrayList<Question>();
		
		for(Question q : questionsList)
		{
			if(category.equals(q.getCategory()))
				sList.add(q);
		}
		// TODO Auto-generated method stub
		return sList;
	}

	@Override
	public List<Question> getQuestionByComplexity(Complexity complexity,
			List<Question> questionsList) {
		// TODO Auto-generated method stub
		
		List<Question> sList = new ArrayList<Question>();
		
		for(Question q : questionsList)
		{
			if( complexity.equals(q.getComplexity()) )
				sList.add(q);
		}
		// TODO Auto-generated method stub
		return sList;
	}

	@Override
	public Set<Question> generateQuestionPaper(List<Question> list,
			List<Criteria> template) {
		// TODO Auto-generated method stub
		Set<Question> qSet = new LinkedHashSet<Question>();
		
		List<Question> tQList = null;
		int count = 0;
		int size;
		int index;
		for(Criteria c: template)
		{
			tQList = new ArrayList<Question>();
			for(Question q : list)
			{
				if(c.getComplexity().equals(q.getComplexity()) && c.getCategory().equals(q.getCategory()))
					tQList.add(q);
			}
			count += c.getNoOfQuestion();
			while(count!=qSet.size())
			{
				//System.out.println("Count : " + count);
				size= tQList.size();
				//System.out.println("Size : " + size);
				index = (int)Math.floor(Math.random() * (double)size);
				//System.out.println("Index : "+ index);
				qSet.add(tQList.get(index));
			}
		}
		
		
		
		return qSet;
	}

	@Override
	public void sortByCategory(List<Question> questionList) 
	{ 
		// TODO Auto-generated method stub
		questionList.sort(new Comparator<Question>() {
			@Override
			public int compare(Question o1, Question o2) {
				// TODO Auto-generated method stub
				return o1.getCategory().toString().compareTo(o2.getCategory().toString());
			}
		});
		
	}

	@Override
	public void sortByComplexity(List<Question> questionList) 
	{
		// TODO Auto-generated method stub
		questionList.sort(new Comparator<Question>() {
			
			@Override
			public int compare(Question o1, Question o2) {
				// TODO Auto-generated method stub
				return o1.getComplexity().toString().compareTo(o2.getComplexity().toString());
			}
		});
	}


}