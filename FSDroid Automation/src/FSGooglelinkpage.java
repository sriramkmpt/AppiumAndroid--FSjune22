package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import wrappers.GenericWrappers;

public class FSGooglelinkpage extends GenericWrappers {

	public FSGooglelinkpage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

//	public FSGooglelinkpage clickGAccount() {
	public FSSHomePage clickGAccount() {	
		sleep(5000);
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='fstester1 tpn']"))) {
			sleep(5000);
			reportStep(" Google Account clicked successfully", "PASS");
			//click(getWebElement("xpath", "//android.widget.TextView[@text='LOG IN']"));
//			sleep(15000);
//			click(getWebElement("id", "FSHOMEsettingsicon"));
			sleep(3000);
		} else {
			reportStep("Google Account click failed", "FAIL");
		}
		return new FSSHomePage(driver,test);
		//return this;
	}
	public FSGooglelinkpage clickLinkAccounts() {
		if (click(getWebElement("xpath", "//android.widget.TextView[@text='Link Accounts']"))) {
			reportStep("LinkAccts button clicked successfully", "PASS");
			sleep(15000);
		} else {
			reportStep("LinkAccts button click failed", "FAIL");
		}
		return new FSGooglelinkpage(driver,test);
	}
//}
	public FSGooglelinkpage clickUnLinkAccounts() {
	
		if (click(getWebElement("id", "btn_unlink"))) {
			reportStep("UnLinkAccts button clicked successfully", "PASS");
			sleep(15000);
			closebrowserApp();
			sleep(15000);
		} else {
			reportStep("UnLinkAccts button click failed", "FAIL");
		}
		return new FSGooglelinkpage(driver,test);
}
	
}
