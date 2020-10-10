package Automation_CoolTesters.Selenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert{
	
	SoftAssert softAssert = new SoftAssert(); 
	
  @Test
  public void softAssertEquals() {
	  
	  int a = 15;
	  int b = 15;
	  int x = 10;
	  int y = 10;
	  
	  softAssert.assertEquals(a,b);
	  softAssert.assertEquals(x,y);
	  softAssert.assertAll();
	  
  }
}
