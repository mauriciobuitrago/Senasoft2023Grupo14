package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccommodationPage {
    public static final Target CHECK_DATE = Target.the("We click on the reservation date section to display the dates").locatedBy("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div");
    public static final Target CHECK_DAY1 = Target.the("We choose the first day and click on it").locatedBy("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr[5]/td[6]/span");
    public static final Target CHECK_DAY2 = Target.the("We choose the first day and click on it").locatedBy("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[6]/span");
}
