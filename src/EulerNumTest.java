import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

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
  public void calculate99() {
    BigDecimal euler = EulerNum.calculate(99);
    BigDecimal stock = new BigDecimal(0);
    assertEquals(stock, euler);
  }
  
  @Test
  public void calculate100() {
    BigDecimal euler = EulerNum.calculate(100);
    Ex1 ex1 = new Ex1();
    BigDecimal stock = ex1.getEuler(100);
    assertEquals(stock.setScale(0), euler.setScale(0));
  }
  
  @Test
  public void calculateUpTo100() {
    Ex1 ex1 = new Ex1();
    List<BigDecimal> stocks = new ArrayList<BigDecimal>();
    List<BigDecimal> eulers = new ArrayList<BigDecimal>();
    for (int i=0;i<=100;i++) {
      BigDecimal stock = ex1.getEuler(i);
      stocks.add(stock.setScale(0));
      BigDecimal euler = EulerNum.calculate(i);
      eulers.add(euler.setScale(0));
    }
    assertArrayEquals(stocks.toArray(), eulers.toArray());
  }
  
  @Test
  public void performance100_stock() {
    Ex1 ex1 = new Ex1();
    BigDecimal stock = ex1.getEuler(100);
  }
  
  @Test
  public void performance100_euler() {
    EulerNum.clearCache();
    BigDecimal euler = EulerNum.calculate(100);
  }
  
}
