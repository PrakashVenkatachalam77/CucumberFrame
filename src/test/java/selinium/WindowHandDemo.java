package selinium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WindowHandDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();    //Open a New Window


		Set<String> handles = driver.getWindowHandles();

		for(String tabs:handles) {

			driver.switchTo().window(tabs);
			String title = driver.getTitle();
			System.out.println(title);
			driver.manage().window().maximize();
			if(title.equals("Selenium")) {
				driver.findElement(By.xpath("//span[text()='Downloads']")).click();
				}
		}


//List<String> sa= new ArrayList<>(handles);            // Converting Set to List to locate using index value
//
//		for (String lis:sa) {
//		driver.switchTo().window(sa.get(1));
//			String title = driver.getTitle();
//			System.out.println(title);
//	if(title.equals("Selenium")) {
//				driver.findElement(By.xpath("//span[text()='Documentation']")).click();
//
//	}
//		}
	}

}
