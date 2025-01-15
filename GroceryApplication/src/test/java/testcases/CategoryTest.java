package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;


public class CategoryTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	CategoryPage cp;

	@Test
	  public void verifyNewCategoryWithValidDetails() throws IOException {
		  lp = new LoginPage(driver);
		  hp=lp.loginByUsingExcelData();
		  hp=new HomePage(driver);
		  cp= hp.clickOnCategoryButton().clickOnNewCategoryButton().enterOnCategoryField().selectGroupsOnCategoryList()
				  .clickOnChoosefile().clickOnRadioButton1().clickOnRadioButton2().clickOnSaveButton();
		  boolean actualResult = cp.getAlertMessage();
		  boolean expectedResult = true;
		  Assert.assertEquals(expectedResult,actualResult,Constants.CP_verifyAddCategory);  
		  
	}
	@Test
	  public void verifyUserIsAbleToSearchTheCategoryIsNotPresent() throws IOException {
		  lp = new LoginPage(driver);
		  hp=lp.loginByUsingExcelData();
		  hp=new HomePage(driver);
		  cp= hp.clickOnCategoryButton().clickOnSearchButton().enterOnSearchCategoryField().clickOnSearchsubmitButton();
		  boolean actualResult = cp.checkOnResultMessage();
		  boolean expectedResult = true;
		  Assert.assertEquals(expectedResult,actualResult,Constants.CP_verifySearchCategory); 
     }
	
	@Test
	  public void verifyUserIsAbleToResetTheCategory() throws IOException {
		  
		  lp = new LoginPage(driver);
		  hp=lp.loginByUsingExcelData();
		  hp=new HomePage(driver);
		  cp= hp.clickOnCategoryButton().clickOnResetButton();
		  boolean actualResult = cp.checkOnTableTitleIsDisplayed();
		  boolean expectedResult = true;
		  Assert.assertEquals(expectedResult,actualResult,Constants.CP_verifyResetCategory); 
	}
	
}
