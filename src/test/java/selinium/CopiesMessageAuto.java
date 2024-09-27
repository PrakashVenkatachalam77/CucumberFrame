package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CopiesMessageAuto {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();
		WebDriver nb= new ChromeDriver();
		nb.get("https://demo.nopcommerce.com/");
		nb.manage().window().maximize();
		WebElement po = nb.findElement(By.xpath("//img[@alt='Picture for category Electronics']/parent::a/child::*"));
		Thread.sleep(2000);
		po.click();
		WebElement gf = nb.findElement(By.xpath("//a[@title='Show products in category Cell phones']/following::img [@alt='Picture for category Cell phones']"));
		Thread.sleep(2000);
		gf.click();
		WebElement nq = nb.findElement(By.linkText("Add to cart"));
 		nq.click();
//		WebElement nx = nb.findElement(By.xpath("//span[@class='mat-button-wrapper']"));
//		nx.click();
	}

}
