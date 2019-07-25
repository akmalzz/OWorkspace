package esg.itp.shape;

public class Square 
{
	float side;
	float area, perimeter;
	public Square(float s)
	{
		side = s;
	}
	public void calcArea()
	{
		area = side * side;
	}
	public void calcPeri()
	{
		perimeter = 4*side;
	}
	public void display()
	{
		System.out.println("Area of Square : " + area );
		System.out.println("Perimeter of Square : " + perimeter );
	}
	
}
