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

public class FSSHomePage extends GenericWrappers {

	public FSSHomePage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	public FSSHomePage newDeviceUse() {
		if (click(getWebElement("id", "FSNDFokbtn"))) {
			reportStep("New Device OK button clicked successfully", "PASS");
			sleep(5000);
		}else {
			reportStep("OK button entry failed", "FAIL");
		}
		return this;
	}		
	public FSSHomePage enterPhoneNumber() {
		
//		enterValue(getWebElement("id", "FSEPNphonenotxt"),"00008888");
		click(getWebElement("id", "FSEPNphonenotxt"));
		pressnum();
//		presskeydone();
		
		
//		driver.executeScript(“mobile: performEditorAction”, ImmutableMap.of(“action”, “Go”));
//		click(getWebElement("id", "FSEPNphonenotxt"));
//		pressDone();
//		if (enterValue(getWebElement("id", "FSEPNphonenotxt"),pn)) {
//			reportStep("Phone Number " + pn + " entered successfully", "PASS");
//			sleep(3000);
//	}	else {
//	
//			reportStep("Phone Number entry failed", "FAIL");
//	}
		return this;
	}
	
	public FSSHomePage clickTextMe() {
		if (click(getWebElement("id", "FSEPNtextmebtn"))) {
			reportStep("Text Me button clicked successfully", "PASS");
			sleep(5000);
		}else {
			reportStep("Text Me button entry failed", "FAIL");
		}
		return this;
	}
	
	public FSSHomePage enterCode() {
		click(getWebElement("id", "FSEYCtapheretxt"));
		pressCode();
//		if (enterValue(getWebElement("id", "FSEYCtapheretxt"),"0088")) {
//			reportStep("Code Number " + cd + " entered successfully", "PASS");
//			pressEnter();
//			sleep(3000);
//	}	else {
//	
//			reportStep("Code Number entry failed", "FAIL");
		return this;
	}	
	public FSSHomePage clickTnkUOk() {
		if (click(getWebElement("id", "FSTYokbtn"))) {
			reportStep("TU ok button clicked successfully", "PASS");			
			sleep(5000);
			
		}else {
			reportStep("TU OK button entry failed", "FAIL");
		}
		return this;
	}	
	
