package pageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myInfoPageObjects {

	public WebDriver driver;

	private By myInfo = By.xpath("//span[normalize-space()='My Info']");
	private By name = By.xpath("//input[@name='firstName']");
	private By middleName = By.xpath("(//input[@placeholder='Middle Name'])[1]");
	private By lastName = By.xpath("(//input[@placeholder='Last Name'])[1]");
	private By nickName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By EmployeeId = By.xpath("(//input[@class='oxd-input oxd-input--focus'])[1]");
	private By OtherId = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	private By DriversLicenseNumber = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	// private By LicenseExpiryDate=
	// By.xpath("(//input[@fdprocessedid='taeuxm'])[1]");

	private By SSNNumber = By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]");
	private By SINNumber = By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]");
	// private By dateofbirth=By.xpath("(//i[@class='oxd-icon bi-calendar
	// oxd-date-input-icon'])[2]");
	private By nationalityDropdown = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	private By nationalityOptions = By.xpath("//div[@class='oxd-select-option']");
	private By gender = By.xpath("(//label[normalize-space()='Gender'])[1]");
	private By genderOptions = By.xpath("(//label[normalize-space()='Female'])[1]");
	private By MaritalStatusDropdown=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	private By MaritalStatus= By.xpath("(//div[contains(text(),'Married')])[1]");
	private By Attachments=By.xpath("(//button[normalize-space()='Add'])[1]");
	private By bloodTypeDropdown=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]");
	private By bloodType=By.xpath("(//span[normalize-space()='B+'])[1]");
	private By MilitaryService = By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]");
	


	public myInfoPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement clickOnMyInfo() {

		return driver.findElement(myInfo);

	}

	public WebElement enterName() {

		return driver.findElement(name);

	}

	public WebElement enterMiddleName() {

		return driver.findElement(middleName);

	}

	public WebElement enterLastName() {

		return driver.findElement(lastName);

	}

	public WebElement enterNickName() {

		return driver.findElement(nickName);

	}

	public WebElement enterEmployeeId() {

		return driver.findElement(EmployeeId);
	}

	public WebElement OtherId() {

		return driver.findElement(OtherId);
	}

	public WebElement DriversLicenseNumber() {

		return driver.findElement(DriversLicenseNumber);
	}

	/*
	 * public WebElement LicenseExpiryDate () {
	 * 
	 * return driver.findElement(LicenseExpiryDate); }
	 */
	public WebElement SSNNumber() {

		return driver.findElement(SSNNumber);
	}

	public WebElement SINNumber() {

		return driver.findElement(SINNumber);
	}

	/*
	 * public WebElement dateofbirth() {
	 * 
	 * return driver.findElement(dateofbirth); }
	 */
	public WebElement clickOnNationalityDropdwon() {

		return driver.findElement(nationalityDropdown);
	}

	public List<WebElement> chooseNationality() {

		return driver.findElements(nationalityOptions);
	}

	public WebElement Gender() {
		return driver.findElement(gender);
	}

	public List<WebElement> genderOptions() {

		return driver.findElements(genderOptions);
	}

	
	public WebElement chooseMaritalStatusDropdown() {
		return driver.findElement(MaritalStatusDropdown);
	}

	public List<WebElement>selectMaritalStatus() {

		return driver.findElements(MaritalStatus);
	}
	
	public WebElement addAttachments() {

		return driver.findElement(Attachments);
	}
	
	public WebElement choosebloodTypeDropdown() {

		return driver.findElement(bloodTypeDropdown);
	}

	public List<WebElement> bloodType() {

		return driver.findElements(bloodType);
	}

	public WebElement MilitaryService() {

		return driver.findElement(MilitaryService);
	}
}