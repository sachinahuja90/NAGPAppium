package stepDef;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.nag.nagp.appium.keywords.AppiumKeywords;

import cucumber.api.java.en.*;
import pageObjects.HomePage;
import pageObjects.SortPage;

public class SortingStepsDef {
	
	private AppiumKeywords keyword= new AppiumKeywords();
	@When("^Click on sort button$")
	public void click_on_sort_button() throws Throwable {
		keyword.click(HomePage.sortButton);
	}
	
	@When("^User is on sort pop-up of the application$")
	public void user_is_on_sort_pop_up_of_the_application() throws Throwable {
		Assert.assertTrue(keyword.verifyExist(SortPage.cancel));
	}
	
	@Then("^Validate \"([^\"]*)\" when choose different sort \"([^\"]*)\"$")
	public void validate_when_choose_different_sort(String arg1, String arg2) throws Throwable {
		String xpath=SortPage.sortByXpath.replaceAll("<sortBy>",arg2);
		keyword.click(By.xpath(xpath));
		String value=keyword.getText(HomePage.sortByType);
		Assert.assertEquals(arg1, value);		
	}

}
