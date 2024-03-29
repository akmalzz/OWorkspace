package com.psl.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DFileDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		File f  = new File("D:/java/test.txt"); 
//		File f2  = new File("D:\\java\\test.txt");
		File f  = new File("test.txt");
	
		if(f.exists())
			System.out.println("File Exists");
		else
		{
			System.out.println("File does not exists");
			try
			{
				f.createNewFile();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			System.out.println(f.getName());
			System.out.println(f.getPath());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
		}
		
		FileOutputStream fos = null;
		String str = "Writing this text inton file...";
		try 
		{
			fos = new FileOutputStream(f);
			//fos.write(Byte.valueOf(str));
			fos.write(str.getBytes());
		} 
		catch (FileNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
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
				fos.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(f);
			//fos.write(Byte.valueOf(str));
			//System.out.println((char)fis.read());
//			BufferedReader  br = new BufferedReader(new InputStreamReader(fis));
//			
//			String str1 = br.readLine();

			Scanner sc  = new Scanner(new InputStreamReader(fis));
			//Scanner sc2  = new Scanner(fis);//can do like this
			sc.useDelimiter("h");
			while(sc.hasNext())
			{
				System.out.println(sc.next());
			}
			
			//String str1 = sc.nextLine();
			
			//System.out.println(str1);
//			while()
//			{
//				
//			}
			
//			int i  = 0;
//	
//			while((i=fis.read()) != -1)
//			{
//				System.out.println((char) i);
//			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
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
				fis.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

		
	}

}
