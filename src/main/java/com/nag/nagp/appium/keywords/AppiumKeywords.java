package com.nag.nagp.appium.keywords;

import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nag.nagp.client.AppiumClient;
import com.nag.nagp.customException.ElementNotClickable;
import com.nag.nagp.customException.ElementNotFound;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumKeywords {
	public static final Logger LOGGER = Logger.getLogger(AppiumKeywords.class);
	
	
	public void waitForElementLoad(By by,int time) {
		WebDriverWait wait = new WebDriverWait(AppiumClient.getDriver(), time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void click(By by) throws ElementNotClickable {
		try {
			waitForElementLoad(by,30);
			AppiumClient.getDriver().findElement(by).click();
			LOGGER.info("Mobile Element [" + by + "] clicked.");			
		}
		catch (Exception e) {
			LOGGER.error("Mobile Element " + " [" + by + "] is not present or not clickable.");	
			throw new ElementNotClickable("Mobile Element " + " [" + by + "] is not present or not clickable.");
		}
	}
	
	public void sendKeys(By by, String text) throws ElementNotFound {
		try {
			waitForElementLoad(by,30);
			MobileElement we=AppiumClient.getDriver().findElement(by);
			we.clear();
			we.sendKeys(text);
			LOGGER.info(text + " enterted in Mobile Element : [" + by + "]");
		}
		catch (Exception e) {
			LOGGER.error("Mobile Element " + " [" + by + "] is not present.");	
			throw new ElementNotFound("Mobile Element " + " [" + by + "] is not present.");
		}		
	}

	public String getText(By by) throws ElementNotFound {
		try {
			waitForElementLoad(by,30);
			MobileElement we=AppiumClient.getDriver().findElement(by);
			String text=we.getText();
			LOGGER.info(text + " extracted from Mobile Element : [" + by + "]");
			return text;
		}
		catch (Exception e) {
			LOGGER.error("Mobile Element " + " [" + by + "] is not present.");	
			throw new ElementNotFound("Mobile Element " + " [" + by + "] is not present.");
		}		
	}

	

	public boolean verifyExist(By by){
		try {			
			waitForElementLoad(by,10);
			if (AppiumClient.getDriver().findElement(by).isEnabled()) {			
				LOGGER.info("Mobile Element : [" + by + "] found.");
				return true;
			}			
		}
		catch (Exception e) {
			LOGGER.info("Mobile Element " + " [" + by + "] is not present.");
		}	
		return false;
	}

	public List<MobileElement> getElementList(By by) throws Exception{
		try {
			AppiumClient.getDriver().manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
			List<MobileElement> we=AppiumClient.getDriver().findElements(by);
			return we;			
		}
		catch (Exception e) {
			LOGGER.error("Mobile Element " + " [" + by + "] is not present.");
			throw e;
		}		
	}
	
	public String getTitle() {
		try {
			String title=AppiumClient.getDriver().getTitle();
			LOGGER.info("Page Title : "+ title);
			return title;
		}
		catch (Exception e) {
			LOGGER.info("Error while extracting title.");
			throw e;
		}
	}
	
	
	
	public void scrollDown() {
		Dimension dimension =AppiumClient.getDriver().manage().window().getSize();
		double scrollHeightStart =dimension.getHeight() * 0.8;
		int scrollStart = (int)scrollHeightStart;
		double scrollHeightEnd = dimension.getHeight() * 0.1;
		int scrollEnd = (int)scrollHeightEnd;
		new TouchAction((PerformsTouchActions) AppiumClient.getDriver())
			.press(PointOption.point(0,scrollStart))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(0,scrollEnd))
			.release().perform();
	}
	
	
}
