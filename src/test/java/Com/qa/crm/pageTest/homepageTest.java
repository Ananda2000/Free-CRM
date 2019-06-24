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

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.sun.java.swing.plaf.windows.TMSchema.Prop;

import Com.qa.crm.page.Homepage;
import Com.qa.crm.page.Loginpage;
import TestBase.testBase;

public class homepageTest extends testBase{
	
	Loginpage lnpage;
	Homepage homepagobjec;
	public  homepageTest() {
		
		super();
	}
	
	@BeforeTest
	public void startup() throws IOException {
		initialize();
		lnpage = new Loginpage();
		homepagobjec = lnpage.validlogin(prep.getProperty("username"), prep.getProperty("password"));
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void getthepagetitle() {
		String pagetile =homepagobjec.pagetitle();
		//String loginname1 = homepagobjec.verifytheloginname();
		//System.out.println("page title:"+pagetile);
		//System.out.println("login name==="+loginname1);
		AssertJUnit.assertEquals("CRMPRO", pagetile);
		//AssertJUnit.assertEquals("User: ananda kr", loginname1);
	}

	@Test
public void loginnameverification() {
	System.out.println("Inside loginnameverification at Homepage Test class");
	driver.switchTo().frame("mainpanel");
	String loginname = homepagobjec.verifytheloginname();
	
	AssertJUnit.assertEquals("  User: ananda kr", loginname);
}

	@Test
public void calenderselection() {
		System.out.println("++++++++++++++++++++++++++++the calenderselection method is Home pageTest class");
	homepagobjec.calendarSelection();
	
	
	
}
}
