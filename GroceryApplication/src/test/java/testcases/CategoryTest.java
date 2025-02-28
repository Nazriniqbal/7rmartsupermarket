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

	@Test(groups="smoke")
	  public void verifyUserIsAbleToAddNewCategoryWithValidDetails() throws IOException {
		  lp = new LoginPage(driver);
		  hp=lp.loginByUsingExcelData();
		  cp= hp.clickOnCategoryButton().clickOnNewCategoryButton().enterOnCategoryField().selectGroupsOnCategoryList()
				  .clickOnChoosefile().clickOnRadioButton1().clickOnRadioButton2().clickOnSaveButton();
		  boolean actualResult = cp.getAlertMessage();
		  boolean expectedResult = true;
		  Assert.assertEquals(expectedResult,actualResult,Constants.CP_verifyUserIsAbleToAddNewCategoryWithValidDetails);  
		  
	}
	@Test
	  public void verifyUserIsAbleToSearchTheCategoryThatIsNotPresent() throws IOException {
		  lp = new LoginPage(driver);
		  hp=lp.loginByUsingExcelData();
		  cp= hp.clickOnCategoryButton().clickOnSearchButton().enterOnSearchCategoryField().clickOnSearchsubmitButton();
		  boolean actualResult = cp.checkOnResultMessage();
		  boolean expectedResult = true;
		  Assert.assertEquals(expectedResult,actualResult,Constants.CP_verifyUserIsAbleToSearchTheCategoryThatIsNotPresent); 
     }
	
	@Test
	  public void verifyUserIsAbleToResetTheCategory() throws IOException {
		  
		  lp = new LoginPage(driver);
		  hp=lp.loginByUsingExcelData();
		  cp= hp.clickOnCategoryButton().clickOnResetButton();
		  boolean actualResult = cp.checkOnTableTitleIsDisplayed();
		  boolean expectedResult = true;
		  Assert.assertEquals(expectedResult,actualResult,Constants.CP_verifyUserIsAbleToResetTheCategory); 
	}
	
}
