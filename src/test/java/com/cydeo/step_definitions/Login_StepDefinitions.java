package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamless.url"));

    }
    @When("the user enters valid username")
    public void the_user_enters_valid_username() {

    }
    @When("the user enters valid password")
    public void the_user_enters_valid_password() {

    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {

    }
    @Then("user should be able to log in")
    public void user_should_be_able_to_log_in() {

    }

}