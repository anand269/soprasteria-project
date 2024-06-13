package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownDemo {
	public static void main(String arfs[])
	{
		WebDriver driver= new FirefoxDriver();			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //Creating the JavascriptExecutor interface object by Type casting		
	    JavascriptExecutor js = (JavascriptExecutor)driver;		
	    		
	      //Maximize window		
	    driver.manage().window().maximize();		
	    		
	    //Vertical scroll down by 900  pixels		
	    js.executeScript("window.scrollBy(0,500)");
	  
	    driver.get("https://demoqa.com/droppable/");
	    WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		
		//Get text logic
	}
}