package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FSDailyspinpage;
import pages.FSLoginPage;
import pages.FSSignupPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class FSHPtopbar extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Login as Valid User and check howtoplay,scoring,FAQ,Feedback etc";
		testDescription = "Login Valid User - settings and other releated link checks";
		testNodes = "FSapp";
		dataSheetName = "INP2";
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
			.clickTopChipsIcon()
			.GetFreeChips()
			.ClickTopTokenBal()
			.redeemTokens()
			.clickNotifyIcon()
			.Notification()
			.clickSettings()
			.clickLinkAccounts()
			.clickUnLinkAccounts();
		
	}

}
