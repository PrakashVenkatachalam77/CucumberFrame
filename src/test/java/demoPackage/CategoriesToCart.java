package demoPackage;

import java.io.IOException;

import org.junit.After;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CategoriesToCart extends PropertyClass { 

	WebDriver drive;
	
	@When("Launch the DemoBlaze Website to add products to the cart")
	
	public void launch_the_demo_blaze_website_to_add_products_to_the_cart() throws IOException {
		WebDriverManager.chromedriver().setup();
		
		 drive= new ChromeDriver();
		 
		 drive.manage().window().maximize();
		
		 String propetyfetch = propetyfetch();
		 
		 drive.get(propetyfetch);
		 
	}

	@When("Click a Phone Product")
	public void click_a_phone_product() throws InterruptedException {
		
		Thread.sleep(2000);
	    
		drive.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
	}

	@When("Click Add To Cart Button1")
	public void click_add_to_cart_button1() throws InterruptedException {
		
		Thread.sleep(2000);
	    
		drive.findElement(By.xpath("//a[text()='Add to cart']")).click();
		
		Thread.sleep(1000);
		
	   Alert alert = drive.switchTo().alert();
	   
	   alert.accept();
	}

	@When("Move to the Previous Page and click another phone")
	public void switch_to_the_previous_page_and_click_another_phone() throws InterruptedException {
		
		Thread.sleep(1000);
	   
		drive.findElement(By.xpath("//a[text()='Home ']")).click();
		
		Thread.sleep(1000);
		
		drive.findElement(By.xpath("//a[text()='Sony xperia z5']")).click();
	
	}

	@When("Click Add To Cart Button2")
	public void click_add_to_cart_button2() throws InterruptedException {
		
         Thread.sleep(2000);
	    
		 drive.findElement(By.xpath("//a[text()='Add to cart']")).click();
		
		  Thread.sleep(1000);
		
		   Alert alert = drive.switchTo().alert();
		   
		   alert.accept();
	   
		
	}

	@When("Switch to the Home Page")
	public void switch_to_the_previous_page() throws InterruptedException {
		
		Thread.sleep(1000);
		   
		drive.findElement(By.xpath("//a[text()='Home ']")).click();
	    	
	}

	@Then("Phone Products added to the Cart Successfully")
	public void phone_products_added_to_the_cart_successfully() {
		
	    System.out.println("Two Phone Products added to the cart successfully");
	}

	@When("Locate the Laptops Link in the Categories Menu")
	public void locate_the_laptops_link_in_the_categories_menu() throws InterruptedException {
		
		Thread.sleep(1000);
		
		drive.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"]")).click();

	}

	@When("Click a Laptop Product")
	public void click_a_laptop_product() throws InterruptedException {
	    Thread.sleep(1000);
	    
	    drive.findElement(By.xpath("//a[text()='MacBook air']")).click();;
	}

	@When("Click Add to Cart Button3")
	public void click_add_to_cart_button3() throws InterruptedException {
		
		Thread.sleep(2000);
	    
		 drive.findElement(By.xpath("//a[text()='Add to cart']")).click();
		
		  Thread.sleep(1000);
		
		   Alert alert = drive.switchTo().alert();
		   
		   alert.accept();
	    
		
	}

	@When("Switch to the Laptop Page and click another Laptop")
	public void switch_to_the_previous_page_and_click_another_laptop() throws InterruptedException {
		
		Thread.sleep(1000);
		   
		drive.findElement(By.xpath("//a[text()='Home ']")).click();
		
		drive.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"]")).click();
		
		Thread.sleep(1000);
		
		drive.findElement(By.xpath("//a[text()='Dell i7 8gb']")).click();

	}
	
	
	@When("Click Add to Cart Button4")
	public void click_add_to_cart_button4() throws InterruptedException {
		
		Thread.sleep(2000);
	    
		 drive.findElement(By.xpath("//a[text()='Add to cart']")).click();
		
		  Thread.sleep(1000);
		
		   Alert alert = drive.switchTo().alert();
		   
		   alert.accept();
	    
		
	}

	@Then("Laptop Products added to the Cart Successfully")
	public void laptop_products_added_to_the_cart_successfully() {
	    
		System.out.println("Laptop Products added to the Cart Successfully");
	}

	@When("Locate the Monitors Link in the Categories Menu")
	public void locate_the_monitors_link_in_the_categories_menu() throws InterruptedException {
		
	   Thread.sleep(1000);
		
		drive.findElement(By.xpath("//a[@onclick=\"byCat('monitor')\"]")).click();
	}

	@When("Click a Monitor Product")
	public void click_a_monitor_product() throws InterruptedException {
	    
		    Thread.sleep(1000);
		    
		    drive.findElement(By.xpath("//a[text()='Apple monitor 24']")).click();
		
	}

	@When("Click Add to Cart Button5")
	public void click_add_to_cart_button5() throws InterruptedException {
		Thread.sleep(2000);
	    
		 drive.findElement(By.xpath("//a[text()='Add to cart']")).click();
		 
		 Thread.sleep(1000);
			
		   Alert alert = drive.switchTo().alert();
		   
		   alert.accept();
	}

	@When("Switch to the Monitor Page and click another Monitor")
	public void switch_to_the_previous_page_and_click_another_monitor() throws InterruptedException {
		
		Thread.sleep(1000);
		   
		drive.findElement(By.xpath("//a[text()='Home ']")).click();
		
		drive.findElement(By.xpath("//a[@onclick=\"byCat('monitor')\"]")).click();
		
		Thread.sleep(1000);
		
		drive.findElement(By.xpath("//a[text()='ASUS Full HD']")).click();
	    
		
	}

	@When("Click Add to Cart Button6")
	public void click_add_to_cart_button6() throws InterruptedException {
		Thread.sleep(2000);
	    
		 drive.findElement(By.xpath("//a[text()='Add to cart']")).click();
		 
		 Thread.sleep(1000);
			
		   Alert alert = drive.switchTo().alert();
		   
		   alert.accept();
	}
    @After
	@Then("Monitor Products added to the Cart Successfully")
	public void monitor_products_added_to_the_cart_successfully() {
	    
		System.out.println("Monitor Products added to the Cart Successfully");
		
		drive.close();
	}
}
