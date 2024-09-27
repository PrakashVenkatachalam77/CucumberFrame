package selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

public static void main(String[] args) {

	//WebDriverManager.chromiumdriver().setup();
	WebDriverManager.firefoxdriver().setup();
   WebDriver tp= new FirefoxDriver();
 tp.get("https://www.oracle.com/in/");
   tp.manage().window().maximize();
  String a= tp.getCurrentUrl();
System.out.println(a);
}


}
