package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AccommodationPage;

import java.util.Map;

@AllArgsConstructor
public class ClickDateDay implements Interaction {
    public final Map<String,String> mapCredencialesUsers;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on());
    actor.attemptsTo(
            Click.on(AccommodationPage.CHECK_DAY1),
            Click.on(AccommodationPage.CHECK_DAY2)
    );
    }

    public static ClickDateDay inThePage(Map<String,String>mapCredencialesUsers){
        return Tasks.instrumented(ClickDateDay.class,mapCredencialesUsers);

    }
}
