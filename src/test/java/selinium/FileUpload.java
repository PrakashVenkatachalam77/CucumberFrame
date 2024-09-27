package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/FileUpload.html");
		WebElement element = driver.findElement(By.id("input-4"));

		String file1= "C:\\Users\\baska\\OneDrive\\Pictures\\20240426.jpg";

		String file2 = "C:\\Users\\baska\\Downloads\\AppraisalReport_20_08_2024.pdf";

		String file3 ="C:\\Users\\baska\\Downloads\\MANGALORE.pdf";

		element.sendKeys(file1+"\n"+ file2 +"\n"+ file3);

		//driver.findElement(By.id("terms")).click();

		//driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
	}

}
