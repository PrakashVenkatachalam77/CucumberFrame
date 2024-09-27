package testNGDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver drive;
	@BeforeTest
	@Parameters({"browser"})
	public void browsersetup(String browser) {
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 drive= new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
		     drive= new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			 drive= new EdgeDriver();
			break;

		}
		}

	}


