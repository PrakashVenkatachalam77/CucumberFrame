package testNGDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class Credentials {
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


	}

}