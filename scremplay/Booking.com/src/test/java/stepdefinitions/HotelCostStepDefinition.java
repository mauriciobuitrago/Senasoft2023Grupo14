package stepdefinitions;

import io.cucumber.java.en.And;
import tasks.Accommodation;
import tasks.HotelCost;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HotelCostStepDefinition {
    @And("The user begins to select filters on the page")
    public void TheUserBeginsToSelectFiltersOnThePage(){
        theActorInTheSpotlight().attemptsTo(HotelCost.inThePage());
    }
}
