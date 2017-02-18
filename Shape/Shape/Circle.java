public class Circle implements Shape
{
	private double diameter;
	private double pi;
	public Circle()
	{
		diameter = 1;
		pi = Math.PI;
	}

	public Circle(double diameter)
	{
		this.diameter = diameter;
		pi = Math.PI;
	}

	public double getArea()
	{
		return pi*Math.pow(diameter/2,2);
	}

	public double getPerimeter()
	{
		return (pi*(diameter/2)*2);
	}
}