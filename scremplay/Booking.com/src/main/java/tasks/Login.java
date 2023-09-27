package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class Login implements Task {

    public final Map<String,String>mapCredencialesUsers;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.BTN_START),
                Enter.theValue(mapCredencialesUsers.get("E-mail")).into(LoginPage.TXT_EMAIL),
                Click.on(LoginPage.BTN_CONTINUE),
                Enter.theValue(mapCredencialesUsers.get("Password")).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_SIGN_IN)

        );
    }

    public static Login inThePage(Map<String,String>mapCredencialesUsers){
        return instrumented(Login.class,mapCredencialesUsers);

    }
}
