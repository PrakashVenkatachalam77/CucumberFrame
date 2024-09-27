package selinium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebSum {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.get("https://testautomationpractice.blogspot.com/");

		String text2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr/th[4]")).getText();

		System.out.println("The Name of the Column is" + " " + text2);

		System.out.println("Data of the " + text2 + " " + "are :");

		int sum = 0;

		List<WebElement> elements = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));  //Located the the Particular Column and rows
		for (WebElement Total : elements)
		{
			String text = Total.getText();
			System.out.println(text);

			 int Price = Integer.parseInt(text);       // Converting String to Integer
			 sum=sum+Price;

		}
		System.out.println("The Total Amount is" + sum);

	}
}