package testNGDemo;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver drive;
	@BeforeTest
	public void step1() {

		WebDriverManager.chromedriver().setup();
		drive= new ChromeDriver();
		drive.get("https://testautomationpractice.blogspot.com/");
	}

	@Test
	public void step2() {
        drive.findElement(By.id("name")).sendKeys("Prakash");

		drive.findElement(By.id("email")).sendKeys("prakash@gmail.com");
	}

	@Test(retryAnalyzer=IretryAnalyzer.class)
	public void step3() {
		drive.findElement(By.id("phon")).sendKeys("8610368086");
	}

	@Test
	public void step4() {

		drive.findElement(By.id("textarea")).sendKeys("Sunrise Apartments");
	}

	public static void capture() throws IOException, AWTException {

        Robot r= new Robot();

		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

		Rectangle rect= new Rectangle(d);

		BufferedImage b = r.createScreenCapture(rect);

		File destination= new File("./screenshot/screen"+System.currentTimeMillis()+".png");

		ImageIO.write(b,"png",destination);


	}
}
