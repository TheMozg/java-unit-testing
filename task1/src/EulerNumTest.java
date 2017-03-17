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
  public void calculate99() {
    BigDecimal euler = EulerNum.calculate(99);
    BigDecimal stock = new BigDecimal(0);
    assertEquals(stock, euler);
  }
  
  @Test
  public void calculate100() {
    EulerNum.clearCache();
    BigDecimal euler = EulerNum.calculate(100);
    BigDecimal stock = new BigDecimal("2903528346661097497054603834764435875077553006646158945080492319146997643370625023889353447129967354174648294748510553528692457632980625125");
    assertEquals(stock.setScale(0), euler.setScale(0));
  }
  
}
