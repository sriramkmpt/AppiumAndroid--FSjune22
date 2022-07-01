package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSHomePageTopBar extends GenericWrappers {

	public FSHomePageTopBar(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 


	public FSSHomePage GetFreeChips() {
		sleep(5000);
		click(getWebElement("id", "layoutFS"));
		reportStep("Fantasy Spin offers clicked successfully", "PASS");
		sleep(5000);
		switchToAnotherApp("com.footballnation.fantasyspin.debug");
		sleep(5000);
		click(getWebElement("id", "layoutShop"));
		reportStep("Shop rewards tab clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "ivFS"));
		reportStep("FS Store rewards tab clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "btnGet"));
		reportStep("FS Store Get Free chips clicked successfully", "PASS");
		sleep(5000);
		switchToAnotherApp("com.footballnation.fantasyspin.debug");
		sleep(5000);
		click(getWebElement("id", "btnClose"));
		reportStep("Close button clicked successfully to load Home Page", "PASS");
		sleep(3000);
		click(getWebElement("id", "ivSwingJuice"));
		sleep(5000);
		reportStep("Swing Juice rewards tab clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "btnGet"));
		reportStep("FS Store Get Free chips clicked successfully", "PASS");
		sleep(5000);
		switchToAnotherApp("com.footballnation.fantasyspin.debug");
		sleep(5000);
		click(getWebElement("id", "btnClose"));
		reportStep("Close button clicked successfully to load Home Page", "PASS");
		sleep(3000);
//		switchToAnotherApp("com.footballnation.fantasyspin.debug");
//		sleep(5000);
		click(getWebElement("id", "iv_nav_back"));
//		reportStep("back button clicked successfully to load Home Page", "PASS");
		sleep(3000);
		click(getWebElement("id", "layoutTasks"));
		reportStep("Complete Tasks clicked successfully", "PASS");
		sleep(3000);
		click(getWebElement("id", "iv_nav_back"));
		sleep(5000);
		click(getWebElement("id", "layoutVideos"));
		reportStep("Watch Videos clicked successfully", "PASS");
		sleep(3000);
		click(getWebElement("id", "iv_nav_back"));
		sleep(5000);
		click(getWebElement("id", "layoutFriends"));
		reportStep("Invite Friends clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "btn_continue"));
		reportStep("Continue Button clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "iv_nav_back"));
		sleep(5000);
		if (getWebElement("id", "layoutDailySpin").isEnabled())
		{
		click(getWebElement("id", "layoutDailySpin"));
		reportStep("Daily Spin Menu clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "iv_spin"));
		reportStep("Daily Spin Button clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "iv_dlg_close"));
		reportStep("Close Button clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "iv_nav_back"));

		}
		return new FSSHomePage(driver,test);
	}
	
	public FSSHomePage redeemTokens() {
		sleep(5000);
		click(getWebElement("id", "btnRedeem"));
		reportStep("View Redeem Tokens clicked successfully", "PASS");
		sleep(5000);
		switchToAnotherApp("com.footballnation.fantasyspin.debug");
		sleep(5000);	
		click(getWebElement("id", "iv_nav_back"));
		reportStep("back button clicked successfully to load Home Page", "PASS");
		sleep(5000);
		return new FSSHomePage(driver,test);
	}
	
	public FSSHomePage Notification() {
//		sleep(5000);
		if (getWebElement("id", "FSNOTclearcollectbtn").isEnabled())
		{
		click(getWebElement("id", "FSNOTclearcollectbtn"));
		reportStep("Collect button clicked successfully", "PASS");
		sleep(3000);
		}
		click(getWebElement("id", "FSNOTclosebtn"));
		reportStep("Close button clicked successfully to load Home Page", "PASS");
		sleep(3000);
//		click(getWebElement("id", "iv_nav_back"));
//		sleep(3000);
		return new FSSHomePage(driver,test);
	}
	
	
}

