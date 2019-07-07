package Com.qa.crm.page;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.xpath.XPathVisitable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import org.openqa.selenium.support.FindBy;

import TestBase.testBase;
//import net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator.Implicit;

public class Homepage extends testBase {

	/*
	 * public Homepage() throws IOException { super(); // TODO Auto-generated
	 * constructor stub }
	 */
	
	@FindBy (xpath="//td[@class ='headertext' and @align='left']")
	WebElement loginusername;
	
	@FindBy (xpath ="//td[contains(text(),'User: ananda kr')]")
	WebElement verifyloginuser;
	
	@FindBy (xpath ="//a[contains(@title,'Home')]")
	WebElement Homepage;
	
	@FindBy (xpath ="//a[text()='Calendar']")
	WebElement calenderlink;
	
	@FindBy (xpath="//select[@name='slctMonth']")
	WebElement calendermonth;
	
	@FindBy (xpath ="//select[@name='slctYear']")
	WebElement selyear;
	
	@FindBy (xpath ="//strong[contains(text(),'Monday Aug 26, 2013')]")
	WebElement pathelement;
	
	@FindBy
	
	
	// initialization of home page
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String pagetitle() {
		System.out.println("The page title:"+driver.getTitle());
		return driver.getTitle();
	}
	
	
	public String verifytheloginname() {
		System.out.println("Inside the method of verify the login name");
		System.out.println(driver.getTitle());
		System.out.println(verifyloginuser.getText());
		String loginname= verifyloginuser.getText();
		return loginname;
		
	}



public String calendarSelection() {
	System.out.println("Insided calendar selection class");
	driver.switchTo().frame("mainpanel");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Select select = new Select(calendermonth);
	//Select select = new Select(driver.findElement(By.name("slctMonth")));
	String month ="August";
	select.selectByVisibleText(month);
//	WebElement text1 = select.getFirstSelectedOption();
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
	//System.out.println("---++++++++++++++++++----------text1"+text1.getText());
	//driver.switchTo().frame("mainpanel");
	Select select1 = new Select(selyear);
	//Select select1 = new Select(driver.findElement(By.name("slctYear")));
	WebElement text2 = select1.getFirstSelectedOption();
	String text22 = text2.getText();
	select1.selectByVisibleText("2013");
	System.out.println("++++++++++++++++++++++++++++++-------------text2"+text22);
	
	
	//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[5]/td[3]
	//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[4]/td[4]
	
	String beforexpath ="//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
	String afterXpath ="]/td[";
	final int weekdays =7; 
	String text123=null;
	//System.out.println("The value is +++++++++++"+val);
	boolean flag = true;
	for(int rnum =2; rnum <=7;rnum++) {
		for(int cnum=1;cnum<=weekdays;cnum++) {
			String val = driver.findElement(By.xpath(beforexpath+rnum+afterXpath+cnum+"]")).getText();
			//System.out.println("The value is +++++++++++"+val);
		String date="26";
			if(val.equals(date) ) {
				System.out.println("The value is +++++++++++"+val);
				driver.findElement(By.xpath(beforexpath+rnum+afterXpath+cnum+"]")).click();
			text123 = pathelement.getText();
			System.out.println("The pathe elmeent &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&="+text123);
				flag =false;
				break;
			}
		}
		if(flag == false) {
			break;
		}
		
	
	}
	return text123;
//	return null;
}
}