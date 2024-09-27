package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TicketBooking {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.get("https://ticketnew.com/movies/chennai");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='DesktopHeaderTPMC_loginBtn__sO4RW']//child::span[text()='Log in / Signup']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//iframe[@id='oauth-iframe']"));
		driver.switchTo().frame(element);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8610368086");

		driver.findElement(By.xpath("//button[@alt='Get OTP']")).click();




	}

}
