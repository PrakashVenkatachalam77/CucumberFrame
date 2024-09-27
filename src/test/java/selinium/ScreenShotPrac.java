package selinium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotPrac {

	public static void screensh(WebDriver basecss) throws IOException {

		TakesScreenshot bv= (TakesScreenshot)basecss;  // Taking Screenshot

	    File shot= bv.getScreenshotAs(OutputType.FILE); // Creating a Folder to store the Screenshot

    	File store= new File ("./shot/firstscreen"+ System.currentTimeMillis()+ ".png");   // Passing the Location to store with File Name (System.currentTimeMills() for multiple screenshots)

		FileUtils.copyFile(shot, store);   // Copying the file to the folder.
	}

	public static void main(String[] args) throws IOException {

		WebDriver basecss = BaseClass.basecss("chrome");

		basecss.manage().window().maximize();

		basecss.get("https://demo.applitools.com/");

		basecss.findElement(By.id("username")).sendKeys("Prakash");
		screensh(basecss);

		basecss.findElement(By.id("password")).sendKeys("123456");
		screensh(basecss);

		basecss.findElement(By.xpath("//a[text()='Sign in']")).click();

        screensh(basecss);
	}

}
