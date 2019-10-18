package pageObjects;

import org.openqa.selenium.By;

public interface SortPage {
	
	By cancel=By.xpath("//android.widget.Button[@text='CANCEL']");
	By clear=By.xpath("//android.widget.Button[@text='CLEAR']");
//	By salaryHighToLow=By.xpath("//android.widget.CheckedTextView[@text='Salary - High to Low']");
//	By newJob=By.xpath("//android.widget.CheckedTextView[@text='New Job']");
//	By jobViewHighToLow=By.xpath("//android.widget.CheckedTextView[@text='Job View - High to Low']");
	
	String sortByXpath="//android.widget.CheckedTextView[@text='<sortBy>']";

}
