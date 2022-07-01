package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSHomePageLeaderBoard extends GenericWrappers {

	public FSHomePageLeaderBoard(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 


	public FSSHomePage LeaderBoard() {
//		sleep(15000);
//		scrollFromDownToUpinAppUsingPointerInput();
//		sleep(3000);
//		click(getWebElement("xpath", "//android.widget.FrameLayout[@resource-id='com.footballnation.fantasyspin.debug:id/drop_left']"));
		click(getWebElement("xpath", "//android.widget.TextView[@text='All Sports']"));
		reportStep("Sports type dropdown clicked successfully", "PASS");
		sleep(3000);
//		click(getWebElement("xpath", "//android.widget.FrameLayout[@resource-id='com.footballnation.fantasyspin.debug:id/drop_right']"));
		click(getWebElement("xpath", "//android.widget.TextView[@text='Weekly']"));
		reportStep("Sports type schdule dropdown clicked successfully", "PASS");
		sleep(3000);	
//		click(getWebElement("xpath", "//android.widget.FrameLayout[@resource-id='com.footballnation.fantasyspin.debug:id/drop_bottom']"));
		click(getWebElement("xpath", "//android.widget.TextView[@text='Chips Won']"));
		reportStep("Chips Won selection dropdown clicked successfully", "PASS");
		sleep(3000);
		click(getWebElement("id", "iv_nav_back"));
		reportStep("Back button clicked successfully to load Home Page", "PASS");
		sleep(3000);
		return new FSSHomePage(driver,test);
	}

	
}

