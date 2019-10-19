package stepDef;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.nag.nagp.appium.keywords.AppiumKeywords;
import com.nag.nagp.client.AppiumClient;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import pageObjects.HomePage;
import testRunner.TestNGRunner;

public class Hooks {

	
	/*
	 * This hook is called after each scenario and verify if user is on landing page or not.
	 * Redirect user to Landing page. 
	 */
	@Before
    public void navigateToLandingPage(){		
		while(!new AppiumKeywords().verifyExist(HomePage.searchBox)) {			
			((AndroidDriver) AppiumClient.getDriver()).pressKeyCode(AndroidKeyCode.BACK);			
		}
//		AppiumClient.getDriver().pressKeyCode(AndroidKeyCode.BACK);
    }	
	
	@After	
	public void afterEachScenario(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			File sourcePath = ((TakesScreenshot) AppiumClient.getDriver()).getScreenshotAs(OutputType.FILE); 
			File destinationPath = new File(TestNGRunner.currentFolder+"/" + scenario.getName().replaceAll(" ", "_") + ".png"); 
			FileUtils.copyFile(sourcePath, destinationPath); 
			Reporter.addScreenCaptureFromPath(TestNGRunner.currentFolder+"/" +scenario.getName().replaceAll(" ", "_") + ".png");
		}
	}
}
