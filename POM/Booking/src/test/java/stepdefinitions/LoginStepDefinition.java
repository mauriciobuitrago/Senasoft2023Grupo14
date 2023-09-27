package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.Login;

public class LoginStepDefinition {

@Steps
    Login login;

@Given("he user is on the login page")
    public void heUserIsOnTheLoginPage(){
    login.openBrowser();

}


    @When("he user is filling out the credentials to log in.")
    public void heUserIsFillingOutTheCredentialsToLogIn() {
    login.satrt();
    login.email();
    login.continueButton();
    login.password();
    login.signIn();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("he user has had a successful login")
    public void heUserHasHadASuccessfulLogin() {
    }
}
