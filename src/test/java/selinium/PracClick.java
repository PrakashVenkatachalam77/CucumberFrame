package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracClick {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver clic= new ChromeDriver();
		clic.get("https://account.kpostindia.com/login");
		clic.manage().window().maximize();
		WebElement a=clic.findElement(By.name("kpostid"));
		a.sendKeys("8610368086");
		WebElement b= clic.findElement(By.name("password"));
		b.sendKeys("654321");
		WebElement c= clic.findElement(By.className("mat-button-wrapper"));
		c.click();
		//clic.quit();
	//		WebElement d= clic.findElement(By.className("toggle-button-navbar mat-icon-button mat-button"));
//		d.click();	
	
	}

}
