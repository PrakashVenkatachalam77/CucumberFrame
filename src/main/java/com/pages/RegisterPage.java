package com.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BaseClassPage {

	By firstname= By.id("customer.firstName");

	By lastname= By.id("customer.lastName");

	By address= By.id("customer.address.street");

	By city = By.id("customer.address.city");

	By state = By.id("customer.address.state");

	By zipcode= By.id("customer.address.zipCode");

	By mobilenumber= By.id("customer.phoneNumber");

	By ssn = By.id("customer.ssn");

	By username = By.id("customer.username");

	By password = By.id("customer.password");

	By confirmpass = By.id("repeatedPassword");

	By Register =By.xpath("//input[@value='Register']");


	public void personalDetails() {

		driver.findElement(firstname).sendKeys("Prakash");

		driver.findElement(lastname).sendKeys("Venkat");

		driver.findElement(address).sendKeys("No:15,Sunshine Apartments,Chitlapakkam, Chennai-64");

		driver.findElement(city).sendKeys("Chennai");

		driver.findElement(state).sendKeys("TamilNadu");

		driver.findElement(zipcode).sendKeys("600064");

		driver.findElement(ssn).sendKeys("856142");


	}

	public void logindetails() {

		driver.findElement(username).sendKeys("Prakash1998");

		driver.findElement(password).sendKeys("123456");

		driver.findElement(confirmpass).sendKeys("123456");

	}

	public void register() {

		driver.findElement(Register).click();
	}

}
