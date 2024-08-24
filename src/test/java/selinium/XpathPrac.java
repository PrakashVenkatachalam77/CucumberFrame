package selinium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPrac {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver vc= new ChromeDriver();
		vc.get("https://www.opencart.com/");
		vc.manage().window().maximize();
		WebElement tr = vc.findElement(By.xpath("//a[text()='Demo']"));  //XPath using Text Method
		tr.click();
	    WebElement lk = vc.findElement(By.xpath("//a[@data-toggle='dropdown']"));  // XPath using Attribute Name and Value
	    lk.click();
	    Thread.sleep(1000);
        WebElement dc = vc.findElement(By.xpath("//a[contains(text(),'Contact Us')]")); // XPath using Contains Text Method
        dc.click();		
        WebElement ij = vc.findElement(By.xpath("//input[contains(@id,'input-name')]"));   // XPath using Contains (Attribute name and value) method
        ij.sendKeys("V.Prakash");
        WebElement tf = vc.findElement(By.xpath("//input[starts-with(@name,'email')]"));  // XPath using starts-with Method
        tf.sendKeys("vprakash@gmail.com");
        WebElement gh = vc.findElement(By.xpath("//textarea[@name='enquiry' and @class='form-control']"));  //XPath using and Operator
        gh.sendKeys("AI7765");
        WebElement ui = vc.findElement(By.xpath("//button[@id='button-captcha' or @class='btn btn-primary btn-lg']"));   //XPath using or Operator
        ui.click();
	    Thread.sleep(2000);
        vc.close();
	}

}
