package abstractSample;

public class Rectangle extends Shape
{
	 private final double width, length;
	public Rectangle (double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	@Override
	public double area() 
	{
		// TODO Auto-generated method stub
		double rectangleArea=length*width;
		System.out.println("Area of rectangle is "+rectangleArea);
		return rectangleArea;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		double peri= 2*(length+width);
		System.out.println("perimeter of Rect is : "+peri );
		return peri;
	}
	
}
