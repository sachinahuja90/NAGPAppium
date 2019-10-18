package stepDef;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.nag.nagp.appium.keywords.AppiumKeywords;
import com.nag.nagp.common.util.Utilities;

import cucumber.api.java.en.*;
import pageObjects.HomePage;


public class LandingPageStepsDef {
	
	private AppiumKeywords keyword= new AppiumKeywords();
	
	@Given("^Appium server is up and running and WorkIndia application is launched$")
	public void appium_server_is_up_and_running_and_WorkIndia_application_is_launched() throws Throwable {
		Assert.assertEquals(Utilities.checkIfServerIsRunnning(4723),true,"Appium server is not running on 4723 port.");
	}

	@When("^User is on Landing page of the application$")
	public void user_is_on_Landing_page_of_the_application() throws Throwable {
		keyword.click(HomePage.jobsTab);
		
	    Assert.assertTrue(keyword.verifyExist(HomePage.searchBox));
	}
	
	@Then("^User can see serveral tab at the botton of the application$")
	public void user_can_see_serveral_tab_at_the_botton_of_the_application() throws Throwable {
		SoftAssert softAssert =new SoftAssert();
		softAssert.assertTrue(keyword.verifyExist(HomePage.jobsTab));
		softAssert.assertTrue(keyword.verifyExist(HomePage.jobAddressTab));
		softAssert.assertTrue(keyword.verifyExist(HomePage.profileTab));
		softAssert.assertTrue(keyword.verifyExist(HomePage.shareWinTab));
		softAssert.assertTrue(keyword.verifyExist(HomePage.tipTab));
		softAssert.assertAll();
	}

	@When("^User click on \"([^\"]*)\" tab$")
	public void user_click_on_tab(String arg1) throws Throwable {
	    keyword.click(HomePage.jobsTab);
	    Assert.assertTrue(keyword.verifyExist(HomePage.searchBox));
	}

	
	@Then("^User should see several fields on the screen$")
	public void user_should_see_several_fields_on_the_screen() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(keyword.verifyExist(HomePage.filterButton));
		softAssert.assertTrue(keyword.verifyExist(HomePage.searchBox));
		softAssert.assertTrue(keyword.verifyExist(HomePage.sortButton));
		softAssert.assertTrue(keyword.verifyExist(HomePage.shareIcon));
		softAssert.assertTrue(keyword.verifyExist(HomePage.syncIcon));
		softAssert.assertTrue(keyword.verifyExist(HomePage.notificationIcon));
		softAssert.assertTrue(keyword.getElementList(HomePage.jobTitle).size()>0);
		softAssert.assertAll();
	}
	


}
