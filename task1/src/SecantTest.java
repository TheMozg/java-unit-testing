import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SecantTest {
    double accuracy = 0.01;

    @Test
    public void point0() {
        double sec = Secant.sec(0, accuracy);
        assertEquals(1.0, sec, accuracy);
    }
    @Test
    public void point0_r() {
        double sec = Secant.sec(0.09, accuracy);
        assertEquals(1.004, sec, accuracy);
    }
    @Test
    public void point0_l() {
        double sec = Secant.sec(-0.09, accuracy);
        assertEquals(1.004, sec, accuracy);
    }
    
    @Test
    public void pointPiDiv2_r() {
        double sec = Secant.sec(Math.PI/2+0.09, accuracy);
        assertEquals(-11.126, sec, 0.1);
    }
    @Test
    public void pointPiDiv2_l() {
        double sec = Secant.sec(Math.PI/2-0.09, accuracy);
        assertEquals(11.126, sec, 0.1);
    }

    @Test
    public void pointMPiDiv2_r() {
        double sec = Secant.sec(-Math.PI/2+0.09, accuracy);
        assertEquals(11.126, sec, 0.1);
    }
    @Test
    public void pointMPiDiv2_l() {
        double sec = Secant.sec(-Math.PI/2-0.09, accuracy);
        assertEquals(-11.126, sec, 0.1);
    }

    @Test
    public void pointPi() {
        double sec = Secant.sec(Math.PI, accuracy);
        assertEquals(-1.0, sec, accuracy);
    }
    @Test
    public void pointPi_r() {
        double sec = Secant.sec(Math.PI+0.09, accuracy);
        assertEquals(-1.004, sec, accuracy);
    }
    @Test
    public void pointPi_l() {
        double sec = Secant.sec(Math.PI-0.09, accuracy);
        assertEquals(-1.004, sec, accuracy);
    }

    @Test
    public void point3PiDiv2_r() {
        double sec = Secant.sec((3*Math.PI/2)+0.09, accuracy);
        assertEquals(11.126, sec, 0.1);
    }
    @Test
    public void point3PiDiv2_l() {
        double sec = Secant.sec((3*Math.PI/2)-0.09, accuracy);
        assertEquals(-11.126, sec, 0.1);
    }

    @Test(timeout=20000)
    public void posInfTest() {
        double sec = Secant.sec(Double.POSITIVE_INFINITY, accuracy);
        assertEquals(Double.NaN, sec, accuracy);
    }
    @Test(timeout=20000)
    public void negInfTest() {
        double sec = Secant.sec(Double.NEGATIVE_INFINITY, accuracy);
        assertEquals(Double.NaN, sec, accuracy);
    }

    @Test
    public void class1Point() {
        double sec = Secant.sec(-Math.PI/4, accuracy);
        assertEquals(1.414, sec, accuracy);
    }

    @Test
    public void class2Point() {
        double sec = Secant.sec(Math.PI/4, accuracy);
        assertEquals(1.414, sec, accuracy);
    }

    @Test
    public void class3Point() {
        double sec = Secant.sec(3*Math.PI/4, accuracy);
        assertEquals(-1.414, sec, accuracy);
    }

    @Test
    public void class4Point() {
        double sec = Secant.sec(-3*Math.PI/4, accuracy);
        assertEquals(-1.414, sec, accuracy);
    }

}
