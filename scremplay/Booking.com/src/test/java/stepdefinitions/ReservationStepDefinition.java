package stepdefinitions;

import io.cucumber.java.en.And;
import tasks.Reservation;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReservationStepDefinition {
    @And("the user will finalize his reservation and finish his process")
    public void theUserWillFinalizeHisReservationAndFinishHisProcess(){
        theActorInTheSpotlight().attemptsTo(Reservation.inThePage());

    }
}
