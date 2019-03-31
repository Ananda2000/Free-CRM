package Com.qa.crm.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import Com.qa.Utils.CustomListners;
import TestBase.testBase;


public class Loginpage extends testBase{
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	// Here using text()='' 
	@FindBy (xpath="//span[text()='Log In']")
	WebElement loginfirst;
	
	@FindBy (xpath="//div[@class='rd-navbar-brand']//span [text()='your business cloud partner']")
	WebElement logoHeading;
	
	@FindBy (xpath="//div[@class='rd-navbar-brand']//span[text()='free']")
	WebElement displaying_free;
	
	@FindBy (xpath="//div[@class='rd-navbar-brand']//font[text()='crm']")
	WebElement display_crm;
	
	@FindBy(xpath="//a [text()='Classic CRM']")
	WebElement classiccrm;
	
	public void checkingUI() {
		loginfirst.isDisplayed();
		String login1 =loginfirst.getText();
		System.out.println("++++++++1:"+login1);
		logoHeading.isDisplayed();
		String Heading=logoHeading.getText();
		System.out.println("++++++++2:"+Heading);
		displaying_free.isDisplayed();
		String displaygFree = displaying_free.getText();
		System.out.println("+++++++++++++ 3:"+displaygFree);
		display_crm.isDisplayed();
		String crmdisplay= display_crm.getText();
		System.out.println("+++++++++ 4:" +crmdisplay);
	}
	
	public void clickfirstloginpage() {
		loginfirst.click();
	}
	
	public void clickclassCRM() {
		classiccrm.click();
	}
	
	public String checkpagetitle() {
		String pagetitle = driver.getTitle();
		System.out.println("The page title is:"+ pagetitle);
		return pagetitle;
	}
	
	public void validlogin() {
		
		clickfirstloginpage();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		clickclassCRM();
		
		
		
	}
	
	
	
	
	
	
	
}
