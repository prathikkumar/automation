package abstractSample;

public class Triangle extends Shape
{
	private double length, breadth,c;
	public Triangle(double length, double breadth,double c)
	{
		this.length=length;
		this.breadth=breadth;
		this.c=c;
	}
	@Override
	public double area() 
	{
		double areaTriangle=0.5*length*breadth;
		System.out.println("area of Triangle :"+areaTriangle);
		return areaTriangle;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		double periTriangle=length+breadth+c;;
		System.out.println("perimeter of triangle is : "+periTriangle);
		return periTriangle;
	}
	
}
