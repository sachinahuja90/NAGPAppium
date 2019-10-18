package pageObjects;

import org.openqa.selenium.By;

public interface FilterPage {
	
	By locFilter=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/ll_loc_filter");
	By jobType=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/gv_type_of_jobs");
	By applyButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/btn_apply");
	By resetButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/btn_cancel");
	By englishSpeakingLevel=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/ll_english_level");
	By workExp=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/ll_work_experience");
	By qualification=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/ll_qualification_field");
	
	String englishLevel="//android.widget.Button[@text='<level>']";
	
	By englishLevelMessage=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/tv_english_message_to_user");
	

}
