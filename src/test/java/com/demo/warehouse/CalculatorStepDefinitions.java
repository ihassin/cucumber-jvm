package com.demo.warehouse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by ihassin on 9/21/16.
 */
public class CalculatorStepDefinitions {
    int num1;
    int num2;
    int sum;

    @Given("^I have (\\d+) and (\\d+)$")
    public void i_have_and(int arg1, int arg2) throws Throwable {
        num1 = arg1;
        num2 = arg2;
    }

    @When("^I run the calculator$")
    public void i_run_the_calculator() throws Throwable {
        sum = num1 + num2;
    }

    @Then("^I see (\\d+)$")
    public void i_see(int arg1) throws Throwable {
        assertTrue(sum == arg1);
    }

}
