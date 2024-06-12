package JavaDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// Java Example
		System.out.println("We know Java basics");
		//JavaDemo1 jd = new JavaDemo1();
		//Step-1 Open the browser
		String browser="Firefox";
		WebDriver driver = new ChromeDriver();//chrome browser
		//WebDriver driver = new FirefoxDriver();//firefox browser
		//enter the url on the browser address bar
		driver.get("https://www.google.com/");
		String expectedTitle="Google";//customer
		String actualTitle=driver.getTitle();
		//identify the text-area and enter the value
		WebElement txtArea = driver.findElement(By.name("q"));//.sendKeys("Selenium Automation");//types
		txtArea.sendKeys("Selenium");//typing value on the text box
		txtArea.sendKeys(Keys.ENTER);//keyboard enter
				
		//Title validation
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title matching - Test case Pass");
		}
		else 
			System.out.println("Title not matching - Test case fail");
		Thread.sleep(3000);
		driver.close();//close the browser
	}

}
