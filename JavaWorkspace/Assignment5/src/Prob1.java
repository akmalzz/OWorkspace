import java.util.ArrayList;
import java.util.List;


public class Prob1 
{

	private static void init(List<String> studNames) 
	{
		// TODO Auto-generated method stub
		studNames.add("akmal");
		studNames.add("Prasad");
		studNames.add("Ajinkya");
		studNames.add("Prattyusha");
		studNames.add("Amita");
	}
	private static void findInList(List<String> studNames, String findStud) 
	{
		// TODO Auto-generated method stub
		boolean isPresentInList = false;
		
		isPresentInList = studNames.contains(findStud);
		
		if(isPresentInList)
			System.out.println("Yes '"+findStud+"' is Present in the list");
		else
			System.out.println("No '"+findStud+"' is Not Present in the list");

	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> studNames = new ArrayList<String>();
		init(studNames);
		System.out.println(studNames);
		
		findInList(studNames, "james");
		findInList(studNames, "akmal");
	}

}
