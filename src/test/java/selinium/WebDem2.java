package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDem2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.basecss("chrome");
		
		driver.manage().window().maximize();
		
		driver.get("https://qavbox.github.io/demo/webtable/");
		
//		List<WebElement> elements = driver.findElements(By.xpath("//table[@id='table02']/thead/tr"));
//		
//		for (WebElement rows:elements) {
//			
//			String text = rows.getText();
//			
//			System.out.print(text);
//		}
		
		driver.findElement(By.xpath("//table[@id='table01']/tbody/tr[3]/td[5]//child::*")).click();
		
//		List<WebElement> elements2 = driver.findElements(By.xpath("//tbody/tr/td[6]"));
//		
//		for(WebElement columns:elements2) {
//			
//			String text = columns.getText();
//			
//			System.out.println(text);
//
//		}
	
		
	}

}
