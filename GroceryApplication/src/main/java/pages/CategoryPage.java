package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUploadUtility;
import utilities.GeneralUtility;
import utilities.WaitUtilities;

public class CategoryPage {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	FileUploadUtility fu=new FileUploadUtility();
	WaitUtilities wu=new WaitUtilities();
	public CategoryPage(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
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
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultNotFoundMessage;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetButton;
	@FindBy(xpath="//h4[text()='List Categories']") WebElement tableTitle;
	
	
	
	public String getCategoryPageText()
	{
		return categorypagetext.getText();	
	}
	public CategoryPage clickOnNewCategoryButton()
	{
		newCategoryButton.click();
		return this;
	}
	public boolean isAddCategoryPageLoaded()
	{
		return addCategoryPage.isDisplayed();
	}
	public CategoryPage enterOnCategoryField()
	{
		categoryfield.sendKeys("iphone66"+gu.generateCurrentDateAndTime());
		return this;
	}
	public CategoryPage selectGroupsOnCategoryList()
	{
		selectGroupsCategoryList.click();
		return this;
	}
	
	public CategoryPage clickOnChoosefile()
	{
		fu.fileuploadSendkeys(choosefile);
		return this;
	}
	
	public CategoryPage clickOnRadioButton1()
	{
		gu.scrollToElement(driver,radioButton1);
	    gu.hoverOverElement(driver,radioButton1);
		return this;
	}
	
	public CategoryPage clickOnRadioButton2()
	{
		gu.scrollToElement(driver,radioButton2);
		gu.hoverOverElement(driver,radioButton2);
		return this;
	}
	
	public CategoryPage clickOnSaveButton()
	{
		wu.waitUntilElementIsVisible(driver,saveButton);
		saveButton.click();
		return this;
	}
	
	public boolean getAlertMessage()
	{
		return alertMessage.isDisplayed();
	}
	
	public CategoryPage clickOnSearchButton()
	{
		searchButton.click();
		return this;
	}
	
	public CategoryPage enterOnSearchCategoryField()
	{
		searchCategoryField.sendKeys("Lotus");
		return this;
	}
	
	public CategoryPage clickOnSearchsubmitButton()
	{
		searchSubmitButton.click();
		return this;
	}
	
	public boolean checkOnResultMessage()
	{
		return resultNotFoundMessage.isDisplayed();
	}
	
	public CategoryPage clickOnResetButton()
	{
		resetButton.click();
		return this;
	}
	
    public boolean checkOnTableTitleIsDisplayed() 
    {
		return tableTitle.isDisplayed();
	}
	
}

