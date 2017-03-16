
import org.junit.*;

public class Ex1Test {
    Ex1 ex1;
    double accuracy = 0.5;

    @Before
    public void prepare() {
        ex1 = new Ex1();
    }

    // Boundary-value: 0
    @Test
    public void point0() {
        double sec = ex1.sec(0, accuracy);
        Assert.assertEquals(1.0, sec, 100);
    }
    @Test
    public void point0_r() {
        double sec = ex1.sec(0.09, accuracy);
        Assert.assertEquals(1.004, sec, 100);
    }
    @Test
    public void point0_l() {
        double sec = ex1.sec(-0.09, accuracy);
        Assert.assertEquals(1.004, sec, 100);
    }

    // Boundary-value: PI/2
    @Test(timeout=40000)
    public void pointPiDiv2() {
        double sec = ex1.sec(Math.PI/2, accuracy);
        Assert.assertEquals(Double.POSITIVE_INFINITY, sec, 100);
    }
    @Test
    public void pointPiDiv2_r() {
        double sec = ex1.sec(Math.PI/2+0.09, accuracy);
        Assert.assertEquals(-11.126, sec, 100);
    }
    @Test
    public void pointPiDiv2_l() {
        double sec = ex1.sec(Math.PI/2-0.09, accuracy);
        Assert.assertEquals(11.126, sec, 100);
    }

    // Boundary-value: -PI/2
    @Test(timeout=40000)
    public void pointMPiDiv2() {
        double sec = ex1.sec(-Math.PI/2, accuracy);
        Assert.assertEquals(Double.POSITIVE_INFINITY, sec, 100);
    }
    @Test
    public void pointMPiDiv2_r() {
        double sec = ex1.sec(-Math.PI/2+0.09, accuracy);
        Assert.assertEquals(11.126, sec, 100);
    }
    @Test
    public void pointMPiDiv2_l() {
        double sec = ex1.sec(-Math.PI/2-0.09, accuracy);
        Assert.assertEquals(-11.126, sec, 100);
    }

    // Boundary-value: PI
    @Test
    public void pointPi() {
        double sec = ex1.sec(Math.PI, accuracy);
        Assert.assertEquals(-1.0, sec, 100);
    }
    @Test
    public void pointPi_r() {
        double sec = ex1.sec(Math.PI+0.09, accuracy);
        Assert.assertEquals(-1.004, sec, 100);
    }
    @Test
    public void pointPi_l() {
        double sec = ex1.sec(Math.PI-0.09, accuracy);
        Assert.assertEquals(-1.004, sec, 100);
    }

    // Boundary-value: 3PI/2
    @Test(timeout=40000)
    public void point3PiDiv2() {
        double sec = ex1.sec(3*Math.PI/2, accuracy);
        Assert.assertEquals(Double.POSITIVE_INFINITY, sec, 100);
    }
    @Test
    public void point3PiDiv2_r() {
        double sec = ex1.sec((3*Math.PI/2)+0.09, accuracy);
        Assert.assertEquals(11.126, sec, 100);
    }
    @Test
    public void point3PiDiv2_l() {
        double sec = ex1.sec((3*Math.PI/2)-0.09, accuracy);
        Assert.assertEquals(-11.126, sec, 100);
    }

    // Positive infinity
    @Test
    public void posInfTest() {
        double sec = ex1.sec(Double.POSITIVE_INFINITY, accuracy);
        Assert.assertEquals(Double.NaN, sec, 100);
    }
    // Negative infinity
    @Test
    public void negInfTest() {
        double sec = ex1.sec(Double.NEGATIVE_INFINITY, accuracy);
        Assert.assertEquals(Double.NaN, sec, 100);
    }

    @Test
    public void class1Point() {
        double sec = ex1.sec(-Math.PI/4, accuracy);
        Assert.assertEquals(1.414, sec, 100);
    }

    @Test
    public void point100() {
        double sec = ex1.sec(100, 0.000001);
        Assert.assertEquals(1.1547, sec, 100);
    }

    @Test
    public void class2Point() {
        double sec = ex1.sec(Math.PI/4, accuracy);
        Assert.assertEquals(1.414, sec, 100);
    }

    @Test
    public void class3Point() {
        double sec = ex1.sec(3*Math.PI/4, accuracy);
        Assert.assertEquals(-1.414, sec, 100);
    }

    @Test
    public void class4Point() {
        double sec = ex1.sec(-3*Math.PI/4, accuracy);
        Assert.assertEquals(-1.414, sec, 100);
    }

}
