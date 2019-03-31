package TestBase;



import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;


import com.sun.xml.internal.fastinfoset.sax.Properties;
import java.io.File;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {
	public static WebDriver driver;
	public static Properties prep;
	
	
	/*
	 * public testBase() { prep = new Properties(); FileInputStream ip = new
	 * FileInputStream(
	 * "C:/Anand/WS_2018-09/FreeCRM/src/main/java/Configuaration/Config.properties")
	 * ; prep.l
	 * 
	 * }
	 * 
	 */
	
	
	public void initialize() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://freecrm.com");
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	}
	
	public void failedScreenshots(String r) {
		//File saa= new File();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Anand\\WS_2018-09\\FreeCRM\\test-output\\Screenshots\\"+ r +".jpg");
		System.out.println("failed test1");
		try {
			FileUtils.copyFile(src, dest);
			System.out.println("failed test2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	
		
		
	}
	
	
	

}
