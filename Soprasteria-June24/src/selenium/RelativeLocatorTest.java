package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorTest extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		//Relative locator - selenium 4
		WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		email.sendKeys("test@gmail.com");
		WebElement city = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		city.sendKeys("Noida");
		
	}

}
