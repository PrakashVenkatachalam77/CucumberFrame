package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherXpathAxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver eat= new ChromeDriver();
		eat.get("https://www.nopcommerce.com/en");
		eat.manage().window().maximize();
		WebElement bv = eat.findElement(By.xpath("//div[@class='developer-title']/parent::div/child::*[@class='link-arrow sprite-image']"));
		Thread.sleep(1000);
		bv.click();
		WebElement lk = eat.findElement(By.xpath("//a[text()='Download nopCommerce']/following::a[text()='professional support']"));
		Thread.sleep(1000);
		lk.click();
		WebElement yt = eat.findElement(By.xpath("//ul[@class='list']/descendant::a[text()='Contact us']"));
		Thread.sleep(1000);
		yt.click();
		WebElement mn = eat.findElement(By.xpath("//select[@name='Type']"));
		mn.click();
		WebElement mj = eat.findElement(By.xpath("//option[@value='2']"));
		mj.click();
		
		
	}
	
}
