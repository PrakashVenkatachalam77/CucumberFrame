package selinium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options= new ChromeOptions();
     	options.addArguments("--Guest");
		options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-web-security");
        options.addArguments("--disable-site-isolation-trials");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--remote-allow-origins=*");
       // options.addArguments("start-maximized");


       // WebDriver driver = BaseClass.basecss("chrome");
        WebDriver driver = new ChromeDriver(options);

		driver.get("https://in.bookmyshow.com/explore/home/chennai");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@class='bwc__sc-dh558f-13 bPjxSZ']/img[@alt='google logo']")).click();

		 Set<String> handles = driver.getWindowHandles();

		 for (String mn:handles) {

			 driver.switchTo().window(mn);
			 driver.manage().window().maximize();
			 String title = driver.getTitle();
			 System.out.println(title);
			 if(title.equals("Sign in - Google Accounts")) {
			WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
			element.sendKeys("vprakash220898@gmail.com");
			element.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
			element2.sendKeys("Prakash@1957");
			element2.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.navigate().refresh();

//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[text()='Continue']")).click();

			 }

		 }

	}

}
