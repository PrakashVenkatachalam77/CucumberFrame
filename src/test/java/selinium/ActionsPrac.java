package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsPrac {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.get("https://stqatools.com/demo/MouseHover.php");

		driver.manage().window().maximize();

		WebElement first = driver.findElement(By.xpath("//button[text()='Mouse Hover DropDown']"));

	    WebElement second = driver.findElement(By.xpath("//a[text()='Link 2']"));

		Actions hg= new Actions(driver);

		hg.moveToElement(first).perform();

		hg.moveToElement(second).build().perform();
	}

}
