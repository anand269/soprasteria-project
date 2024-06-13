package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://demoqa.com/buttons");
		
		Actions act = new Actions(driver);
		WebElement btnElement = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(btnElement).perform();//double click using Actions class
		//act.dragAndDrop(btnElement, btnElement)
		System.out.println("Double click done");
	}
	

}
