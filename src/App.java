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
        Ex1 govno = new Ex1();
        long startTime = System.nanoTime();
        for (int i=100;i<=100;i++) {
          BigDecimal bg = govno.getEuler(i);
          System.out.println( bg);
        }
        long endTime = System.nanoTime();
        System.out.println( (endTime - startTime)/1000000);
    }
}