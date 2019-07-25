import esg.itp.shape.Rectangle;
import esg.itp.shape.Square;



public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Square s = new Square(10.0f);
		s.calcArea();
		s.calcPeri();
		s.display();
		
		Rectangle r = new Rectangle(4,5);
		r.calcArea();
		r.calcPeri();
		r.display();
	}

}
