package testRunner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.nag.nagp.client.AppiumClient;
import com.nag.nagp.common.util.Utilities;
import com.nag.nagp.propertyReader.PropertyReader;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import stepDef.SignUp;


@CucumberOptions(features= {"src/test/java/features"},
		glue= {"stepDef"},
		tags = {"~@Ignore"},
		dryRun=false,		
				plugin = { "pretty", "com.cucumber.listener.ExtentCucumberFormatter:",
		"json:target/cucumber-reports/Cucumber.json" }, 
		monochrome=true)


public class TestNGRunner extends AbstractTestNGCucumberTests {
	

	/**
	 * 
	 */
	
	AppiumDriverLocalService service;
	
	public static HashMap<String, String> configProperties;
	public static String absPath = System.getProperty("user.dir");
	public static final Logger LOGGER = Logger.getLogger(TestNGRunner.class);
	
	public static String currentFolder="";
	
	@BeforeSuite
	public void intiateAppiumServer() throws Exception {
		configProperties=new PropertyReader().getProperties(absPath+"\\src\\test\\resources\\config.Properties");
		String currentFolder=absPath + configProperties.get("htmlReportFolder");//+"\\"+(utility.getCurrentDateTime().replaceAll("/","-").replaceAll(":", "-"));
    	File[] directories = new File(currentFolder).listFiles(File::isDirectory);
    	if(!(new File(currentFolder).exists())) 
    		new File(currentFolder).mkdir();
    	else if(directories.length > 0) {
    		new Utilities().archieveLastReports(directories[0].getPath());
    	}
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
		String reportFolderName = sdf.format(new Date());
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		String reportPath=absPath+configProperties.get("htmlReportFolder") + "/" + reportFolderName + "/cucumber_report.html";
		extentProperties.setReportPath(reportPath);
		TestNGRunner.currentFolder=absPath+configProperties.get("htmlReportFolder") + "/" + reportFolderName;

    	
		service =AppiumDriverLocalService.buildDefaultService();
		if(!Utilities.checkIfServerIsRunnning(4723)) {
			service.start();		
		}
		AppiumClient.launchApplication();
		new SignUp();		
	}
	
	/*
	 * This method is called after test suite completion and kill the driver and stop appium server.
	 */
	@AfterSuite
	public void stopAppiumServer() {
		AppiumClient.quitDriver();
		service.stop();
	}
	

	/*
	 * This method is called after test class completion to publish report
	 */
	
	
	@AfterClass
	public static void teardown() {
		Reporter.loadXMLConfig(new File(".\\src\\test\\resources\\extent.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", System.getProperty("os.name"));
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	
	
}
