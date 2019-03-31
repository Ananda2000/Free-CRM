package Com.qa.crm.pageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.qa.Utils.CustomListners;
import Com.qa.crm.page.Loginpage;
import TestBase.testBase;
@Listeners (CustomListners.class)
public class LoginpageTest extends testBase {
	Loginpage lnpage;
	// dffdd
	//
	@BeforeMethod
	public void startup() {
		initialize();
		lnpage = new Loginpage();
	}

	
	@Test
	public void firstTest() {
		lnpage.checkingUI();
	}
	
	@Test
	
	public void validatepageTitle() {
		String title =lnpage.checkpagetitle();
		Assert.assertEquals(title, "Free CRM software in the cloud", "Displaying wrong page title");
	}
	
	@Test
	public void validlogincredentials() {
		lnpage.validlogin();
		System.out.println("click on the first page login button");
		
	}
	
	/*
	 * @AfterMethod public void teardown() { driver.quit(); }
	 */
}
