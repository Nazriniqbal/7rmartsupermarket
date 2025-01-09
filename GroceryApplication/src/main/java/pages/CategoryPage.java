package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtility;

public class CategoryPage {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	public CategoryPage(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='Category']") WebElement categoryButton;
	@FindBy(xpath="//h1[text()='List Categories']") WebElement categorypagetext;
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
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
	@FindBy(xpath="//h4[text()='Search List Categories']") WebElement addSearchCategoryPage;
	@FindBy(xpath="//input[@name='un']") WebElement searchCategoryField;
	@FindBy(xpath="//button[@name='Search']") WebElement searchSubmitButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetButton;
	
	
	
	public void clickOnCategoryButton()
	{
		categoryButton.click();
	}
	
	public String getCategoryPageText()
	{
		return categorypagetext.getText();	
	}
	public void clickOnNewCategoryButton()
	{
		newCategoryButton.click();
	}
	public boolean isAddCategoryPageLoaded()
	{
		return addCategoryPage.isDisplayed();
	}
	public void enterOnCategoryField()
	{
		categoryfield.sendKeys("iphone66");
	}
	public void selectGroupsOnCategoryList()
	{
		selectGroupsCategoryList.click();
		
	}
	
	public void clickOnChoosefile()
	{
		choosefile.sendKeys("C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot 2025-01-06 211752.png");
	}
	
	public void clickOnRadioButton1()
	{
		gu.selectRadioButton(radioButton1);
		
	}
	public void clickOnRadioButton2()
	{
		gu.selectRadioButton(radioButton2);
		
	}
	public void clickOnSaveButton()
	{
		saveButton.click();
		
	}
	public String getAlertMessage()
	{
		return alertMessage.getText();
	}
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	public void enterOnSearchCategoryField()
	{
		searchCategoryField.sendKeys("iphone");
	}
	public void clickOnSearchsubmitButton()
	{
		searchSubmitButton.click();
		
	}
	public void clickOnResetButton()
	{
		
		resetButton.click();
		
	}
	
}

