package demoPackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverUrlLaunch extends PropertyClass {
	
	WebDriver drive;
	

	@When("Launch the DemoBlaze Website")
	public void launch_the_demo_blaze_website() throws IOException {
	    
		WebDriverManager.chromedriver().setup();
		
		 drive= new ChromeDriver();
		 
		 drive.manage().window().maximize();
		
		 String propetyfetch = propetyfetch();
		 
		 drive.get(propetyfetch);
		 
		 
	}

	@When("Click the Sign Up Link")
	public void click_the_sign_up_link() {
	   drive.findElement(By.id("signin2")).click();
	}

	@When("Locate the UserName Field and Enter the Name")
	public void locate_the_user_name_field_and_enter_the_name(io.cucumber.datatable.DataTable dataTables) throws InterruptedException {
		
		Thread.sleep(1000);
	    WebElement element = drive.findElement(By.id("sign-username"));
	    
	    List<String> asList = dataTables.asList();
	    
	    for(String a:asList) {
	    	
	    	element.sendKeys(a);
	    }
	    
	}

	@When("Locate the Passowrd Field and Enter the Password")
	public void locate_the_passowrd_field_and_enter_the_password(io.cucumber.datatable.DataTable dataTable) {
	   WebElement element = drive.findElement(By.id("sign-password"));
	   
	   Map<String, String> asMap = dataTable.asMap();
	   
	   String pass = asMap.get("Password");
	   
	   System.out.println(pass);
	   
	   element.sendKeys(pass);
	}

	@When("Click the Signup Button to finish the Signup Button")
	public void click_the_signup_button_to_finish_the_signup_button() throws InterruptedException {
	    WebElement element = drive.findElement(By.xpath("//button[@onclick='register()']"));
	    
	    element.click();
	    
	    Thread.sleep(1000);
	    
	    Alert al= drive.switchTo().alert();
	    
	    al.accept();
	    
	}

	@Then("Account will be Created Successfully")
	public void account_will_be_created_successfully() throws InterruptedException {
	    System.out.println("Account is created Successfully");
	    
	    Thread.sleep(2000);
	    
	    drive.quit();
	    
 
	}

	@When("Click the Login Link")
	public void click_the_passowrd_link() {
	   drive.findElement(By.id("login2")).click();
	}

	@When("Locate the UserName Field and Enter the User Name")
	public void locate_the_user_name_field_and_enter_the_user_name() throws IOException, InterruptedException {
	    
		Thread.sleep(1000);
		String username = usernamefetch();
		drive.findElement(By.id("loginusername")).sendKeys(username);
	}

	@When("Locate the Passowrd Field and Enter the Given Password")
	public void locate_the_passowrd_field_and_enter_the_password() throws IOException {
		
		String password = passwordfetch();
	    
		drive.findElement(By.id("loginpassword")).sendKeys(password);
	}

	@When("Click the Login Button to Login in to the WebSite")
	public void click_the_login_button_to_login_in_to_the_web_site() {
	   
		drive.findElement(By.xpath("//button[@onclick='logIn()']")).click();
	}

	@Then("Account will be Logged In Successfully")
	public void account_will_be_logged_in_successfully() throws InterruptedException {
	    
		System.out.println("Account Logged in Successfully");
		
		Thread.sleep(2000);
		
		drive.quit();
	}
	
	

}
