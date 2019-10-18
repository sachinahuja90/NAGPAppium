package com.nag.nagp.testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchCalculatorApp {

	public static void main(String args[]) throws MalformedURLException {
		AppiumDriver<MobileElement> driver;
//		File appDir=new File("C:\\Users\\sachinahuja\\Downloads");
//		File app=new File(appDir, "apkpure.com.apk");
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a API 27");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
//		capabilities.setCapability(MobileCapabilityType.APP,app );
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.nexuslauncher.NexusLauncherActivity");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.apps.nexuslauncher");
		
		URL serverURL =new URL("http://localhost:"+4723+"/wd/hub");
		driver=new AndroidDriver<MobileElement>(serverURL,capabilities);
		System.out.println("dasdsa");
		
	}
	
}
