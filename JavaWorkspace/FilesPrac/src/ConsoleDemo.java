import java.io.Console;


public class ConsoleDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Console console = System.console();
		String name = console.readLine("Enter Name: ");
		System.out.println(name);
		char ch[] = console.readPassword("Enter Password: ");
		System.out.println(ch);
	}

}
