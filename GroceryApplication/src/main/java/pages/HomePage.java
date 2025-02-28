package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='7rmart supermarket']") WebElement homePageText;
    @FindBy(xpath="//p[text()='Sub Category']") WebElement subCategoryButton;
    @FindBy(xpath="//p[text()='Category']") WebElement categoryButton;
	@FindBy(xpath="//p[text()='Manage News']") WebElement manageNewsButton;
	@FindBy(xpath="//p[text()='Manage Contact']") WebElement managecontactbutton;
	

public String getHomePageText()
{
return homePageText.getText();	
}

public SubCategoryPage clickOnSubCategoryButton()
{
	subCategoryButton.click();
	return new SubCategoryPage(driver);
}

public CategoryPage clickOnCategoryButton()
{
	categoryButton.click();
	return new CategoryPage(driver);
}

public ManageNewsPage clickOnManageNewsButton()
{
	manageNewsButton.click();
	return new ManageNewsPage(driver);
}

public ManageContactPage clickOnManageContactButton()
{
	managecontactbutton.click();
	return new ManageContactPage(driver);
}

}
