package pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement usernamefield;
	@FindBy(xpath="//input[@name='password']") WebElement passwordfield;
	@FindBy(xpath="//input[@id='remember']") WebElement remembermebutton;
	@FindBy(xpath="//button[@type='submit']") WebElement signinbutton;
    @FindBy(xpath="//span[text()='7rmart supermarket']") WebElement homepage;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertmessage;
	public LoginPage enterUsername(String username)

	{
		usernamefield.sendKeys(username);
		return this;
		
	}
	public LoginPage enterPassword(String password)

	{
		passwordfield.sendKeys(password);
		return this;
	}
	
	
	public HomePage clickOnSignInButton()

	{
		signinbutton.click();
		return new HomePage(driver);
		
	}
	public boolean ishomepageloaded()
	{
		return homepage.isDisplayed();
	}
	
	public String getAlertMessage()
	{
		return alertmessage.getText();
	}
	public HomePage loginByUsingExcelData() throws IOException
	{
		String username=ExcelUtility.readStringData(1,0,"LoginPage");
		String password=ExcelUtility.readStringData(1,1,"LoginPage");
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		signinbutton.click();
		return new HomePage(driver);
	}
	public HomePage loginByUsingExcelData1() throws IOException
	{
		String username=ExcelUtility.readStringData(2,0,"LoginPage");
		String password=ExcelUtility.readStringData(2,1,"LoginPage");
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		signinbutton.click();
		return new HomePage(driver);
	}

	public HomePage loginByUsingExcelData2() throws IOException
	{
		String username=ExcelUtility.readStringData(4,0,"LoginPage");
		String password=ExcelUtility.readStringData(4,1,"LoginPage");
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		signinbutton.click();
		return new HomePage(driver);
		
	}
}
