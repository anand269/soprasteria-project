package selenium;

import java.time.Duration;

import org.openqa.selenium.By;

public class LinkDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("edge");//re-usability
		driver.get("https://www.wikipedia.org/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Engli")).click();
		closeBrowser();
	}

}
