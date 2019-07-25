import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo 
{

	public static void main(String[] args) 
	{
		String str = "This is the data to be written in the file";
		byte[] b = str.getBytes();
		// TODO Auto-generated method stub
		FileOutputStream fileOutputStream = null;
		
		try 
		{
			fileOutputStream = new FileOutputStream("fileout", true);
			fileOutputStream.write(b);
			System.out.println("Data Written in file");
		} 
		catch (FileNotFoundException e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fileOutputStream.close();
			} 
			catch (IOException e2) 
			{
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
