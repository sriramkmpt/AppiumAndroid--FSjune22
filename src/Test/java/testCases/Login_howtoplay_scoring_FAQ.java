package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FSDailyspinpage;
import pages.FSLoginPage;
import pages.FSSignupPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class Login_howtoplay_scoring_FAQ extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Login as Valid User-settings menu options screen flow checks";
		testDescription = "Login Valid User - settings and other releated link checks";
		testNodes = "FSapp";
		dataSheetName = "INP1";
	}


	@Test(dataProvider="fetchData")
	
	public void runTC(String un, String pwd) {
	
		new FSSignupPage(driver, test)
		
			.clickLogin()
			.enterEmailAddress(un)
			.enterPassword(pwd)
			.clickUPLogin()
			.newDeviceUse()
			.enterPhoneNumber()
			.clickTextMe()
			.enterCode()
			.clickTnkUOk()
			.clickSettings()
		    .clickHowtoplay()
		    .clickscoring()	
		    .clickFAQS()
		    .ClickLegal_support()
		    .ClickFeedback()
		    .clickLinkAccounts()
		    .clickUnLinkAccounts();
		    
		
	}

}
