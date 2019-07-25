import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		
		try 
		{
			fileReader = new FileReader("filewrite");
			int data;
			while( (data = fileReader.read()) != -1 )
				System.out.print((char) data);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (IOException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			try {
				fileReader.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
