package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Login;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinition {


    @Given("he {string} is on the login page {string}")
    public void heUserIsOnTheLoginPageHttpsWwwBookingCom(String nameActor , String url) {
        setTheStage(new OnlineCast());
        theActorCalled(nameActor).wasAbleTo(Open.url(url));

    }

    @When("he user is filling out the credentials to log in")
    public void heUserIsFillingOutTheCredentialsToLogIn(Map<String,String>mapCredencialesUsers) {
        theActorInTheSpotlight().attemptsTo(Login.inThePage(mapCredencialesUsers));
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
