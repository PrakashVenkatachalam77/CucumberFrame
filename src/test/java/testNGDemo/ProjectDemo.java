package testNGDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectDemo  {
	WebDriver drive;
	@BeforeSuite
	public void start() {
		
		WebDriverManager.chromedriver().setup();
	    drive = new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void maxi() {
		drive.manage().window().maximize();
	}
	
	@Parameters({"URL"})
	@Test(priority=0)
	public void url(String url) {
		drive.get(url);
		
	}
	
	@Test(priority=1,description="UserName Field")
	public void username() {
		
		WebElement element = drive.findElement(By.id("user-name"));
		
		element.sendKeys("standard_user");
		
	}
	
	@Test(priority=2,description="Password Field",dependsOnMethods="username")
	public void password() {
		
		WebElement element = drive.findElement(By.id("password"));
		
		element.sendKeys("secret_sauce");
		
	}
	
	@AfterMethod
	public void login() {
		
		drive.findElement(By.id("login-button")).click();
		
	}
	
	@AfterTest
	public void selectproduct()  {
		drive.findElement(By.xpath("//div[@class='inventory_item']//following::*[text()='Sauce Labs Backpack']")).click();
		
	}
	
	@AfterSuite
	public void add() {
		
		drive.findElement(By.id("add-to-cart")).click();
		
		drive.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click();
	}
	

}
