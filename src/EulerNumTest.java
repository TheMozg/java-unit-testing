import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.math.BigDecimal;

public class EulerNumTest {
  @Test
  public void calculate0() {
    BigDecimal euler = EulerNum.calculate(0);
    BigDecimal stock = new BigDecimal(1);
    assertEquals(stock, euler);
  }
  
  @Test
  public void calculate1() {
    BigDecimal euler = EulerNum.calculate(1);
    BigDecimal stock = new BigDecimal(0);
    assertEquals(stock, euler);
  }
  
  @Test
  public void calculate10() {
    BigDecimal euler = EulerNum.calculate(10);
    Ex1 ex1 = new Ex1();
    BigDecimal stock = ex1.getEuler(10);
    assertEquals(stock.setScale(0), euler.setScale(0));
  }
  
  @Test
  public void calculate100() {
    BigDecimal euler = EulerNum.calculate(100);
    Ex1 ex1 = new Ex1();
    BigDecimal stock = ex1.getEuler(100);
    assertEquals(stock.setScale(0), euler.setScale(0));
  }
  
}
