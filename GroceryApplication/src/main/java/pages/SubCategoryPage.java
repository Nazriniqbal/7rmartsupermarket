package pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ExcelUtility;
import utilities.GeneralUtility;


public class SubCategoryPage {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	public SubCategoryPage(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='Sub Category']") WebElement subCategoryButton;
	@FindBy(xpath="//h1[text()='List Sub Categories']") WebElement subCategorypagetext;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newSubCategoryButton;
	@FindBy(xpath="//h1[text()='Add Sub Category']") WebElement addSubCategoryPage;
	@FindBy(xpath="//select[@id='cat_id']") WebElement selectCategoryOption;
	@FindBy(xpath="//input[@id='subcategory']") WebElement subCategoryfield;
	@FindBy(xpath="//input[@type='file']") WebElement choosefile;
	@FindBy(xpath="//button[text()='Save']") WebElement saveButton;
	@FindBy(xpath="//a[text()='Cancel']") WebElement cancelButton;
	@FindBy(xpath="//h5[text()=' Alert!']") WebElement alertmessage;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
	@FindBy(xpath="//select[@id='un']") WebElement selectSearchCategoryOption;
	@FindBy(xpath="//input[@name='ut']") WebElement searchSubCategoryField;
	@FindBy(xpath="//button[@name='Search']") WebElement searchOptionButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetButton;
	
	
	public void clickOnSubCategoryButton()
	{
		subCategoryButton.click();
	}
	
	public String getSubCategoryPageText()
	{
		return subCategorypagetext.getText();
	}
	
	public void clickOnNewSubCategoryButton()
	{
		newSubCategoryButton.click();
	}
	public boolean isAddSubCategoryPageLoaded()
	{
		return addSubCategoryPage.isDisplayed();
	}
	public void clickOnSelectCategoryOption()
	{
		gu.selectDropdownWithIndex(selectCategoryOption, 1);
		
	}
	public void enterSubCategoryField()

	{   
		subCategoryfield.sendKeys("iphone66" +gu.generateCurrentDateAndTime());
		
	}
	public void clickOnChoosefile()
	{
	 	choosefile.sendKeys("C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot 2025-01-06 211752.png");
	}
	public void clickOnSaveButton()
	{
		saveButton.click();
		//gu.clickUsingJavaScriptMethod(saveButton);
	}
	
	public String getAlertMessage()
	{
		return alertmessage.getText();
	}
	
	/*public void loginByUsingExcelData3() throws IOException
	{
		String category=ExcelUtility.readStringData(1,0,"SubCategoryPage");
		String subcategory=ExcelUtility.readStringData(1,1,"SubCategoryPage");
		
		selectCategoryOption.sendKeys(category);
		subCategoryfield.sendKeys(subcategory);
		choosefile.sendKeys();
		saveButton.click();
		
	}*/
	
	public void clickOnSearchButton()
	{
		//gu.clickUsingJavaScriptMethod(searchButton);
		searchButton.click();
	}
	public void clickOnSelectSearchCategoryOption()
	{
		
		gu.selectDropdownWithIndex(selectSearchCategoryOption, 5);
		
	
	}
	public void enterSearchSubCategoryField()

	{   
		searchSubCategoryField.sendKeys("Toycar");
		
	}
	public void clickOnSearchOptionButton()
	{
		//gu.clickUsingJavaScriptMethod(searchOptionButton);
		searchOptionButton.click();
	}
	
	public void clickOnResetButton()
	{
		resetButton.click();
	}
	
	
}
