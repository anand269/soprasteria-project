package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class BaseClass {
	
	static WebDriver driver=null;
	//open browser
		public static void invokeBrowser(String browser)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
			else if(browser.equalsIgnoreCase("Edge"))
			{
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		}
		//close browser
		public static void closeBrowser() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close();
		}
		//take the screenshot
		public static void screenShot() throws IOException
		{
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src,new File("./screenshot/"+"page-"+System.currentTimeMillis()+".png"));
		}

}
