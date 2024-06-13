package selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://www.google.com/");
		WebElement searchTxt= driver.findElement(By.name("q"));
		searchTxt.sendKeys("Testing");
		Thread.sleep(2000);
		List<WebElement> hints = driver.findElements(By.xpath("//span[contains(text(),'testing')]"));
		Thread.sleep(2000);
		int suggestions = hints.size();//total number of the suggestions
		screenShot();
		System.out.println(hints.size());//total no of suggestions
		String suggestion;
		for(int i=0;i<suggestions;i++)
		{
			System.out.println(hints.get(i).getText());
			suggestion=hints.get(i).getText();
			if(suggestion.contains("testing types"))//true
			{
				hints.get(i).click();
				break;
			}
			else
				System.out.println("Keyword not matching");
		}
		
		//closeBrowser();
	}

}
