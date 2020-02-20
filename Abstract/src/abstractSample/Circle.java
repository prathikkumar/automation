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
		return areaCircle;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		double periCircle=2*pi*radius;
		System.out.println("Circle perimeter : "+periCircle);
		return periCircle;
	}
	
}
