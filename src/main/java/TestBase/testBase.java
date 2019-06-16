package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

//import com.sun.xml.internal.fastinfoset.sax.Properties;
import java.io.File;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {
	public static WebDriver driver;
	public static Properties prep;

	
	  public testBase()  {
		  try {
			  prep = new Properties();
				 
			  FileInputStream ip = new FileInputStream(
			  "C:\\Users\\Administrator\\git\\Free-CRM\\src\\main\\java\\Configuaration\\Config.properties");
				  
			  prep.load(ip);
			  System.out.println("the data at prop file:"+prep.getProperty("Username")); 
			
		} catch (FileNotFoundException e) {
e.printStackTrace();
}
		  catch (IOException e) {
			  e.printStackTrace();
			// TODO: handle exception
		}
		 
	 
	  }
	 

	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String urls = prep.getProperty("url");
		System.out.println("The url from config file"+urls);
		 //driver.get("https://freecrm.com");
		driver.get(urls);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	public void failedScreenshots(String r) {
		// File saa= new File();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Anand\\WS_2018-09\\FreeCRM\\test-output\\Screenshots\\" + r + ".jpg");
		System.out.println("failed test1");
		try {
			FileUtils.copyFile(src, dest);
			System.out.println("failed test2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	}

}
