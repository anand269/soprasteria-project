package selenium;

import org.openqa.selenium.By;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("file:///D:/Automation/html/iframpage.html");
		driver.findElement(By.id("t1")).sendKeys("text1");
		//Get inside the iframe 0
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.id("t3")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).clear();
		driver.findElement(By.id("t1")).sendKeys("Automation Testing");
		
	}

}
