import java.util.Date;
import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        //Ex1 govno = new Ex1();
 /*       System.out.println( "Hello World!" );

        long startTime = System.nanoTime();
        Ex1 govno = new Ex1();
        BigDecimal bg = govno.getEuler(300 );
        System.out.println( bg);
        long endTime = System.nanoTime();
        System.out.println("GOVNO 300 "+ (endTime - startTime)/1000000);
        bg = EulerNum.calculate(300 );
        System.out.println( bg);
        endTime = System.nanoTime();
        System.out.println("NASHE GOVNO 300 "+ (endTime - startTime)/1000000);

        startTime = System.nanoTime();
        bg = govno.getEuler(100);
        System.out.println( bg);
        endTime = System.nanoTime();
        System.out.println("GOVNO 100 "+ (endTime - startTime)/1000000);

        startTime = System.nanoTime();
        bg = EulerNum.calculate(100 );
        System.out.println( bg);
        endTime = System.nanoTime();
        System.out.println("NASHE GOVNO 100 "+ (endTime - startTime)/1000000);
        */
        //System.out.println(govno.sec(1.57, 0.1));
        System.out.println(Secant.sec(1.57, 0.1));
    }
}
