package stepDef;



import com.nag.nagp.appium.keywords.AppiumKeywords;
import com.nag.nagp.client.AppiumClient;

import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import pageObjects.HomePage;

public class Hooks {

	@Before
    public void navigateToLandingPage(){		
		while(!new AppiumKeywords().verifyExist(HomePage.searchBox)) {			
			((AndroidDriver) AppiumClient.getDriver()).pressKeyCode(AndroidKeyCode.BACK);			
		}
//		AppiumClient.getDriver().pressKeyCode(AndroidKeyCode.BACK);
    }	
}
