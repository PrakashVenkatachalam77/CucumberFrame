package testNGDemo;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectDemo  extends PropertyDemo  {

	WebDriver drive;
	ExtentReports extent;
	Properties a;
    ExtentTest device;

	@BeforeSuite
	public void start() {

		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\extentreport.html");
		 extent = new ExtentReports();
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
	    drive = new ChromeDriver();

	}

	@BeforeTest
	public void maxi() {
		drive.manage().window().maximize();

	}

	@Parameters({"URL"})
	@Test(priority=0,groups="First")
	public void url(String url) throws IOException {
		drive.get(url);

	   extent.createTest("URL LAUNCH").assignAuthor("Prakash").assignDevice("Web");


	}

	@Test(priority=1,description="UserName Field",groups="Login")
	public void username() throws IOException {

		WebElement element = drive.findElement(By.id("user-name"));

    	element.sendKeys("standard_user");

		extent.createTest("Passing User Name").assignDevice("Web");
	}

	@Test(priority=2,description="Password Field",dependsOnMethods="username",groups="Login")
	public void password() throws IOException {

		WebElement element = drive.findElement(By.id("password"));

     	element.sendKeys("secret_sauce");

     	SoftAssert check = new SoftAssert();

     	check.assertEquals("secret_sauce", "secret_sauce");

		ExtentTest device2 = extent.createTest("Passing Password").assignDevice("Web");

		device2.addScreenCaptureFromPath(klick());

	}

	@Test(priority=3,groups="Login",description="Login Button")
	public void login() {

		drive.findElement(By.id("login-button")).click();

		extent.createTest("Clicking Login Button").assignDevice("Web");

	}

	@Test(priority=4,groups="Home",description="Clicking an Item")
	public void selectproduct()  {
		drive.findElement(By.xpath("//div[@class='inventory_item']//following::*[text()='Sauce Labs Backpack']")).click();

		extent.createTest("Selecting an Item").assignDevice("Web");

	}

	@Test(priority=5,groups="Home",description="Adding to Cart")
	public void add() {

		drive.findElement(By.id("add-to-cart")).click();

		drive.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click();

		extent.createTest("Adding a Product to the Cart").assignDevice("Web");


	}

	@Test(priority=6,groups="Checkout",description="clicking checkout")
	public void checkout() {

		drive.findElement(By.id("checkout")).click();

		extent.createTest("Clicking Checkout Button").assignDevice("Web");
	}

	@Test(priority=7,groups="Details",description="Filling Checkout Details",dataProvider="checkoutdata")
	public void checkoutdetails(String first, String second, String Pincode) {

		drive.findElement(By.id("first-name")).sendKeys(first);

		drive.findElement(By.id("last-name")).sendKeys(second);

		drive.findElement(By.id("postal-code")).sendKeys(Pincode);

		drive.findElement(By.id("continue")).click();

		extent.createTest("Entering Details").assignDevice("Web");


	}

	@Test(priority=8,groups="End")
	public void finish() {

		drive.findElement(By.id("finish")).click();

		extent.createTest("Clicking Finish Button").assignDevice("Web");
	}

	@Test(priority=9,groups="End",description="Back to Home page")
	public void backhome() throws InterruptedException, IOException {

ExtentTest assignDevice = extent.createTest("Back to Products page").assignDevice("Web");

		Thread.sleep(1000);
		try {
		drive.findElement(By.id("back-to-product")).click();
		}
		catch(Exception e) {

			assignDevice.fail(e.getMessage());

			assignDevice.addScreenCaptureFromPath(klick());

		}

	}

	@Test(priority=10,invocationCount = 1)
	public void pagerefresh() {

		drive.navigate().forward();
	}

	@DataProvider
	public Object[][] checkoutdata() {
		Object[][] tarr= { {"Prakash", "Venkat","600064"}};

return tarr;

	}

public String  klick() throws IOException {

		TakesScreenshot z= (TakesScreenshot)drive;

		File screenshotAs = z.getScreenshotAs(OutputType.FILE);

		File Dest=new File("./Files/Screenshotz"+System.currentTimeMillis()+".png");

		FileUtils.copyFile(screenshotAs, Dest);

		String absolutePath = screenshotAs.getAbsolutePath();

	   return absolutePath;

	}

	@AfterSuite
	public void report() {
		extent.flush();
		drive.quit();
	}


}


