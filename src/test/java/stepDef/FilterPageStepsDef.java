package stepDef;

import org.apache.tools.ant.util.KeepAliveInputStream;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.nag.nagp.appium.keywords.AppiumKeywords;

import cucumber.api.java.en.*;
import pageObjects.FilterPage;
import pageObjects.HomePage;

public class FilterPageStepsDef {
	
	private AppiumKeywords keyword= new AppiumKeywords();

	@When("^Click on Filter button$")
	public void click_on_Filter_button() throws Throwable {		
		keyword.click(HomePage.filterButton);
	}

	@When("^User is on Filter page of the application$")
	public void user_is_on_Filter_page_of_the_application() throws Throwable {
		Assert.assertTrue(keyword.verifyExist(FilterPage.locFilter));
	}

	@Then("^Validate \"([^\"]*)\" when differnt \"([^\"]*)\" are selected\\.$")
	public void validate_when_differnt_are_selected(String arg1, String arg2) throws Throwable {
		String xpath=FilterPage.englishLevel.replaceAll("<level>",arg1);
		keyword.scrollDown();
		keyword.scrollDown();
		keyword.click(By.xpath(xpath));
		String label=keyword.getText(FilterPage.englishLevelMessage);
		Assert.assertEquals(label.trim(),arg2.trim());
	}

	@Then("^User can see serveral fields on the filter page$")
	public void user_can_see_serveral_fields_on_the_filter_page() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
	
		softAssert.assertTrue(keyword.verifyExist(FilterPage.locFilter),"");
		softAssert.assertTrue(keyword.verifyExist(FilterPage.jobType),"");
	   keyword.scrollDown();
	   keyword.scrollDown();
	   softAssert.assertTrue(keyword.verifyExist(FilterPage.englishSpeakingLevel),"");
	   softAssert.assertTrue(keyword.verifyExist(FilterPage.workExp),"");
	   softAssert.assertTrue(keyword.verifyExist(FilterPage.resetButton),"");
	   softAssert.assertTrue(keyword.verifyExist(FilterPage.applyButton),"");
	   keyword.click(FilterPage.applyButton);
	   softAssert.assertAll();
	   
	}
}
