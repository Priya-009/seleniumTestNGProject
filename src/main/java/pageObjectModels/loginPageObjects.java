package pageObjectModels;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class loginPageObjects {
	 
	 public WebDriver driver;  //This driver dont have any scope--
	 
	 //driver.findElement(By.xpath("//input[@name='username']"))
	 
	 private By username=By.xpath("//input[@name='username']");
	 
	 private By password=By.xpath("//input[@name='password']");
	 private By login= By.xpath("//button[@type='submit']");
	 private By errorMessage=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");


	 //This is constructor
	 public loginPageObjects(WebDriver driver2) {
	  
	  this.driver=driver2;
	 }

	 
	 public WebElement  enterUsername() {
	  
	  return driver.findElement(username);
	        
	 }
	 
	    public WebElement enterPassword() {
	  
	  return driver.findElement(password);
	  
	 }


		public WebElement clickOnLogin() {
			// TODO Auto-generated method stub
			return driver.findElement(login);
		}


		public WebElement errorMessage() {
			// TODO Auto-generated method stub
			return driver.findElement(errorMessage);
		}


		

		


		
	 
	 
	 

	}


