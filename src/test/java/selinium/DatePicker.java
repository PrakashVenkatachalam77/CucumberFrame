package selinium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Datepicker.html");

		driver.findElement(By.id("datepicker1")).click();

		String Month="August";       // Picking my DATE OF BIRTH

		String Year="1998";

		String Day="22";

		while(true) {

			 String mth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			 String yer = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();


			if(mth.equals(Month) && yer.equals(Year)){

				break;
			}
			else {

				driver.findElement(By.xpath("//span[text()='Prev']")).click();

			}
		}

		List<WebElement> elements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

		for (WebElement date:elements) {

			String text = date.getText();

		    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));

			wait.until(ExpectedConditions.elementToBeClickable(date));

			if (text.equals(Day)) {
				date.click();

			}
		}
	}
}
