package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FSDailyspinpage;
import pages.FSLoginPage;
import pages.FSSignupPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class FSHomePageContainer extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Login as Valid User and check Home page GetFreeChips.MyTourneys,Freinds&Crews,New widegts link checks,etc.";
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
		.clickGetFreeChips()
		.GetFreeChips()
		.clickMyTournamentsEntered()
		.CheckMyTournamentsEntered()
		.clickFriendsandCrews()
		.CheckFriendsandCrews()
		.checkWidegetsShopGear()
		.clickWidegetsShopGear()
		.checkWidegetsIviteFriend()
		.clickWidegetsIviteFriend()
		.checkWidegetsDailyVideoRewards()
		.clickWidegetsDailyVideoRewards()
		.checkWidegetsDailySpin()
		.clickSettings()
		.clickLinkAccounts()
		.clickUnLinkAccounts();
		
	}

}
