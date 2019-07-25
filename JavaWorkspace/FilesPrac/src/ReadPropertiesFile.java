import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadPropertiesFile 
{
	public void readFile()
	{
		Properties properties = new Properties();
		String filename = "data.properties";
		InputStream inputStream = null;
		
		try 
		{
			inputStream = new FileInputStream(filename);
			properties.load(inputStream);
			
			String val1 = properties.getProperty("property1");
			String val2 = properties.getProperty("property2");
			String val3 = properties.getProperty("property3");
			String val4 = properties.getProperty("property4");
			
			System.out.println("Value 1 :" + val1);
			System.out.println("Value 2 :" + val2);
			System.out.println("Value 3 :" + val3);
			System.out.println("Value 4 :" + val4);
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
				inputStream.close();
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
		ReadPropertiesFile r = new ReadPropertiesFile();
		r.readFile();

	}

}
