import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    static List<BigDecimal> eulerNums = new ArrayList<>();

    public static BigDecimal calculate(int n) {
        for (int i = (eulerNums.size() - 1); i <= n; i++) {
            eulerNums.add(EulerNum.calculateEuler(i));
        }
        return eulerNums.get(n);
    }

    public static void main( String[] args )
    {

        BigDecimal euler = EulerNum.calculate(300);
        System.out.println(euler.setScale(2).toPlainString());
        for (int i = 0; i <= 100; i++) {
            euler = EulerNum.calculate(i);
            System.out.println(euler.setScale(2).toPlainString());
        }
    }
}
