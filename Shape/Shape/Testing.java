import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testing {
  @Test
  public void evaluatesRectangle() {
    Shape r = new Rectangle(5,6);
    double perimeter = r.getPerimeter();
    assertEquals(22, perimeter,0);

    double area = r.getArea();
    assertEquals(30,area,0);
  }

  @Test
  public void evaluatesCircle() {
    Shape c= new Circle(6);
    double sum = c.getPerimeter();
    assertEquals(6*Math.PI, sum,0);

    double area = c.getArea();
    assertEquals(Math.pow(3,2)*Math.PI,area,0);

  }

   @Test
  public void evaluatesTriangle() {
    Shape t = new Triangle(3,4,5);
    double sum = t.getPerimeter();
    assertEquals(12, sum,0);

    double area = t.getArea();
    assertEquals(6,area,0);
  }
}
