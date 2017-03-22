import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class MapTest {
    Map<String, Integer>map;
    
    @Test
    public void addGet() {
        map = new Map<>();
        map.add("one",1 );
        int val = map.get("one");
        assertEquals(1, val);
    }
    
    @Test
    public void addRemove() {
        map = new Map<>();
        map.add("one",1 );
        map.remove("one");
        assertNull(map.get("one"));
    }
    
    @Test
    public void isEmpty() {
        map = new Map<>();
        assertTrue(map.isEmpty());
        map.add("one",1 );
        assertFalse(map.isEmpty());
    }
    
    @Test
    public void size() {
        map = new Map<>();
        map.add("1",1 );
        map.add("2",2 );
        map.add("3",3 );
        assertEquals(3, map.size());
    }
    
    @Test
    public void whiteBoxAdd() {
        System.out.println("Whiteboxing hash map add");
        map = new Map<>();
        map.debug=true;
        map.add("this",1 );
        map.add("coder",2 );
        map.add("this",4 );
        map.add("hi",5 );
        int val = map.get("this");
        assertEquals(4, val);
    }
  
}
