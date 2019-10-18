package com.nag.nagp.client;

import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.nag.nagp.propertyReader.PropertyReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumClient {
	private static AppiumDriver<MobileElement> driver;

	private static void launchDriver() throws Exception {
		HashMap<String, String> configProperties=new PropertyReader().getProperties(".\\src\\test\\resources\\config.Properties");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, configProperties.get("PLATFORM_NAME"));
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, configProperties.get("DEVICE_NAME"));
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, configProperties.get("PLATFORM_VERSION"));
		
		
		caps.setCapability("app", configProperties.get("AppPath"));
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"in.workindia.nileshdungarwal.workindiaandroid.RegisterActivity");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
				"in.workindia.nileshdungarwal.workindiaandroid"); 
		
		URL serverURL =new URL(configProperties.get("hostName"));
		driver=new AndroidDriver<MobileElement>(serverURL,caps);		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void quitDriver() {
		if(driver != null) {
			driver.close();
			driver.quit();
		}
	}
	
	public static WebDriver launchApplication() throws Exception{
		if(driver==null) {
			launchDriver();			
		}
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
		
}
