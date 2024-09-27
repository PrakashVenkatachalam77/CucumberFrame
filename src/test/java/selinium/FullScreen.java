package selinium;

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

public class FullScreen {


	public static void windowscreen() throws AWTException, IOException {

		Robot r= new Robot();

		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

		Rectangle re= new Rectangle(size);

		BufferedImage capture = r.createScreenCapture(re);
		File full= new File ("./screen/fullsshot"+System.currentTimeMillis()+".png");
		//full.getParentFile().mkdirs();

		ImageIO.write(capture,"png", full);

	}

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

    WebDriver basecss = BaseClass.basecss("chrome");

		basecss.manage().window().maximize();

		basecss.get("https://demo.applitools.com/");

		basecss.findElement(By.id("username")).sendKeys("Prakash");
		windowscreen();

		basecss.findElement(By.id("password")).sendKeys("123456");
		windowscreen();

		basecss.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(1000);
		windowscreen();

	}

}
