package constants;

public class Constants {
	
	public static final String lp_verifyLoginWithVaildCredenials="login failed for vaild credentials";
	
	public static final String lp_verifyLoginWithValidUsernameAndInvalidPassword="Login is possible with valid username and invalid password";
	
	public static final String lp_verifyLoginWithInvalidUsernameAndValidPassword="Login is possible with invalid username and valid password";
	
	public static final String lp_verifyLoginWithInvalidUsernameAndInvalidPassword="Login is possible with invaild username and invalid password";

	public static final String CONFIGFILE=System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties";
	
	public static final String TESTDATAFILE=System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\GroceryAppdetails.xlsx";
	
	public static final String CP_verifyUserIsAbleToAddNewCategoryWithValidDetails="New category is not added successfully";
	public static final String CP_verifyUserIsAbleToSearchTheCategoryThatIsNotPresent="Category item and corresponding image is successfully displayed in the list categories table";
	public static final String CP_verifyUserIsAbleToResetTheCategory="List Categories table title is displayed not as expected";
	
	public static final String SCP_verifyUserIsAbleToAddNewSubCategoryWithValidDetails="New sub category is not added successfully";
	public static final String SCP_verifyUserIsAbleToSearchTheSubCategoryIsNotPresent="Search result message is not displayed as expected";
	public static final String SCP_verifyUserIsAbleToResetTheSubCategory="List Sub Categories table title is not displayed as expected";
	
	public static final String MNP_verifyUserIsAbleTOAddNewNewsWithValidDetails="New news is not added successfully";
	public static final String MNP_verifyUserIsAbleToSearchTheNewsThatIsNotPresent="News is successfully displayed in the manage news table";
	public static final String MNP_verifyUserIsAbleToResetTheNews="Manage News table title is not displayed as expected";
	public static final String MNP_verifyUserIsAbleToEditTheNewsWithValidDetails="The attempt to edit the news is failed.";
	
	public static final String MCP_verifyUserIsAbleToUpdateTheContactWithValidDetails="The update attempt is failed";
	
	
}
