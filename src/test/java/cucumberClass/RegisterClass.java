package cucumberClass;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterClass {
	
	WebDriver drive;
	
	@When("Open the Chrome Browser")
	public void open_the_chrome_browser() {
	   
		WebDriverManager.chromedriver().setup();
		
	 drive= new ChromeDriver();
		
	}

	@When("Launch the Bank Url")
	public void launch_the_bank_url() {
	    
		drive.get("https://parabank.parasoft.com/parabank/register.htm");
		
		drive.manage().window().maximize();
	}

	@When("Enter the First Name")
	public void enter_the_first_name() {
	    
		drive.findElement(By.id("customer.firstName")).sendKeys("Prakash");
	}

	@When("Enter the Last Name")
	public void enter_the_last_name() {
	    
		drive.findElement(By.id("customer.lastName")).sendKeys("Prakash");
	}

	@When("Enter the Address")
	public void enter_the_address() {
	    
		
		drive.findElement(By.id("customer.address.street")).sendKeys("No:15, Poes Garden, Cheenai-77");
	}

	@When("Enter the City")
	public void enter_the_city() {
	   
		drive.findElement(By.id("customer.address.city")).sendKeys("Chennai");
	}

	@When("Enter the State")
	public void enter_the_state() {
	    
		
		drive.findElement(By.id("customer.address.state")).sendKeys("Tamil Nadu");
	}

	@When("Enter Zip Code")
	public void enter_zip_code() {
	   
		drive.findElement(By.id("customer.address.zipCode")).sendKeys("600064");
	}

	@When("Enter the Phone Number")
	public void enter_the_phone_number() {
	    
		drive.findElement(By.id("customer.phoneNumber")).sendKeys("8610368086");
	}

	@When("Enter the SSN Number")
	public void enter_the_ssn_number() {
	   
		drive.findElement(By.id("customer.ssn")).sendKeys("758964");
	}

	@When("Enter the User Name")
	public void enter_the_user_name() {
	    
		drive.findElement(By.id("customer.username")).sendKeys("Prakash97");
	}

	@When("Enter the Password")
	public void enter_the_password() {
	    
		drive.findElement(By.id("customer.password")).sendKeys("123456");
	}

	@When("Enter the Confirm Password")
	public void enter_the_confirm_password() {
	   
		
		drive.findElement(By.id("repeatedPassword")).sendKeys("123456");
	}

	@When("Click the Register Button")
	public void click_the_register_button() {
	   drive.findElement(By.className("button")).click();
	}

	@Then("Account will be successfully created")
	public void account_will_be_successfully_created() throws InterruptedException {
	   
		Thread.sleep(1000);
		
		drive.close();
	}

}
