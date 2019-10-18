package pageObjects;

import org.openqa.selenium.By;

public interface HomePage {
	
	By searchBox=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/et_inputSearch");
	By filterButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/btn_filter");
	By sortButton=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/btn_sort");
	By jobsTab=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/navigation_home");
	By jobAddressTab=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/navigation_applied");
	By tipTab=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/navigation_wall");
	By profileTab=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/navigation_ham_menu");
	By shareWinTab=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/navigation_share_win");
	By jobTitle=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/tv_heading");
	By uploadResume=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/tv_fill_profile");
	By notificationIcon=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/action_notifications");
	By syncIcon=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/action_sync");
	By shareIcon=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/action_share");
	
	By newIcon=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/fab");
	By sortByText=By.xpath("//*[@resource-id='in.workindia.nileshdungarwal.workindiaandroid:id/btn_sort']/android.widget.TextView");
	
	By jobCount=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/tv_description");
	
	By sortByType=By.id("in.workindia.nileshdungarwal.workindiaandroid:id/tv_sort_by");
	
	
}
