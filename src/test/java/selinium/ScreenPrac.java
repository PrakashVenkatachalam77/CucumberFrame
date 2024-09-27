package selinium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenPrac {

	public static void demo(WebDriver driver) throws IOException {

		TakesScreenshot op=  (TakesScreenshot)driver;

		File ab = op.getScreenshotAs(OutputType.FILE);

		File bh= new File ("./ab/first.png");

		FileUtils.copyFile(ab, bh);
	}

	public static void main(String[] args) throws IOException {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.get("https://www.google.co.in/");

		demo(driver);

	}
}
