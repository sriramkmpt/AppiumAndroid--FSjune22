package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FSLoginPage;
import pages.FSSignupPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class HowToPlay extends ProjectSpecificWrappers {
	@BeforeTest
	public void bt() {
		testCaseName = "Sign screen - How to Play checks";
		testDescription = "Sign screen - How to Play screens checks";
		testNodes = "FSapp";
		dataSheetName = "INP1"; 
	}


	@Test
	public void runTC() {
		new FSSignupPage(driver, test)
			.clickHWPM()
			.clickHWP1();
			
	}

}
