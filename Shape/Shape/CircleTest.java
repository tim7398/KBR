import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleTest {
  @Test
  public void evaluatesExpression() {
    Rectangle calculator = new Rectangle(5,6);
    double sum = calculator.getPerimeter();
    assertEquals(22, sum,0);
  }
}