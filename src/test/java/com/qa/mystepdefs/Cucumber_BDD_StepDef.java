package com.qa.mystepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Cucumber_BDD_Actions;

public class Cucumber_BDD_StepDef {

	private Cucumber_BDD_Actions ac = new Cucumber_BDD_Actions();

	@Given("I launch browser")
	public void LaunchBrowser() {
		ac.launchBrowser();
	}

	@Given("I launch url {string}")
	public void LaunchURL(String URL) {
		ac.launchURL(URL);
	}

	@Given("I close browser")
	public void CloseBrowser() {
		ac.closeBrowser();
	}
	
	@Then("I add {int} with {int} and print result")
	public void I_add_2_numbers(int num1, int num2) {
		ac.add2numbers(num1, num2);
	}
	
	@Then("I verify sum of {int} with {int} is {int} via soft assert")
	public void I_verify_sum_via_soft_assert(int num1, int num2, int sum) {
		ac.verifySumViaSoftAssert(num1, num2, sum);
	}
	
	@Then("I verify sum of {int} with {int} is {int} via hard assert")
	public void I_verify_sum_via_hard_assert(int num1, int num2, int sum) {
		ac.verifySumViaHardAssert(num1, num2, sum);
	}

}