import java.math.BigDecimal;
import java.math.RoundingMode;

public class Secans {

    public static double calculate(double x, double accuracy) {
        double y = 0;
        int i = 0;
        boolean negative = false;
        
        if ((x > Math.PI/2)) {
            int buf = (int) (x * 2 / Math.PI);
            buf = --buf / 2;
            if (buf % 2 == 0)
                negative = true;
            x -= Math.PI * (1 + buf);
        } else if ((x < -Math.PI/2)) {
            int buf = (int) (-x * 2 / Math.PI);
            buf = --buf / 2;
            if (buf % 2 == 0)
                negative = true;
            x += Math.PI * (1 + buf);
        } else if(x == Double.NEGATIVE_INFINITY || x == Double.POSITIVE_INFINITY)
            return Double.NaN;

        while (true) {
            BigDecimal power = BigDecimal.valueOf(x);
            BigDecimal tmpBig = EulerNum.calculate(i).multiply(power.pow(i));
            tmpBig = tmpBig.divide(EulerNum.getFactorial(i), BigDecimal.valueOf(accuracy).scale(), RoundingMode.HALF_UP);

            Double tmpDouble = Math.abs(tmpBig.doubleValue());

            if (tmpDouble > accuracy)
                y += tmpDouble;
            else
                break;
            i = i + 2;
        }

        if (negative == true)
            return -y;
        else return y;
    }

}
