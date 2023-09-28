package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReservationPage {

    public static final Target BTN_RESERVATION = Target.the("click to book the hotel").locatedBy("//*[@id=\"hp_book_now_button\"]");
}
