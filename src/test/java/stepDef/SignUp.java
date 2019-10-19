package stepDef;

import com.nag.nagp.appium.keywords.AppiumKeywords;
import pageObjects.SignUpPage;

public class SignUp {
	
	public SignUp() throws Exception{
		AppiumKeywords keyword= new AppiumKeywords();
		
			keyword.sendKeys(SignUpPage.fullName, "Rohit");
			keyword.sendKeys(SignUpPage.phoneNumber, "1234234234");
			keyword.click(SignUpPage.submitButton);
			keyword.click(SignUpPage.mumCityButton);
			keyword.sendKeys(SignUpPage.nearestLocation, "Thane");
			keyword.click(SignUpPage.submitButton2);
			keyword.click(SignUpPage.male);		
			keyword.click(SignUpPage.graduate);
			keyword.click(SignUpPage.english);		
			keyword.click(SignUpPage.fluentEnglish);		
			keyword.scrollDown();
			keyword.click(SignUpPage.fresher);		
//			keyword.click(SignUpPage.graduate);		
			keyword.click(SignUpPage.age);		
			keyword.click(SignUpPage.ageYear);		
			keyword.click(SignUpPage.account);
			keyword.click(SignUpPage.submitButton3);
			
			keyword.click(SignUpPage.selectAccount);
			
			keyword.click(SignUpPage.selectTally);
			
			keyword.click(SignUpPage.submitButton4);
			keyword.click(SignUpPage.selectDegree);
			
			keyword.click(SignUpPage.selectBA);
			
			keyword.click(SignUpPage.submitButton2);
			
			keyword.click(SignUpPage.englishButton);
			
			keyword=null;
		
	}
	
}
