package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.Constants;
import Resources.baseClass;
import Resources.commonMethods;
import pageObjectModels.loginPageObjects;

public class loginTestCases extends baseClass {
//added one new line for git  demo purpose
 @Test(priority = 0)
 public void verifyValidLogin() throws IOException, InterruptedException {

  Thread.sleep(2000);

  loginPageObjects lpo = new loginPageObjects(driver);
  lpo.enterUsername().sendKeys(Constants.username);
  lpo.enterPassword().sendKeys(Constants.validPassword);
  lpo.clickOnLogin().click();

  commonMethods.handleAssertion(driver.getCurrentUrl(), Constants.dashboardUrl);

 

 }

 @Test(priority = 1)
 public void verifyInvalidValidLogin() throws IOException, InterruptedException {

  Thread.sleep(2000);

  loginPageObjects lpo = new loginPageObjects(driver);
  lpo.enterUsername().sendKeys(Constants.username);
  lpo.enterPassword().sendKeys(Constants.invalidPAssword);
  lpo.clickOnLogin().click();

  Thread.sleep(5000);
 
  commonMethods.handleAssertion(lpo.errorMessage().getText(), Constants.invalidErrorExpectedText);

 
  
  

 }

}