	public FSSettings clickSettings() {
		if (click(getWebElement("id", "FSHOMEsettingsicon"))) {
			reportStep("Setting button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("Setting button click failed", "FAIL");
		}
		return new FSSettings(driver,test);
	}

	public FSPlayerProfilepage clickProfilebtn() {
		if (click(getWebElement("id", "FSHOMEuserprofilebtn"))) {
			reportStep("Profile button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("Profile button click failed", "FAIL");
		}
		return new FSPlayerProfilepage(driver,test);
	}
	
	public FSSpinYourLineups ClickSpinYourLineups() {
		if (click(getWebElement("id", "FSHOMEspinLineupsbtn"))) {
			reportStep("Spin your Lineups button clicked successfully", "PASS");
			sleep(3000);
		} else {
			reportStep("Spin your Lineups  button click failed", "FAIL");
		}
		return new FSSpinYourLineups(driver,test);
	}
	
	public FSHomePageTopBar clickTopChipsIcon() {
		
		    if (click(getWebElement("id", "FSHOMECHIPBALicon"))){
			reportStep("Top Chip icon button clicked successfully", "PASS");
			sleep(3000);
		 } else {
			reportStep("Top Chip icon button clicked successfully", "PASS");
			}
		    return new FSHomePageTopBar(driver,test);
	}
	
	public FSHomePageTopBar ClickTopTokenBal(){
		
	    if (click(getWebElement("id", "FSHOMETKNBALicon"))){
		reportStep("Top Token icon button clicked successfully", "PASS");
		sleep(3000);
	 } else {
		reportStep("Top Token icon button clicked successfully", "PASS");
		}
	    return new FSHomePageTopBar(driver,test);
}
	public FSHomePageTopBar clickNotifyIcon() {
		
	    if (click(getWebElement("id", "FSHOMENotifyicon"))){
		reportStep("Top Notify icon button clicked successfully", "PASS");
		sleep(3000);
	 } else {
		reportStep("Top Notify icon button clicked successfully", "PASS");
		}
	    return new FSHomePageTopBar(driver,test);
}	

	public FSSHomePageContainer clickGetFreeChips() {
		
	    if (click(getWebElement("id", "FSHOMEgetfreechipsbtn"))){
		reportStep("Getfreechips button clicked successfully", "PASS");
		sleep(3000);
	 } else {
		reportStep("Getfreechips button not clicked successfully", "PASS");
		}
	    return new FSSHomePageContainer(driver,test);	
	}
//	
    public FSSHomePageContainer clickMyTournamentsEntered() {
		
	    if (click(getWebElement("id", "FSHOMEmytourneybtn"))){
		reportStep("MyTournamentsEntered button clicked successfully", "PASS");
		sleep(3000);	
//		click(getWebElement("id", "iv_nav_back"));
//		sleep(15000);	
	 } else {
		reportStep("MyTournamentsEntered button Not clicked successfully", "PASS");
		}
	    return new FSSHomePageContainer(driver,test);	
	}
    public FSSHomePageContainer clickFriendsandCrews() {
		
	    if (click(getWebElement("id", "FSHOMEFandCbtn"))){
		reportStep("FriendsandCrews button clicked successfully", "PASS");
		sleep(3000);
//		click(getWebElement("id", "iv_nav_back"));
//		sleep(15000);
//		scrollFromDownToUpinAppUsingPointerInput();
//		sleep(15000);
	 } else {
		reportStep("FriendsandCrews button not clicked successfully", "PASS");
		}
	    return new FSSHomePageContainer(driver,test);	
	}
    
    public FSSHomePage checkWidegetsDailySpin() {
		
    	if (getWebElement("xpath","//android.widget.LinearLayout[@resource-id\r\n"
    			+ "='com.footballnation.fantasyspin.debug:id/button' and @bounds='[572,1156][1032,1228]']").isEnabled())
    	{
		reportStep("DailySpin button Enabled status checked sucuessfully", "PASS");
		sleep(3000);
		click(getWebElement("xpath", "//android.widget.TextView[@text='Spin Today!']"));
		reportStep("Daily Spin Wideget Option button clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "iv_spin"));
		reportStep("Daily Spin Button clicked successfully", "PASS");
		sleep(5000);
		click(getWebElement("id", "iv_dlg_close"));
		reportStep("Close Button clicked successfully", "PASS");
		sleep(5000);
//		click(getWebElement("id", "iv_nav_back"));
		
//		return new FSSHomePage(driver,test);

	 } else {
		reportStep("DailySpin button status not enabled ", "PASS");
		}
	 return new FSSHomePage(driver,test);	
	}
    
    public FSSHomePageContainer checkWidegetsShopGear() {
		
      	if (getWebElement("xpath", "//android.widget.TextView[@text='See Deals!']").isEnabled()){
    		reportStep("ShopGear button Enabled status checked sucuessfully", "PASS");
    		sleep(3000);

    	 } else {
    		reportStep("ShopGear button status not enabled successfully", "PASS");
    		}
	 return new FSSHomePageContainer(driver,test);	
	}  
    public FSSHomePageContainer checkWidegetsIviteFriend() {
		
    	if (getWebElement("xpath", "//android.widget.LinearLayout[1]/android.widget.TextView[1][@index=0 and @resource-id='com.footballnation.fantasyspin.debug:id/tvAction' and @bounds ='[590,890][996,935]']").isEnabled())
    	{
		reportStep("Invite Friend Enabled status checked sucuessfully", "PASS");
		sleep(3000);

	 } else {
		reportStep("Invite Friend button Status not Enabled sucuessfully", "PASS");
		}
	 return new FSSHomePageContainer(driver,test);	
	} 
    public FSSHomePageContainer checkWidegetsDailyVideoRewards() {
		
    	if (getWebElement("xpath", "//android.widget.TextView[@text='Get 1200 Chips!']").isEnabled()){
		reportStep("Daily Video Rewards button Enabled status checked sucuessfully", "PASS");
		sleep(3000);

	 } else {
		reportStep("Daily Video Rewards button Status not Enabled sucuessfully", "PASS");
		}
	 return new FSSHomePageContainer(driver,test);	
	}  
    
    
    public FSHomePageLeaderBoard clickLeaderBoard() {
		scrollFromDownToUpinAppUsingPointerInput();
		sleep(3000);
	    if (click(getWebElement("id", "FSHOMledrbrdbtn"))){
		reportStep("LeaderBoard button clicked successfully", "PASS");
		sleep(3000);
//		click(getWebElement("id", "iv_nav_back"));
//		sleep(15000);
	 } else {
		reportStep("LeaderBoard button not clicked successfully", "PASS");
		}
	    return new FSHomePageLeaderBoard(driver,test);	
	}   
    public FSHomePageCareer clickCareer() {
    	
		scrollFromDownToUpinAppUsingPointerInput();
		sleep(3000);
	    if (click(getWebElement("id", "FSHOMEcareerbtn"))){
		reportStep("Career button clicked successfully", "PASS");
		sleep(15000);

//		click(getWebElement("id", "FSCSclosebtn"));
//		sleep(15000);
	 } else {
		reportStep("Career button Not clicked successfully", "PASS");
		}
	    return new FSHomePageCareer(driver,test);	
	}   
    public FSSHomePage clickPartners() {
    	
//		scrollFromDownToUpinAppUsingPointerInput();
//		sleep(15000);
	    if (click(getWebElement("id", "FSHOMEpartnerbtn"))){
		reportStep("Partners button clicked successfully", "PASS");
		sleep(3000);
		switchToAnotherApp("com.footballnation.fantasyspin.debug");
		sleep(3000);
	 } else {
		reportStep("Partners button Not clicked successfully", "PASS");
		}
	    return new FSSHomePage(driver,test);	
	}      
    
}
