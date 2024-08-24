package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		
		WebDriver basecss = BaseClass.basecss("chrome");
		
		basecss.manage().window().maximize();
		
		basecss.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source1 = basecss.findElement(By.id("box1"));
		
		WebElement tar1 = basecss.findElement(By.id("box106"));
		
		WebElement source2 = basecss.findElement(By.id("box2"));
		
		WebElement tar2 = basecss.findElement(By.id("box107"));
		
		WebElement source3 = basecss.findElement(By.id("box3"));
		
		WebElement tar3 = basecss.findElement(By.id("box101"));
				
		WebElement source4 = basecss.findElement(By.id("box4"));
		
		WebElement tar4 = basecss.findElement(By.id("box104"));
		
		WebElement source5 = basecss.findElement(By.id("box6"));
		
		WebElement tar5 = basecss.findElement(By.xpath("//div[text()='South Korea']"));
		
		WebElement source6 = basecss.findElement(By.id("box7"));
		
		WebElement tar6 = basecss.findElement(By.xpath("//div[text()='Sweden']"));
		
		WebElement source7 = basecss.findElement(By.id("box5"));
		
		WebElement tar7 = basecss.findElement(By.xpath("//div[text()='United States']"));
		
		Actions at= new Actions(basecss);
		
		at.dragAndDrop(source1, tar3).build().perform(); 
		
		at.dragAndDrop(source2, tar6).build().perform();
		
		at.dragAndDrop(source3, tar7).build().perform();
		
		at.dragAndDrop(source4, tar4).build().perform();
		
		at.dragAndDrop(source5, tar1).build().perform();
		
		at.dragAndDrop(source6, tar2).build().perform();
		
		at.dragAndDrop(source7, tar5).build().perform();
	}

}
