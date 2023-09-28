package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.AccommodationPage;



import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.AccommodationPage.*;


@AllArgsConstructor
public class Accommodation implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Santa Marta").into(AccommodationPage.TXT_CITY),
                Click.on(AccommodationPage.CHECK_DATE),
                Click.on(AccommodationPage.CHECK_DAY1),
                Click.on(AccommodationPage.CHECK_DAY2),
                Click.on(AccommodationPage.CHECK_BEDROOMS),
                Click.on(AccommodationPage.NUMBER_OF_ROOMS),
                Click.on(AccommodationPage.NUMBER_OF_ADULTS),
                DoubleClick.on(AccommodationPage.NUMBER_OF_CHILDREN),
                Click.on(OPTION1),
                Click.on(AGE_CHILDREN1),
                Click.on(BTN_READY),
                Click.on(AccommodationPage.BTN_SEARCH)
        );
    }

    public static Accommodation inThePage(){
         return instrumented(Accommodation.class);

    }
}
