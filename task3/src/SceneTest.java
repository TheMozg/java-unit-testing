import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SceneTest {

  final String fish_1 = "Scary fish dived out of the sky";
  final String donuts_1 = "Jumping doughnuts jumped straight out of road";
  final String pipes_1 = "Pipes squealed through the winds";
  final String hitch_1 = "Ford understood that it's time to run";
  final String fish_0 = "Scary fish was harmless";
  final String donuts_0 = "Jumping doughnuts weren't really that jumpy actually";
  final String pipes_0 = "Pipes were calm and quiet";
  final String hitch_0 = "Ford was calm";

  @Test
  public void check1 () {
    String args[] = { "0", "0", "0", "0", "0", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_0 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  } 
  
  
  @Test
  public void check2 () {
    String args[] = { "0", "0", "1", "0", "0", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_0 + "\n" + donuts_0 + "\n" + pipes_1 + "\n" + hitch_0 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check3 () {
    String args[] = { "0", "1", "0", "0", "0", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_0 + "\n" + donuts_1 + "\n" + pipes_0 + "\n" + hitch_0 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check4 () {
    String args[] = { "0", "1", "1", "0", "0", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_0 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_0 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check5 () {
    String args[] = { "1", "0", "0", "0", "0", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check6 () {
    String args[] = { "1", "0", "1", "0", "0", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_0 + "\n" + pipes_1 + "\n" + hitch_0 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check7 () {
    String args[] = { "1", "1", "0", "0", "0", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_1 + "\n" + pipes_0 + "\n" + hitch_0 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check8 () {
    String args[] = { "1", "1", "1", "0", "0", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_1 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check9 () {
    String args[] = { "1", "1", "1", "0", "0", "0", "1" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_1 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_0 + "\n" + pipes_1 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check11 () {
    String args[] = { "1", "1", "1", "0", "0", "1", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_1 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_1 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check12 () {
    String args[] = { "1", "1", "1", "0", "0", "1", "1" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_1 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check13 () {
    String args[] = { "1", "1", "1", "0", "1", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_1 +
                             "\nAfter:\n" +
                             fish_1 + "\n" + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check14 () {
    String args[] = { "1", "1", "1", "0", "1", "0", "1" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_1 +
                             "\nAfter:\n" +
                             fish_1 + "\n" + donuts_0 + "\n" + pipes_1 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check15 () {
    String args[] = { "1", "1", "1", "0", "1", "1", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_1 +
                             "\nAfter:\n" +
                             fish_1 + "\n" + donuts_1 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void check16 () {
    String args[] = { "1", "1", "1", "0", "1", "1", "1" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_1 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_1 +
                             "\nAfter:\n" +
                             fish_1 + "\n" + donuts_1 + "\n" + pipes_1 + "\n" + hitch_1;
    assertEquals(expected_result, result);   
  }

 
  @Test
  public void checkHotnessOfDonuts () {
    String args[] = { "0", "0", "0", "1", "0", "0", "0" };
    Scene scene = new Scene(args);
    
    String result = scene.result;
    String expected_result = fish_0 + "\n" + "Hot " + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0 +
                             "\nAfter:\n" +
                             fish_0 + "\n" + "Hot " + donuts_0 + "\n" + pipes_0 + "\n" + hitch_0;
    assertEquals(expected_result, result);   
  }


}
