package abstractSample;

public class Circle extends Shape
{
	
	private double radius;
	public Circle(double radius)
	{
		this.radius=radius;
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double areaCircle=pi*Math.pow(radius, 2);
		System.out.println("Circle Radius : "+areaCircle);
		System.out.println("this is line 1");
		System.out.println("this is line 3");
		System.out.println("this is line 4");
		System.out.println("this is line 5");
		System.out.println("this is line 6");
		return areaCircle;
	}
	
	public void demo()
	{
		System.out.println("this is a demo function");
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		double periCircle=2*pi*radius;
		System.out.println("Circle perimeter : "+periCircle);
		return periCircle;
	}
	
}
