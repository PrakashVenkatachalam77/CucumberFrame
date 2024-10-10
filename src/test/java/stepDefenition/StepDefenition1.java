package stepDefenition;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Map;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefenition1 {
	
	WebDriver drive;
	 WebElement element;
	 
	 WebElement element2;
	
	@When("Launch the URL")
	public void launch_the_url() {
		
		WebDriverManager.chromedriver().setup();
		
	 drive= new ChromeDriver();
	 
	 drive.get("https://testautomationpractice.blogspot.com/");
	    drive.manage().window().maximize();
	}

	@When("Locate the Name Field")
	public void locate_the_name_field() {
	    element = drive.findElement(By.id("name"));
	}

	@When("Multiple Data are")
	public void multiple_data_are(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		List<List<String>> asLists = dataTable.asLists();
		
		for (int i=0; i<asLists.size();i++) {
			 
			for (int j=0;j<asLists.get(i).size();j++) {
				
				element.sendKeys(asLists.get(i).get(j));
				Thread.sleep(1000);
				element.clear();
			}
		}
	    
//		List<String> asList = dataTable.asList();
//		
//		
//		for (int i=0;i<asList.size();i++) {
//			
//			element.sendKeys(asList.get(i));
//			Thread.sleep(1000);
//			element.clear();
//		}
		
		//drive.findElement(By.id("name")).clear();
	}
	
	@When("Locate the Number Field")
	public void locate_the_number_field() {
	     element2 = drive.findElement(By.id("phone"));
	}

	@When("Multiple Numbers are")
	public void multiple_numbers_are(io.cucumber.datatable.DataTable dataTable) {
	    
		Map<String, String> asMap = dataTable.asMap();
		
		element2.sendKeys(asMap.get("number"));
		
		
	}


}
