package com.adactin.stepdef;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pm_Cucumber.Base_Class;
import com.pom.co.PomOfPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class Step_Def extends Base_Class{
	
	public static WebDriver driver=browser_Launch();

	@Given("Launch the browser and navigate to url")
	public void launch_the_browser_and_navigate_to_url() {
		url("https://adactinhotelapp.com/");
	    throw new io.cucumber.java.PendingException();
	}
	PomOfPom p=new PomOfPom(driver);
	@When("User enters the username")
	public void user_enters_the_username() {
		sendkeys(p.getL().getUsername(), "Arthiha1018");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User enter the password")
	public void user_enter_the_password() {
	    sendkeys(p.getL().getPassword(), "abc");
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
	    click(p.getL().getLogin());
	    throw new io.cucumber.java.PendingException();
	}
	}
	




