import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import org.junit.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class MapTest {
    Map<String, Integer>map;
    @Before
    public void initialize() {
        map = new Map<>();
        map.add("this",1 );
        map.add("coder",2 );
        map.add("this",4 );
        map.add("hi",5 );
    }
    
    @Test
    public void getThis() {
        int val = map.get("this");
        assertEquals(4, val);
    }
  
}
