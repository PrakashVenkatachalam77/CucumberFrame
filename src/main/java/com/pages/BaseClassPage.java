package com.pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPage {

	public static RegisterPage bank= new RegisterPage();

	public static WebDriver driver;

	Properties prop;

	@BeforeTest
	public void setup() throws IOException {
	if(driver==null)
	{
		File f=new File("C:\\Users\\baska\\git\\repository\\ProjectName\\src\\test\\resources\\GlobalFiles.properties\\test.properties");

		FileReader fr= new FileReader(f);

		prop= new Properties();

		prop.load(fr);
	}

	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	else
	{
		System.out.println("pass the valid browser");
	}

}
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
