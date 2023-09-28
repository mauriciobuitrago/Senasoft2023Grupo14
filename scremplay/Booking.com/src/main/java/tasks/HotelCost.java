package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.HotelCostPage;
import userinterfaces.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HotelCost implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(

            Click.on(HotelCostPage.CHECK_STAR),
            Click.on(HotelCostPage.BTN_AVAILABILITY)
    );

    }
    public static HotelCost inThePage(){
        return instrumented(HotelCost.class);

    }
}
