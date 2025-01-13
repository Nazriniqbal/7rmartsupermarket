package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUploadUtility;
import utilities.GeneralUtility;


public class SubCategoryPage {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	FileUploadUtility fu=new FileUploadUtility();
	public SubCategoryPage(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//h1[text()='List Sub Categories']") WebElement subCategorypagetext;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newSubCategoryButton;
	@FindBy(xpath="//h1[text()='Add Sub Category']") WebElement addSubCategoryPage;
	@FindBy(xpath="//select[@id='cat_id']") WebElement selectCategoryOption;
	@FindBy(xpath="//input[@id='subcategory']") WebElement subCategoryfield;
	@FindBy(xpath="//input[@type='file']") WebElement choosefile;
	@FindBy(xpath="//button[text()='Save']") WebElement saveButton;
	@FindBy(xpath="//h5[text()=' Alert!']") WebElement alertmessage;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
	@FindBy(xpath="//select[@id='un']") WebElement selectSearchCategoryOption;
	@FindBy(xpath="//input[@name='ut']") WebElement searchSubCategoryField;
	@FindBy(xpath="//button[@name='Search']") WebElement searchOptionButton;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultNotFoundMessage;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetButton;
	@FindBy(xpath="//h4[text()='List Sub Categories']") WebElement tabletitle;
	
	
	
	public boolean getSubCategoryPageText()
	{
		return subCategorypagetext.isDisplayed();
	}
	
	public SubCategoryPage clickOnNewSubCategoryButton()
	{
		newSubCategoryButton.click();
		return this;
	}
	public boolean isAddSubCategoryPageLoaded()
	{
		return addSubCategoryPage.isDisplayed();
	}
	public SubCategoryPage clickOnSelectCategoryOption()
	{
		gu.selectDropdownWithIndex(selectCategoryOption, 1);
		return this;
		
	}
	public SubCategoryPage enterSubCategoryField()

	{   
		subCategoryfield.sendKeys("iphone66" +gu.generateCurrentDateAndTime());
		return this;
		
	}
	public SubCategoryPage clickOnChoosefile()
	{
		fu.fileuploadSendkeys(choosefile);
		
	 	return this;
	}
	public SubCategoryPage clickOnSaveButton()
	{
		saveButton.click();
		return this;
		
	}
	
	public boolean getAlertMessage()
	{
		return alertmessage.isDisplayed();
	}
	
	
	
	public SubCategoryPage clickOnSearchButton()
	{
		
		searchButton.click();
		return this;
	}
	public SubCategoryPage clickOnSelectSearchCategoryOption()
	{
		
		gu.selectDropdownWithIndex(selectSearchCategoryOption, 5);
		return this;
	
	}
	public SubCategoryPage enterSearchSubCategoryField()

	{   
		searchSubCategoryField.sendKeys("Toycar");
		return this;
		
	}
	public SubCategoryPage clickOnSearchOptionButton()
	{
		
		searchOptionButton.click();
		return this;
	}
	
	public boolean checkOnResult()
	{
		return resultNotFoundMessage.isDisplayed();
	}
	
	public SubCategoryPage clickOnResetButton()
	{
		resetButton.click();
		return this;
	}
	
	public boolean checkOnTableTitleIsDisplayed() {
		
		return tabletitle.isDisplayed();
	}
	
	
}
