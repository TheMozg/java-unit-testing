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
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Adding key value pair: this:1");
        expected.add("Hash: 3559070, bucket: 0");
        expected.add("Bucket Array before: [null, null, null, null, null, null, null, null, null, null]");
        expected.add("Key this not found!");
        expected.add("Bucket Array after: [(this:1->null), null, null, null, null, null, null, null, null, null]");
        expected.add("Adding key value pair: coder:2");
        expected.add("Hash: 94834725, bucket: 5");
        expected.add("Bucket Array before: [(this:1->null), null, null, null, null, null, null, null, null, null]");
        expected.add("Key coder not found!");
        expected.add("Bucket Array after: [(this:1->null), null, null, null, null, (coder:2->null), null, null, null, null]");
        expected.add("Adding key value pair: this:4");
        expected.add("Hash: 3559070, bucket: 0");
        expected.add("Bucket Array before: [(this:1->null), null, null, null, null, (coder:2->null), null, null, null, null]");
        expected.add("Key this found!");
        map = new Map<>();
        map.debug=true;
        map.resetLogList();
        map.add("this",1 );
        map.add("coder",2 );
        map.add("this",4 );
        assertArrayEquals(expected.toArray(), map.logList.toArray());
    }
  
}
