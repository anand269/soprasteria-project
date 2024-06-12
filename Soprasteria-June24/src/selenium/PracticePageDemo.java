package selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticePageDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		invokeBrowser("edge");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio1=driver.findElement(By.xpath("//input[@value='radio1']"));
		System.out.println("TagName : "+radio1.getTagName());
		System.out.println("Selected : "+radio1.isSelected());//true or false
		radio1.click();
		System.out.println("Selected : "+ radio1.isSelected());//true or false
		System.out.println("Displayed : "+radio1.isDisplayed());
		System.out.println("Enabled : "+radio1.isEnabled());
		//System.out.println(radio1.getText());
		
		//More than one element - use findElements method
		List<WebElement> radios = driver.findElements(By.xpath("//input[@name='radioButton']"));
		System.out.println("No of radio btns: "+radios.size());//total no of radio btns
		
		//check boxes - multiple elements
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("No of Check boxes: "+checkboxes.size());
		
		//System.out.println(checkboxes.get(0).getAttribute("name"));//to print all the checkbox names
		
		for(int i=0;i<checkboxes.size();i++)
		{
			System.out.println(checkboxes.get(i).getAttribute("name"));//to print all the checkbox names
			Thread.sleep(1000);//1 sec delay
			checkboxes.get(i).click();//?
		}
		
		//identify the drop down box
		WebElement sel = driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
		Select dropdown = new Select(sel);
		dropdown.selectByIndex(1);
		Thread.sleep(1000);
		dropdown.selectByValue("option2");
		Thread.sleep(1000);
		dropdown.selectByVisibleText("Option3");
		
		
		//Auto Suggestion
		WebElement auto = driver.findElement(By.id("autocomplete"));
		auto.click();
		auto.sendKeys("india");
		Thread.sleep(2000);
		auto.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		screenShot();
		
		//Alert handling - alert window will open
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		screenShot();
		driver.switchTo().alert().accept();
		
		//closeBrowser();
	}

}
