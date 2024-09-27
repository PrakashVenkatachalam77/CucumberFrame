package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DefaultParentFrame {


	public static void main(String[] args) {

		WebDriver basecss = BaseClass.basecss("chrome");
		basecss.get("https://demo.automationtesting.in/Frames.html");
		basecss.manage().window().maximize();

		basecss.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement element = basecss.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		basecss.switchTo().frame(element);

		WebElement element2 = basecss.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		basecss.switchTo().frame(element2);

		basecss.findElement(By.xpath("//input[@type='text']")).sendKeys("I'm Inside");

	basecss.switchTo().parentFrame();
	WebElement element3 = basecss.findElement(By.xpath("//h5[text()='Nested iFrames']"));
	String text = element3.getText();
	System.out.println(text);

	basecss.switchTo().defaultContent();

  basecss.findElement(By.xpath("//a[@href='#Single']")).click();






	}

}
