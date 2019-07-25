package esg.itp.shape;

public class Rectangle implements Polygon 
{
	float length;
	float breadth;
	float area, perimeter;
	
	public Rectangle(int len, int bre)
	{
		length = (float)len;
		breadth = (float)bre;
	}
	public void calcArea()
	{
		area = length*breadth;
	}
	public void calcPeri()
	{
		perimeter = (2*length)+(2*breadth);
	}
	public void display()
	{
		System.out.println("Area of Rectangle : " + area );
		System.out.println("Perimeter of Rectangle : " + perimeter );
	}
}
