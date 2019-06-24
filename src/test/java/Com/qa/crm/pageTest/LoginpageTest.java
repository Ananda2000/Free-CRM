package Com.qa.crm.pageTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import Com.qa.Utils.CustomListners;
import Com.qa.crm.page.Loginpage;
import TestBase.testBase;
@Listeners (CustomListners.class)
public class LoginpageTest extends testBase {
	/*
	 * public LoginpageTest() throws IOException { super(); // TODO Auto-generated
	 * constructor stub }
	 */


	Loginpage lnpage;
	JavascriptExecutor js;
	// dffdd
	//sdlfijl
	@BeforeMethod
	public void startup() {
		initialize();
		lnpage = new Loginpage();
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		js= (JavascriptExecutor)driver;
		
	}

	
	@Test
	public void firstTest() {
		lnpage.checkingUI();
	}
	
	@Test
	
	public void validatepageTitle() {
		String title =lnpage.checkpagetitle();
		AssertJUnit.assertEquals(title, "Free CRM software in the cloud", "Displaying wrong page title");
	}
	
	
	@Test
	@Parameters({"uname","psward"})
	public void validlogincredentials(String uname,String psward) throws IOException {
		lnpage.validlogin(uname,psward);
		System.out.println("click on the first page login button");
		
	}
	
	/*
	 * @AfterMethod public void teardown() { driver.quit(); }
	 */
}
