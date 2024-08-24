package selinium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathAxes {
	
	public static void main(String[] args)  {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver yt= new ChromeDriver();
		yt.get("https://demo.nopcommerce.com/");
		yt.manage().window().maximize();
		WebElement hg = yt.findElement(By.xpath("//a[text()='Documentation']/following-sibling::a[text()='Forums']"));
		hg.click();
		WebElement lk = yt.findElement(By.xpath("//input[@type='submit']/preceding-sibling::*"));
		lk.sendKeys("News");
		WebElement mn = yt.findElement(By.xpath("//input[@type='submit']/preceding::span[text()='Downloads']"));
		mn.click();
		WebElement mar = yt.findElement(By.xpath("//span[text()='Downloads']/following::span[text()='Marketplace']"));
		mar.click();
		WebElement iu = yt.findElement(By.xpath("//input[@placeholder='Search extensions']"));
		iu.sendKeys("Api");
		WebElement ds = yt.findElement(By.xpath("//input[@placeholder='Search extensions']/following-sibling::*"));
		ds.click();
	}

}
