package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AccommodationPage;


import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class Accommodation implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccommodationPage.CHECK_DATE),
             Click.on(AccommodationPage.CHECK_DAY1),
                Click.on(AccommodationPage.CHECK_DAY2)

        );
    }

    public static Accommodation inThePage(){
         return instrumented(Accommodation.class);

    }
}
