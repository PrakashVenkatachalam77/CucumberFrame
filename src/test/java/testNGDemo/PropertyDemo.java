package testNGDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertyDemo {

	Properties a;
	WebDriver drive;
	@Test
	public  String file() throws IOException {

		 File ac = new File("C:\\Users\\baska\\git\\repository\\ProjectName\\src\\test\\resources\\GlobalFiles.properties\\test.properties");

	     FileReader f= new FileReader(ac);

	     a= new Properties();

	     a.load(f);

	     String property = a.getProperty("username");

	    System.out.println(property);
		return property;


	   //  return property;

	}



}
