package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSHomePageCareer extends GenericWrappers {

	public FSHomePageCareer(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 


	public FSSHomePage Career() {
//		sleep(15000);
//		scrollFromDownToUpinAppUsingPointerInput();
//		sleep(15000);
//		click(getWebElement("id", "FSCSTrophies"));
//		reportStep("Trophies tab clicked successfully", "PASS");
//		sleep(15000);		
//		click(getWebElement("id", "FSCSachvment"));
//		reportStep("Achievment tab clicked successfully", "PASS");
//		sleep(15000);	
//		click(getWebElement("id", "FSCSstats"));
//		reportStep("Stats tab clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "FSCSclosebtn"));
		reportStep("Close button clicked successfully to load Home Page", "PASS");
		sleep(1000);
		return new FSSHomePage(driver,test);
	}

	
}

