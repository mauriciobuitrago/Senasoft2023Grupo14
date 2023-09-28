package stepdefinitions;

import io.cucumber.java.en.And;
import tasks.Accommodation;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AccommodationStepDefinition {
    @And("Starts the interaction with the page and the hotel reservation integrating the established parameters")
    public void StartsTheInteractionWithThePageAndTheHotelReservationIntegratingTheEstablishedParameters(){
        theActorInTheSpotlight().attemptsTo(Accommodation.inThePage());

    }

}
