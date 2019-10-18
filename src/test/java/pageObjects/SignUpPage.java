package pageObjects;

import org.openqa.selenium.By;

public interface SignUpPage {

	By fullName=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/et_name");
	
	By phoneNumber=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/et_number");
	
	By submitButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/btn_submit");
	
	By submitButton2=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/btn_done");
	
	By submitButton3=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/ll_bottom_action");
	
	By welcomeMessage=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/tv_city");
	
	By mumCityButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/rb_mum");
	
	By puneCityButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/rb_pune");
	
	By delhiCityButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/rb_delhi");
	
	By bengaluruCityButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/rb_bengaluru");
	
	By nearestLocation=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/act_auto_complete");
	
	By male=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/rg_male");
	
	By graduate=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/rb_graduate");
	
	By english=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/cb_english");
	
	By fluentEnglish=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/rg_eng_level_4");
	
	By fresher=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher");
	
	By account=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/btn_sector_filter_button");
	
	By ageYear=By.xpath("//*[@class='android.widget.TextView' and @text='25 Years']");
	
	By age=By.xpath("//*[@resource-id='in.workindia.nileshdungarwal.workindiaandroid:id/ll_age']//*[@class='android.widget.ImageView']");
	
	By selectAccount=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/et_skill_1");
	
	By selectTally=By.xpath("//android.widget.TextView[@text='Tally']");
	
	By selectDegree=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/et_course");
	
	By selectBA=By.xpath("//*[@resource-id='android:id/text1' and @text='BA']");
	
	By englishButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/btn_english");
	
	
	By submitButton4=By.xpath("//android.widget.Button[@text='SUBMIT' and @resource-id='android:id/button1']");
	
	
	
	
			
	
}
