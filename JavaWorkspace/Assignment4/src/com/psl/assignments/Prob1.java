package com.psl.assignments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob1 
{
	private static  String readFile(String sourceFile) 
	{
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		char[] fileData = new char[63];
		int i = 0;
		String str = "nofile";
		
		try 
		{
			fileReader = new FileReader(sourceFile);
			int data;
			while( (data = fileReader.read()) != -1 )
				fileData[i++] = (char) data;
			str = String.valueOf(fileData);
			//System.out.println(str);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO: handle exception
			System.out.println("Source File is not there");
		}
		catch(IOException e)
		{
			System.out.println("Problem in Input and Output");
		}
		finally
		{
			try 
			{
				fileReader.close();
			} 
			catch (IOException e2) 
			{
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		return str;

	}
	private static boolean isFilePresent(String filename) 
	{
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		boolean filePresent = false;
		
		try {
			fileReader = new FileReader(filename);
			if(fileReader.read()!= -1)
				filePresent = true;
		}
		catch (FileNotFoundException e) 
		{
			// TODO: handle exception
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			if(filePresent == true)
			{
				try {
					fileReader.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
		return filePresent;
	}
	
	private static void writeFile(String destination, String data) 
	{
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		
		try 
		{
			fileWriter = new FileWriter(destination, false);
			fileWriter.write(data);
		} 
		catch (IOException e) 
		{
			// TODO: handle exception
			System.out.println("Problem in writing Destination File");
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
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		String sourceFile = args[0];
//		String destinationFile = args[1];

		String sourceFile = "inputFile";
		String destinationFile = "outputFile";
		String dataFromFile = readFile(sourceFile);
		String choice="no";
		if(dataFromFile.equals("nofile"));
		else
			System.out.println(dataFromFile);
		boolean filePresent = isFilePresent(destinationFile);
		Scanner sc = new Scanner(System.in);
		if(filePresent)
		{
			System.out.println("Output file exists do you want to overwrite it (Yes/No)");
			choice = sc.next();
		}
		if(choice.toLowerCase().equals("yes") || filePresent==false)
		{
			writeFile(destinationFile, dataFromFile);
		}
		System.out.println("Destination file creted and successfully written in the file");
		sc.close();
	}

}
