package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass{
	LoginPage login;
	HomePage home;
	 @Test
	  public void verifyUserLoginWithValidCredentials() throws IOException {
		  
		  login=new LoginPage(driver);
		  home= login.loginByUsingExcelData();
		 
		  boolean autualreasult=login.ishomepageloaded();
		  boolean expectedresult=true;
		  Assert.assertEquals(expectedresult, autualreasult,Constants.lp_verifyLoginWithVaildCredenials);
		  
	  }
	  @Test(dataProvider="data provider")
	  public void verifyUserLoginWithValidUsernameAndInvalidPassword(String username,String password) {
		 
		    login = new LoginPage(driver);
		    home=login.enterUsername(username).enterPassword(password).clickOnSignInButton();
		    boolean actualResult = login.getAlertMessage().contains("Invalid Username/Password");
		    boolean expectedResult = true;
		    Assert.assertEquals(expectedResult,actualResult,Constants.lp_verifyLoginWithValidUsernameAndInvalidPassword); 
	  }
	  @DataProvider(name="data provider")
	  
	  public Object[][] dpmethod()
	  {
		  return new Object[][] {{"adminadmin","admin"},{"admin66","admin"},{"admin3","admin"}};
	  }
	  @Test
	  public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
	    
		  
	    login = new LoginPage(driver);
	    home=login.loginByUsingExcelData1();
	    boolean actualResult = login.getAlertMessage().contains("Invalid Username/Password");
	    boolean expectedResult = true;
	    Assert.assertEquals(expectedResult,actualResult,Constants.lp_verifyLoginWithInvalidUsernameAndValidPassword);
	  }
	  
	  @Test
	  public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
	    
		  
	    login = new LoginPage(driver);
	    home=login.loginByUsingExcelData2();
	    boolean actualResult = login.getAlertMessage().contains("Invalid Username/Password");
	    boolean expectedResult = true;
	    Assert.assertEquals(expectedResult,actualResult,Constants.lp_verifyLoginWithInvalidUsernameAndInvalidPassword);
	  }
	  
	

}
