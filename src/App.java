import java.util.Date;
import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        long startTime = System.nanoTime();
        Ex1 govno = new Ex1();
        BigDecimal bg = govno.getEuler(300 );
        System.out.println( bg);
        long endTime = System.nanoTime();
        System.out.println("GOVNO 300 "+ (endTime - startTime)/1000000);
       /* for (int i=100;i<=100;i++) {
          bg = govno.getEuler(i);
          System.out.println( bg);
        }*/
        startTime = System.nanoTime();
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
        bg = EulerNum.calculate(300 );
        System.out.println( bg);
        endTime = System.nanoTime();
        System.out.println("NASHE GOVNO 100 "+ (endTime - startTime)/1000000);
    }
}
