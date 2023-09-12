package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class commonMethods {

 public static void handleAssertion(String Actual, String Expected) {

  SoftAssert sa = new SoftAssert();

  String ActualText =Actual;
  String ExpectedText = Expected;

  sa.assertEquals(ActualText, ExpectedText);

  sa.assertAll(); // This is mandatory

 }
 
 
 public static void handleDropdown(List<WebElement> a, String text) {
  
  
  List<WebElement> obj = a;

  for (WebElement k : obj) {
   if (k.getText().equalsIgnoreCase(text)) {
    k.click();
    break;
   }
  }
  
  
  
 }
 

}