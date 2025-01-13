package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUploadUtility;
import utilities.GeneralUtility;
import utilities.WaitUtilities;



public class ManageCategoryPage {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	FileUploadUtility fu=new FileUploadUtility();
	WaitUtilities wu=new WaitUtilities();
	
	public ManageCategoryPage(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
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
		categoryfield.sendKeys("phone"+gu.generateCurrentDateAndTime());
		return this;
	}
	public ManageCategoryPage selectGroupsOnCategoryList()
	{
		selectGroupsCategoryList.click();
		return this;
	}
	
	public ManageCategoryPage clickOnChoosefile()
	{
	
		fu.fileuploadSendkeys(choosefile);
        return this;
	}
	
	public ManageCategoryPage clickOnRadioButton1()
	{
		
		gu.scrollToElement(driver,radioButton1);
	    gu.hoverOverElement(driver,radioButton1);
		return this;
		
	}
	public  ManageCategoryPage clickOnRadioButton2()
	{
		
		gu.scrollToElement(driver,radioButton2);
		gu.hoverOverElement(driver,radioButton2);
		return this;
		
	}
	public ManageCategoryPage clickOnSaveButton()
	{
		wu.setExplicitWait(driver, saveButton);
		saveButton.click();
		return this;
	}
	public boolean getAlertMessage()
	{
		return alertMessage.isDisplayed();
	}
}



