package demoPackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CartPage extends PropertyClass {
	
WebDriver driver;
	
	@When("Launch the Website")
	public void launch_the_website() {
	   
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		
	}

	@When("Click a phone Product")
	public void click_a_phone_product() throws InterruptedException {
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']")).click();
	    
		
	}

	@When("Click Add to Cart Button")
	public void click_add_to_cart_button() throws InterruptedException {
		
		Thread.sleep(1000);
	    
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	}

	@When("Back to Home Page")
	public void back_to_home_page() {
	    
		driver.findElement(By.xpath("//a[text()='Home ']")).click();
	}

	@When("Move to Laptops Category")
	public void move_to_laptops_category() {
	    
		driver.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"]")).click();
	}

	@When("Click a Laptop Product1")
	public void click_a_laptop_product() throws InterruptedException {
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='2017 Dell 15.6 Inch']")).click();
	   
		
	}

	@When("Click Add to Cart Button1")
	public void click_add_to_cart_button1() throws InterruptedException {
		
		Thread.sleep(1000);
		
      driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
      
      Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	    
	}

	@When("Click the Cart Option to open the Cart Page")
	public void click_the_cart_option_to_open_the_cart_page() {
	   
		driver.findElement(By.cssSelector("#cartur")).click();
	}

	@When("Delete a Product from the Cart")
	public void delete_a_product_from_the_cart() throws InterruptedException {
		
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
	}

	@When("Click the Place Order Button")
	public void click_the_place_order_button() throws InterruptedException {
		
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}

	@When("Click the Purchase Button without filling the Details")
	public void click_the_purchase_button_without_filling_the_details() throws InterruptedException {
	    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		Thread.sleep(1000);
       Alert alert = driver.switchTo().alert();
		
		alert.accept();
	}

	@When("Enter Name in the Place Order Details page")
	public void enter_name_in_the_place_order_details_page(io.cucumber.datatable.DataTable name) {
		
		List<String> asList = name.asList();
		
		for(String a:asList) {
			
			driver.findElement(By.cssSelector("#name")).sendKeys(a);
			
		}
		
	}

	@When("Enter Country in the Place Order Details page")
	public void enter_counter_in_the_place_order_details_page(io.cucumber.datatable.DataTable country) {
	    
		Map<String, String> asMap = country.asMap();
		
		String Country = asMap.get("Country");
		
		driver.findElement(By.cssSelector("#country")).sendKeys(Country);
	}

	@When("Enter the City")
	public void enter_the_city() {
	   
		driver.findElement(By.cssSelector("#city")).sendKeys("Chennai");
	}

	@When("Fetch the Credit Card Number")
	public void fetch_the_credit_card_number() throws IOException {
	   
		String cardnumberfetch = Cardnumberfetch();
		
		driver.findElement(By.cssSelector("#card")).sendKeys(cardnumberfetch);
		
	}

	@When("Enter Month")
	public void enter_month() {
	    
		driver.findElement(By.cssSelector("#month")).sendKeys("October");
	}

	@When("Enter Year")
	public void enter_city() {
		
		driver.findElement(By.cssSelector("#year")).sendKeys("2024");
	   
		
	}

	@When("Click the Purchase Button")
	public void click_the_purchase_button() {
	   
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
	}

	@Then("Click Ok Button and Check whether it returns to home page")
	public void click_ok_button_and_check_whether_it_returns_to_home_page() throws InterruptedException {
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}}




