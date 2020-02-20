package abstractSample;

public class InvokeShape {

	public static void main(String[] args) 
	{
		double width=5, length=3;
		Shape rect=new Rectangle(length, width);
		Shape circ=new Circle(3);
		Shape tri=new Triangle(5, 5, 5);
		rect.area();
		rect.perimeter();
		circ.area();
		circ.perimeter();
		tri.area();
		tri.perimeter();
	}

}
