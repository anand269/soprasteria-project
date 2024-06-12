package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class PropertiesDemo extends BaseClass{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\git\\GuruSchools_Java\\Soprasteria-June24\\src\\selenium\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String name = prop.getProperty("username");
		System.out.println(name);
		String password = prop.getProperty("password");
		System.out.println(password);
		String url = prop.getProperty("url");
		System.out.println(url);
		invokeBrowser("chrome");
		driver.get(url);//will it call the actual url ?
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
