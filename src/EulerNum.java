import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EulerNum {

    private static BigDecimal getFactorial(int n) {
        BigDecimal factorial = BigDecimal.valueOf(1);

        for (; n > 0; factorial = factorial.multiply(BigDecimal.valueOf(n--))) ;

        return factorial;
    }

    // n and k MUST be positive, or else algorithm won't work right
    private static BigDecimal calculateCoefficient( int n, int k ) {
        BigDecimal result = BigDecimal.valueOf(0);

        if (k >= 0 && k <= n) {
            result = getFactorial(n);
            result = result.divide(getFactorial(k));
            result = result.divide(getFactorial(n-k));
        } else {
            result = BigDecimal.valueOf(0);    
        }

        return result;
    }

    private static List<BigDecimal> eulerNums = new ArrayList<>();
    
    public static void clearCache(){
      eulerNums.clear();
    }
    
    public static BigDecimal calculate(int n) {
        if (eulerNums.size() == 0) {
            eulerNums.add(BigDecimal.valueOf(1L));
            eulerNums.add(BigDecimal.valueOf(0L));
        }
        for (int i = (eulerNums.size()); i <= n; i++) {
            eulerNums.add(calculateEuler(i));
        }   
        return eulerNums.get(n);
    } 

    private static BigDecimal calculateEuler(int n) {

        BigDecimal sum = BigDecimal.valueOf(0);

        for (int k = 0; k <= n-1; k++) {
            BigDecimal Ek = eulerNums.get(k);
            Ek = Ek.multiply( BigDecimal.valueOf(Math.pow(2, (n-1-k))) );
            Ek = Ek.multiply( calculateCoefficient(n, k) );
            sum = sum.add(Ek);
        }
        
        BigDecimal E = BigDecimal.valueOf(1);
        E = E.subtract(sum);
        return E;
    }
}
