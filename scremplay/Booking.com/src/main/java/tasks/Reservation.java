package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.ReservationPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Reservation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ReservationPage.BTN_RESERVATION));
    }

    public static Reservation inThePage(){
        return instrumented(Reservation.class);

    }
}
