package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;

public class ManageCategoryTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	ManageCategoryPage mcp;
	
	@Test(retryAnalyzer=retry.Retry.class,groups="smoke")
	  public void verifyUserIsAbleToAddNewManageCategoryWithValidDetails() throws IOException {
		   lp = new LoginPage(driver);
		  hp=lp.loginByUsingExcelData();
		  mcp=hp.clickOnManageCategoryButton().clickOnNewCategoryButton().enterOnCategoryField()
				  .selectGroupsOnCategoryList().clickOnChoosefile().clickOnRadioButton1()
				  .clickOnRadioButton2().clickOnSaveButton();
		  
		  boolean actualResult = mcp.getAlertMessage();
		  boolean expectedResult = true;
		  Assert.assertEquals(expectedResult,actualResult,"Alert message is not as expected");  
		  
		  
	}

}
