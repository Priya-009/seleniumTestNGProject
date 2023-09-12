package TestCases;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.baseClass;
import Resources.commonMethods;
import pageObjectModels.loginPageObjects;
import pageObjectModels.myInfoPageObjects;

public class myInfoTestCases extends baseClass {
	@Test
	public void fillPersonalDetails() throws IOException, InterruptedException, AWTException {

		driver.manage().window().maximize();
		Thread.sleep(2000);

		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin");
		lpo.enterPassword().sendKeys("admin123");
		lpo.clickOnLogin().click();

		myInfoPageObjects mpo = new myInfoPageObjects(driver);
		Thread.sleep(3000);
		mpo.clickOnMyInfo().click();

		/*
		 * Thread.sleep(3000); mpo.enterName().sendKeys(Keys.chord(Keys.CONTROL,"a",
		 * Keys.DELETE)); mpo.enterName().sendKeys("Priya"); Thread.sleep(3000);
		 * mpo.enterMiddleName().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 * Thread.sleep(3000); mpo.enterMiddleName().sendKeys("Mamtaik");
		 * Thread.sleep(3000); mpo.enterLastName().sendKeys(Keys.chord(Keys.CONTROL,"a",
		 * Keys.DELETE)); mpo.enterLastName().sendKeys("Sharma"); //Thread.sleep(3000);
		 * // mpo.enterNickName().sendKeys("piyu"); //Thread.sleep(3000); //
		 * mpo.OtherId().sendKeys("0012");
		 */

		Thread.sleep(2000);
		mpo.clickOnNationalityDropdwon().click();

		Thread.sleep(3000);
		commonMethods.handleDropdown(mpo.chooseNationality(),"India");
		Thread.sleep(3000);
		commonMethods.handleDropdown(mpo.genderOptions(),"female");
		Thread.sleep(3000);
		commonMethods.handleDropdown(mpo.selectMaritalStatus(),"Married");
		Thread.sleep(3000);
		commonMethods.handleDropdown(mpo.bloodType(),"B+");
		
		Thread.sleep(2000);
		mpo.addAttachments().click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='Browse']")).click();

		Thread.sleep(4000);

		// file path of the attachment
		String filePath = "C:\\Users\\Priya\\Desktop\\mytestngnotes.txt";

		// Copy the file path to the clipboard
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		// Use Robot class to simulate keyboard shortcuts for pasting the file path
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Press Enter to confirm the file upload
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

//	}

//}
		/*
		 * Thread.sleep(3000); mpo.choosebloodTypeDropdown().click();
		 * Thread.sleep(2000); List<WebElement> obj3 = mpo.bloodType();
		 * Thread.sleep(2000); for (WebElement p : obj3) { if
		 * (p.getText().equalsIgnoreCase("B+")) { p.click(); break; }
		 * 
		 * }
		 */
	}
}

/*
 * Thread.sleep(2000); mpo.addAttachments().click();
 * 
 * Thread.sleep(7000);
 * driver.findElement(By.xpath("//div[text()='Browse']")).sendKeys
 * ("C:\\Users\\Priya\\Desktop\\mytestngnotes.txt");
 * 
 * } }
 */
