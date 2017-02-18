public class testshape
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle(4,4,5);
		System.out.println(t.getArea() + " permi " + t.getPerimeter());

		Circle c = new Circle(6);
		System.out.println(c.getArea() + " permi " + c.getPerimeter());

		Rectangle r = new Rectangle(5,4);
		System.out.println(r.getArea() + " permi " + r.getPerimeter());

	}
}