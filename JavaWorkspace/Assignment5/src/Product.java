import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Product 
{
	String productId, productName;
	Map<String, String> studHashTable = new Hashtable<String, String>();
	
	
	private void addData() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter data type 'done' after any value you want to end");
		int done = 1;
		
		Scanner sc = new Scanner(System.in);
		String tempId,tempName;
		
		while(done==1)
		{
			System.out.println("Enter Prod Id");
			tempId = sc.next();
			System.out.println("Enter Prod Name");
			tempName = sc.next();
			
			studHashTable.put(tempId, tempName);
			System.out.println("Enter '1' if want to continue else '0'");
			done = sc.nextInt();
		}
		//sc.close();//why*
	}
	private void display() 
	{
		// TODO Auto-generated method stub
		Set<String> keys = studHashTable.keySet();
		
		for(String s : keys)
		{
			System.out.print("Prod ID : " + s +" ");
			System.out.println("Prod Name : "+ studHashTable.get(s));
		}
	}
	private void search(String searchKey) 
	{
		// TODO Auto-generated method stub
		if(studHashTable.get(searchKey) != null)
			System.out.println("Prod( "+ searchKey +" ) Found with Name : "+ studHashTable.get(searchKey));
		else
			System.out.println("Prod( "+ searchKey +" ) Not Found ");
	}
	private void remove(String searchKey) 
	{
		// TODO Auto-generated method stub
		if(studHashTable.get(searchKey) != null)
		{
			studHashTable.remove(searchKey);
			System.out.println("Deleted Successfully");
		}
		else
			System.out.println("Prod( "+ searchKey +" ) Not Found ");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Product p = new Product();
		
		Scanner sc = new Scanner(System.in);
		boolean getOut = false;
		int choice;
		
		while(getOut != true)
		{
			System.out.println("1.Add data\n2.Display\n3.Search\n4.Delete");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1:
				 p.addData();
				 
				 break;
				 
			 case 2:
				 p.display();				 
				 break;
				 
			 case 3:
				 	System.out.println("Enter search product using product key");
					String searchKey = sc.next();
					p.search(searchKey);
				 
				 break;
				 
			 case 4:
				 	System.out.println("Enter product key to delete");
					String deleteKey = sc.next();
					p.remove(deleteKey);
				 
				 break;
				 
			 case 5:
				 getOut = true;
				 break;
				 
			 default:
				 System.out.println("Try Something else");
				 break;
			}
		}
				
		sc.close();

	
	}

}
