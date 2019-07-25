import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Welcome to Java";
		FileWriter fileWriter = null;
		
		try 
		{
			fileWriter = new FileWriter("filewrite");
			fileWriter.write(str);
			System.out.println("String Written in File");
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
				fileWriter.close();
			} 
			catch (IOException e2) 
			{
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
