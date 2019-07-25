import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		
		try 
		{
			fileInputStream = new FileInputStream("fileout");
			int data;
			while((data = fileInputStream.read()) != -1 )
				System.out.print((char) data);
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
				fileInputStream.close();
			} 
			catch (IOException e2) 
			{
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
