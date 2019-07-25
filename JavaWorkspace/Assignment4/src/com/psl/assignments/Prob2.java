package com.psl.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob2 
{

	private static void writeToFile(String filename, String data) 
	{
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		
		try 
		{
			fileWriter = new FileWriter(filename, false);
			fileWriter.write(data);
		} 
		catch (IOException e) 
		{
			// TODO: handle exception
			System.out.println("Error in putting data in file");
		}
		finally
		{
			try 
			{
				fileWriter.close();
			} 
			catch (IOException e2) 
			{
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	private static long getFileSize(String filename) 
	{
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		long sizeOfFile = 0;

//		try 
//		{
//			File file = new File(filename);
//			sizeOfFile = file.length();
//		} 
//		catch (Exception e) 
//		{
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		try 
		{
			fileInputStream = new FileInputStream(filename);
			sizeOfFile = fileInputStream.getChannel().size();
			//System.out.println("Size of File " + filename + " is : "+sizeOfFile);
		} 
		catch (FileNotFoundException e) 
		{			
			// TODO: handle exception
			System.out.println("File not found for finding out it's size ");
		}
		catch(IOException e)
		{
			System.out.println("Ptoblem with IO stuff");
		}
		finally
		{
			if(sizeOfFile > 0)
			{
				try 
				{
					fileInputStream.close();
				} 
				catch (IOException e2) 
				{
					// TODO: handle exception
					e2.printStackTrace();
				}				
			}
		}
		return sizeOfFile;
	}
	
	private static String getContentsFromFile(String filename) 
	{
		InputStream inputStream = null;
		BufferedReader bufferedReader = null;
		String data = null;
		try 
		{
			inputStream = new FileInputStream(filename);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			StringBuilder sb = new StringBuilder();
			String line = " ";
			
			while( (line=bufferedReader.readLine()) != null)
			{
				sb.append(line).append("\n");
			}
			
			data = sb.toString();
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Problem while reading data from file");
			e.printStackTrace();
		}
		finally
		{
			if(data != null)
			{
				try 
				{
					inputStream.close();
					bufferedReader.close();
					
				} 
				catch (IOException e2) 
				{
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
		 return data; 
		// TODO Auto-generated method stub
		
	}
	
	private static boolean deleteFile(String filename) 
	{
		// TODO Auto-generated method stub
		boolean deleted = false;
		try
		{
			File file = new File(filename);
			deleted = file.delete();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return deleted;

	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String filename = "io.txt";
		boolean getOut = false;
		int choice;
		
		while(getOut != true)
		{
			System.out.println("1.Create File and Write in it\n2.See size of that file\n3.Read contents from the file and display them\n4.Delete the file");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1:
				 	System.out.println("Eneter your data");
					String inputFromUser;
					sc.nextLine();
					inputFromUser = sc.nextLine();
					writeToFile(filename, inputFromUser);
				 
				 break;
				 
			 case 2:
					long lengthOfFile = getFileSize(filename);
					System.out.println("Size of File " + filename + " is : "+lengthOfFile);
				 
				 break;
				 
			 case 3:
					String data = getContentsFromFile(filename);
					if(data != null)
						System.out.println("Data from file "+ filename + " :\n" + data);
					else
						System.out.println("No Data found in "+ filename);
				 
				 break;
				 
			 case 4:
					boolean fileDeleted = deleteFile(filename);
					if(fileDeleted)
						System.out.println("Your file " + filename + " is deleted");
					else
						System.out.println("Your file "+ filename + "is not deletd May be it is not present there");
				 
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
