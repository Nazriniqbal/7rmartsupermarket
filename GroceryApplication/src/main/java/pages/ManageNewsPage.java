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
	
	
	@FindBy(xpath="//h1[text()='Manage News']") WebElement manageNewspagetext;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newManageNewsButton;
	@FindBy(xpath="//h3[text()='Enter News Informations']") WebElement manageNewspagetitle;
	@FindBy(xpath="//textarea[@id='news']") WebElement newsField;
	@FindBy(xpath="//button[@type='submit']") WebElement saveButton;
	@FindBy(xpath="//h5[text()=' Alert!']") WebElement alertMessage;
	@FindBy(xpath="//a[text()=' Search']") WebElement searchButton;
	@FindBy(xpath="//input[@name='un']") WebElement searchNewstitlefield;
	@FindBy(xpath="//button[@name='Search']") WebElement submitSearchButton;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultNotFoundMessage;

	@FindBy(xpath="//a[text()=' Reset']") WebElement resetButton;
	@FindBy(xpath="//h4[text()='Manage News']") WebElement tableTitle;
	
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']") WebElement editNews;
	@FindBy(xpath="//textarea[@id='news']") WebElement updateNewsfield;
	@FindBy(xpath="//button[text()='Update']") WebElement updatenews;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertupdatenewsmessage;
	
	
	public String getManageNewsPageText()
	{
		return manageNewspagetext.getText();	
	}
	public ManageNewsPage clickOnNewManageNewsButton()
	{
		newManageNewsButton.click();
		return this;
	}
	public boolean isAddManageNewsPageLoaded()
	{
		return manageNewspagetitle.isDisplayed();
	}
	
	public ManageNewsPage enterManageNewsField()

	{   
		newsField.sendKeys("GroceryApplication News"+gu.generateCurrentDateAndTime());
		return this;
		
	}
	public ManageNewsPage clickOnSaveButton()
	{
		saveButton.click();
		return this;
	}
	
	public boolean getAlertMessage()
	{
		return alertMessage.isDisplayed();
	}
	
	public ManageNewsPage clickOnManageNewsSearchButton()
	{
		searchButton.click();
		return this;
	}
	public ManageNewsPage enterSearchNewsTitleField()

	{   
		searchNewstitlefield.sendKeys("FlowerShowNews");
		return this;
		
	}
	public ManageNewsPage clickOnSearchButton()
	{
		submitSearchButton.click();
		return this;
	}
	public boolean checkOnResultMessage()
	{
		return resultNotFoundMessage.isDisplayed();
	}
	
	public ManageNewsPage clickOnResetButton()
	{
		resetButton.click();
		return this;
	}
	public boolean checkOnTableTitleIsDisplayed()
	{
		return tableTitle.isDisplayed();
	}
	
	
	public ManageNewsPage clickOnEditButton()
	{
		editNews.click();
		return this;
	}
	
	public ManageNewsPage enterUpdateNewsfield()
	{
		updateNewsfield.sendKeys("helo news world");
		return this;
	}
	public ManageNewsPage clickOnUpdateButton()
	{
		updatenews.click();
		return this;
	}
	public boolean getUpdateAlertMessage()
	{
		return alertupdatenewsmessage.isDisplayed();
	}
	
}
