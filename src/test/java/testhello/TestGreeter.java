package hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestGreeter {

   private Greeter g;
	
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
	
   @Test
   public void testGreeter() 
   {
      g.setName("World");
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }

   @Test
   public void newestnwGreeterPass()
   {
      g.setName("Nick");
      assertEquals(g.getName(),"Nick");
      assertEquals(g.sayHello(),"Hello Nick!");
   }
   @Test
   public void newestnwGreeterFail()
   {
      g.setName("Not Nick");
      assertEquals(g.getName(),"Nick");
      assertsEqual(g.sayHello(),"Hello Nick!");
   }
}