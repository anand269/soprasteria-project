package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//identify the no of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("Total no of columns: "+columns.size());//columns
		
		//print all the headers
		for(int i=0;i<columns.size();i++)
		{
			System.out.println(columns.get(i).getText());
		}
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total no of rows: "+rows.size());//rows
		
		//print all the records
		for(WebElement rowname:rows)
		{
			System.out.println(rowname.getText());
		}
		
		//capture the particular cell value
		WebElement cell=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[3]"));
		System.out.println("Cell value is : "+cell.getText());
		
		
		//closeBrowser();
	}

}
