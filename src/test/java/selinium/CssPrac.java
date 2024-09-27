package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssPrac {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver abc=new ChromeDriver();
		abc.get("https://demo.nopcommerce.com/");
		abc.manage().window().maximize();
		WebElement element = abc.findElement(By.cssSelector("input#small-searchterms"));   //Locating Elements Using CSS Selectors
		element.sendKeys("Software");
		element.sendKeys(Keys.ENTER);
		WebElement element2 = abc.findElement(By.cssSelector("a[title='List']"));
		element2.click();
		WebElement element3 = abc.findElement(By.cssSelector("input[id='advs']"));

		System.out.println("Conditional Commands before Clicking the Check Box ");                    // Conditional Commands

		boolean ui = element3.isDisplayed();                                        //Checking whether is element is Visible
		System.out.println(ui);
		boolean yt = element3.isEnabled();                                          // Checking whether is element is Active
		System.out.println(yt);
		boolean jh = element3.isSelected();                                        // Checking whether is element is Selected or Not
		System.out.println(jh);

		System.out.println("Conditional Commands after Clicking the Check Box ");

		element3.click();
		boolean gf = element3.isDisplayed();
		System.out.println(gf);
		boolean mn = element3.isEnabled();
		System.out.println(mn);
		boolean fd = element3.isSelected();
		System.out.println(fd);

		System.out.println("Application Commands used for this Website");             // Application Commands

		String uy = abc.getTitle();                                                   // Getting the Title of the Current page
		System.out.println(uy);
		String vc = abc.getCurrentUrl();                                              // Getting the Current URL
		System.out.println(vc);
		String io = abc.getPageSource();                                             // Getting the Page Source
		System.out.println(io);
		Thread.sleep(2000);
		abc.close();
	}

}
