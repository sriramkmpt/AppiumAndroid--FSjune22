package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.SendKeysAction;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.windows.PressesKeyCode;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;
import wrappers.AndroidWrappers;

public class FSSHomePageContainer extends GenericWrappers {

	public FSSHomePageContainer(AppiumDriver<WebElement> driver, ExtentTest test) {
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
		click(getWebElement("id", "iv_nav_back"));
		return new FSSHomePage(driver,test);
	}

	
    public FSSHomePage CheckMyTournamentsEntered() {
		
//	    if (click(getWebElement("id", "FSHOMEmytourneybtn"))){
//		reportStep("MyTournamentsEntered button clicked successfully", "PASS");
		sleep(3000);	
		click(getWebElement("id", "iv_nav_back"));
		sleep(3000);	
//	 } else {
//		reportStep("MyTournamentsEntered button Not clicked successfully", "PASS");
//		}
	    return new FSSHomePage(driver,test);	
	}
    public FSSHomePage CheckFriendsandCrews() {
		
//	    if (click(getWebElement("id", "FSHOMEFandCbtn"))){
//		reportStep("FriendsandCrews button clicked successfully", "PASS");
		sleep(3000);
		click(getWebElement("id", "iv_nav_back"));
		sleep(3000);
//		scrollFromDownToUpinAppUsingPointerInput();
//		sleep(15000);
//	 } else {
//		reportStep("FriendsandCrews button not clicked successfully", "PASS");
//		}
	    return new FSSHomePage(driver,test);	
	}
    
//public FSSHomePage clickWidegetsDailySpin() {
//	
//	click(getWebElement("xpath", "//android.widget.TextView[@text='Spin Today!']"));
//	reportStep("Daily Spin Wideget Option button clicked successfully", "PASS");
//	sleep(5000);
//	click(getWebElement("id", "iv_spin"));
//	reportStep("Daily Spin Button clicked successfully", "PASS");
//	sleep(5000);
//	click(getWebElement("id", "iv_dlg_close"));
//	reportStep("Close Button clicked successfully", "PASS");
//	sleep(5000);
//	click(getWebElement("id", "iv_nav_back"));
//	
//	return new FSSHomePage(driver,test);	
//}

public FSSHomePage clickWidegetsShopGear() {
	
	click(getWebElement("xpath", "//android.widget.TextView[@text='See Deals!']"));
	reportStep("Daily Spin Wideget Option button clicked successfully", "PASS");
	sleep(5000);
//	click(getWebElement("id", "layoutShop"));
//	reportStep("Shop rewards Widegets button clicked successfully", "PASS");
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
	click(getWebElement("id", "iv_nav_back"));
	
	return new FSSHomePage(driver,test);	
}

public FSSHomePage clickWidegetsDailyVideoRewards() {
	
	click(getWebElement("xpath", "//android.widget.TextView[@text='Get 1200 Chips!']"));
	reportStep("Watch Videos clicked successfully", "PASS");
	sleep(3000);
	click(getWebElement("id", "iv_nav_back"));
	sleep(5000);
	
	return new FSSHomePage(driver,test);	
}

public FSSHomePage clickWidegetsIviteFriend() {
	
	click(getWebElement("xpath", "//android.widget.LinearLayout[1]/android.widget.TextView[1][@index=0 and @resource-id='com.footballnation.fantasyspin.debug:id/tvAction' and @bounds ='[590,890][996,935]']"));
	reportStep("Invite Friend clicked successfully", "PASS");
	sleep(5000);
	click(getWebElement("id", "btn_continue"));
	reportStep("Continue Button clicked successfully", "PASS");
	sleep(5000);
	click(getWebElement("id", "iv_nav_back"));
	sleep(5000);
	
	return new FSSHomePage(driver,test);	
}
}
