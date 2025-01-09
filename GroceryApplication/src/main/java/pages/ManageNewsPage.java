package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtility;

public class ManageNewsPage {
	
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	public ManageNewsPage(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='Manage News']") WebElement manageNewsButton;
	@FindBy(xpath="//h1[text()='Manage News']") WebElement manageNewspagetext;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newManageNewsButton;
	@FindBy(xpath="//h3[text()='Enter News Informations']") WebElement manageNewspagetitle;
	@FindBy(xpath="//textarea[@id='news']") WebElement newsField;
	@FindBy(xpath="//button[@type='submit']") WebElement saveButton;
	@FindBy(xpath="//h5[text()=' Alert!']") WebElement alertMessage;
	@FindBy(xpath="//a[text()=' Search']") WebElement searchButton;
	@FindBy(xpath="//input[@name='un']") WebElement searchNewstitlefield;
	@FindBy(xpath="//button[@name='Search']") WebElement submitSearchButton;
	@FindBy(xpath="//a[text()=' Reset']") WebElement resetButton;
	
	@FindBy(xpath="//input[@type='hidden']") WebElement editNews;
	@FindBy(xpath="//textarea[@id='news']") WebElement updateNewsfield;
	@FindBy(xpath="//button[text()='Update']") WebElement updatenews;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertupdatenewsmessage;
	
	
	public void clickOnManageNewsButton()
	{
		manageNewsButton.click();
	}
	
	public String getManageNewsPageText()
	{
		return manageNewspagetext.getText();	
	}
	public void clickOnNewManageNewsButton()
	{
		newManageNewsButton.click();
	}
	public boolean isAddManageNewsPageLoaded()
	{
		return manageNewspagetitle.isDisplayed();
	}
	
	public void enterManageNewsField()

	{   
		newsField.sendKeys("GroceryApplication News"+gu.generateCurrentDateAndTime());
		
	}
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	
	public String getAlertMessage()
	{
		return alertMessage.getText();
	}
	
	public void clickOnManageNewsSearchButton()
	{
		searchButton.click();
	}
	public void enterSearchNewsTitleField()

	{   
		searchNewstitlefield.sendKeys("GroceryApplication News");
		
	}
	public void clickOnSearchButton()
	{
		submitSearchButton.click();
	}
	public void clickOnResetButton()
	{
		resetButton.click();
	}
	
	public void clickOnEditButton()
	{
		editNews.click();
	}
	
	public void enterUpdateNewsfield()
	{
		updateNewsfield.sendKeys("helo news world");
	}
	public void clickOnUpdateButton()
	{
		updatenews.click();
	}
	public String getUpdateAlertMessage()
	{
		return alertupdatenewsmessage.getText();
	}
	
}
