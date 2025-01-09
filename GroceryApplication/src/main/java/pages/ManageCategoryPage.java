package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtility;



public class ManageCategoryPage {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	public ManageCategoryPage(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='Manage Category']") WebElement manageCategoryButton;
	@FindBy(xpath="//h1[text()='List Categories']") WebElement manageCategorypagetext;
	@FindBy(xpath="//a[text()=' New']") WebElement newCategoryButton;
	@FindBy(xpath="//h1[text()='Add Category']") WebElement addCategoryPage;
	@FindBy(xpath="//input[@id='category']") WebElement categoryfield;
	@FindBy(xpath="//li[@id='134-selectable']") WebElement selectGroupsCategoryList;
	@FindBy(xpath="//li[@id='134-selection']") WebElement selectedGroupsCategoryList;
	@FindBy(xpath="//input[@type='file']") WebElement choosefile;
	@FindBy(xpath="//label[text()='Show On Top Menu']") WebElement radioButton1;
	@FindBy(xpath="//label[text()='Show On Left Menu']") WebElement radioButton2;
	@FindBy(xpath="//button[@type='submit']") WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertMessage;
	
	public void clickOnManageCategoryButton()
	{
		manageCategoryButton.click();
	}
	
	public String getManageCategoryPageText()
	{
		return manageCategorypagetext.getText();	
	}
	public ManageCategoryPage clickOnNewCategoryButton()
	{
		newCategoryButton.click();
		return this;
	}
	public boolean isAddCategoryPageLoaded()
	{
		return addCategoryPage.isDisplayed();
	}
	public ManageCategoryPage enterOnCategoryField()
	{
		categoryfield.sendKeys("phone");
		return this;
	}
	public ManageCategoryPage selectGroupsOnCategoryList()
	{
		//selectGroupsCategoryList.click();
		gu.clickUsingJavaScriptMethod(selectGroupsCategoryList);
		
		return this;
	}
	
	public ManageCategoryPage clickOnChoosefile()
	{
		choosefile.sendKeys("C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot 2025-01-06 211752.png");
		gu.scroll();
		return this;
	}
	
	public ManageCategoryPage clickOnRadioButton1()
	{
		gu.selectRadioButton(radioButton1);
		return this;
		
	}
	public  ManageCategoryPage clickOnRadioButton2()
	{
		gu.selectRadioButton(radioButton2);
		return this;
		
	}
	public ManageCategoryPage clickOnSaveButton()
	{
		saveButton.click();
		return this;
	}
	public boolean getAlertMessage()
	{
		return alertMessage.isDisplayed();
	}
}



