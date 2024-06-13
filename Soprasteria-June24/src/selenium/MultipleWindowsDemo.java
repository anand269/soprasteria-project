package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindowsDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("firefox");
		driver.navigate().to("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp&theme=glif");
		
		driver.findElement(By.linkText("Help")).click();
		Set<String> ids = driver.getWindowHandles();//parent window and help
		Iterator<String> it = ids.iterator();
		String parent = it.next();//parent window
		String help = it.next();//help window
		
		driver.switchTo().window(help);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//child window or parent window
		
		driver.switchTo().window(parent);//switching back to parent window
		Thread.sleep(2000);
		driver.quit();//will close all the windows opened by selenium
		System.out.println("All done");
	}

}
