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
        map.add("themozg", 1);
        int val = map.get("themozg");
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
        expected.add("---Adding key value pair: this:1");
        expected.add("Hash: 3559070, bucket: 0");
        expected.add("Bucket Array before: [null, null, null, null, null]");
        expected.add("Key this not found!");
        expected.add("Bucket Array after: [(this:1->null), null, null, null, null]");
        expected.add("---Adding key value pair: coder:2");
        expected.add("Hash: 94834725, bucket: 0");
        expected.add("Bucket Array before: [(this:1->null), null, null, null, null]");
        expected.add("Key coder not found!");
        expected.add("Bucket Array after: [(coder:2->(this:1->null)), null, null, null, null]");
        expected.add("---Adding key value pair: this:4");
        expected.add("Hash: 3559070, bucket: 0");
        expected.add("Bucket Array before: [(coder:2->(this:1->null)), null, null, null, null]");
        expected.add("Key this found!");
        expected.add("Bucket Array after: [(coder:2->(this:4->null)), null, null, null, null]");
        expected.add("---Adding key value pair: a:3");
        expected.add("Hash: 97, bucket: 2");
        expected.add("Bucket Array before: [(coder:2->(this:4->null)), null, null, null, null]");
        expected.add("Key a not found!");
        expected.add("Bucket Array after: [(coder:2->(this:4->null)), null, (a:3->null), null, null]");
        expected.add("---Adding key value pair: b:3");
        expected.add("Hash: 98, bucket: 3");
        expected.add("Bucket Array before: [(coder:2->(this:4->null)), null, (a:3->null), null, null]");
        expected.add("Key b not found!");
        expected.add("Bucket Array after: [(coder:2->(this:4->null)), null, (a:3->null), (b:3->null), null]");
        expected.add("Resizing HashTable");
        expected.add("Bucket Array after resize: [(this:4->null), null, null, null, null, (coder:2->null), null, (a:3->null), (b:3->null), null]");
        map = new Map<>();
        map.debug=true;
        map.resetLogList();
        map.add("this",1 );
        map.add("coder",2 );
        map.add("this",4 );
        map.add("a",3 );
        map.add("b",3 );
        assertArrayEquals(expected.toArray(), map.logList.toArray());
    }
  
}
