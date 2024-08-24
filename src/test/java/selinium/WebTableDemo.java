package selinium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableDemo {
	
	public static void main(String[] args) {
		
		WebDriver basecss = BaseClass.basecss("chrome");
		
		basecss.manage().window().maximize();
		
		basecss.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		List<WebElement> elements = basecss.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr"));
		
		int size = elements.size();
		
		System.out.println("Total Rows are"+" "+size); 
		
		List<WebElement> elements1 = basecss.findElements(By.xpath("//table[@class='table table-striped mt-3']//th"));
		
		int size2 = elements1.size();
		
		System.out.println("Total Columns are"+" "+size2);
		
		for(int row=1;row<size;row++) {
			for (int col=1;col<=size2;col++) {
				
				String text = basecss.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr[" +row+ "]/td[" +col+ "]")).getText();
				
				System.out.print(text+" ");
				
			}
			
			System.out.println();
		}

	}

}
