package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TestDemoA extends BaseTest {
   @Test
   public void testA() {
	   Reporter.log("Loading A",true);
   }
   @Test
   public void testB() {
	   Reporter.log("Loading B",true);
   }
}
