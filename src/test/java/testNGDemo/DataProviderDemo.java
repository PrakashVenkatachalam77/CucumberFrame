package testNGDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	WebDriver drive;

	@Test(priority=0,dataProvider="url")
	public void web3(String url) {
		WebDriverManager.chromedriver().setup();

		 drive= new ChromeDriver();

			drive.manage().window().maximize();
			drive.get(url);

	}
	@Test(priority=1,dataProvider="details")
public void web4(String ma, String ph) {
	drive.findElement(By.xpath("//input[@type='email']")).sendKeys(ma);

	drive.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(ph);

}

	@DataProvider
	public Object[] url() {

		Object[] ab= {"https://demo.automationtesting.in/Register.html"};

		return ab;
	}
	@DataProvider
	public Object[][] details() {

		Object [][] gh= {{"prakash@gmail.com","8610368086"},{"rajesh@gmail.com","9841900480"}};

		return gh;
	}

}
