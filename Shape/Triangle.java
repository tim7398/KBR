public class Triangle implements Shape
{
	private double a,b,c;
	
	public Triangle()
	{
		a = 1;
		b = 1;
		c = 1;
	}

	public Triangle(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getArea()
	{
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	public double getPerimeter() //using herons formula 
	{
		return (a+b+c);
	}

}

