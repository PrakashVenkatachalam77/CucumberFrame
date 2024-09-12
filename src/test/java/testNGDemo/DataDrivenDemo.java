package testNGDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenDemo {
	WebDriver drive;
    @Parameters({"URL"})
	@Test(priority=0)
	public void web1(String url){
		
		WebDriverManager.chromedriver().setup();
		
	 drive= new ChromeDriver();
	 
		drive.manage().window().maximize();
		drive.get(url);
		
		
	}
	@Parameters({"FirstName","SecondName","Email","Phone"})
	@Test(priority=1)
	public void web2(String first,String second,String third,String four) {
		
		drive.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(first);
		
		drive.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(second);
		
		drive.findElement(By.xpath("//input[@type='email']")).sendKeys(third);
		
		drive.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(four);
		
	}

}
