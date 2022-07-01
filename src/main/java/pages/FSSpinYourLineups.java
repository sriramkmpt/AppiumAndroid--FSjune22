package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSSpinYourLineups extends GenericWrappers {

	public FSSpinYourLineups(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	public FSSHomePage clickSelectedsport() {
		
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='MLB Baseball']"))) {
			reportStep("MLB BaseBall button clicked successfully", "PASS");
			sleep(5000);
			click(getWebElement("id", "btnPlay"));
			sleep(8000);
			reportStep("Spin screen 5K Display ", "PASS");
			click(getWebElement("xpath", "//android.widget.TextView[@text='5K']"));
			reportStep("5K tourney button clicked  successfully", "PASS");
			sleep(5000);
			click(getWebElement("id", "iv_spin"));
			reportStep("Spin button clicked successfully", "PASS");
			sleep(20000);
			click(getWebElement("id", "FSspinprvbtn"));
			sleep(5000);
			reportStep("Spin screen LockInLineup button clicked", "Pass");
			click(getWebElement("id", "FSLUPhomebtn"));
			sleep(3000);
			reportStep("Lineup screen Home button clicked", "Pass");
			
			
		} else {
			reportStep("MLB BaseBall button click failed", "FAIL");
		}
		return new FSSHomePage(driver,test);
	}
	
}
