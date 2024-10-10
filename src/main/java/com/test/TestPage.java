package com.test;

import org.testng.annotations.Test;

import com.pages.BaseClassPage;

public class TestPage extends BaseClassPage {


	@Test(priority=0)
	public void personaldetails() {

		bank.personalDetails();

	}

	@Test(priority=1)
	public void logindetails() {

		bank.logindetails();
	}

	@Test(priority=2)
	public void register() {

		bank.register();
	}

}
