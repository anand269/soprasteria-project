package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SFLoginDemo2 {
	//static String browser="chrome";
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		// Step to open the chrome browser
		browserInvoke("chrome");//call the invoking of browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com/");
		//identify the username & password fields
		WebElement userName = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.name("Login"));
		
		//Entering the values
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
		
		String errMsg = driver.findElement(By.id("error")).getText();
		
		//validation
		if(errMsg.contains("check your username and password"))
		{
			System.out.println("Entered wrong credentials");
		}
		else
			System.out.println("You are in Home page");
		//navigating to another website
		driver.navigate().to("https://www.rediff.com/");
		Thread.sleep(2000);//forceful sleep -> 2 sec
		//driver.navigate().back();//browser back btn
		/*
		 * driver.navigate().forward(); Thread.sleep(2000); driver.navigate().refresh();
		 * Thread.sleep(2000);
		 */
		
		driver.close();
		
	}
	
	//user defined method
	public static void browserInvoke(String browser) {
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();//maximise the window
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
			System.out.println("None of the browsers matching");
	}

}
