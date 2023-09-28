package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccommodationPage {
    public static final Target TXT_CITY = Target.the("We enter the city of origin").locatedBy("/html/body/div[4]/div[2]/div/form/div[1]/div[1]/div/div/div[1]/div/div/input");
    public static final Target CHECK_DATE = Target.the("We click on the reservation date section to display the dates").locatedBy("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div");
    public static final Target CHECK_DAY1 = Target.the("We choose the first day and click on it").locatedBy("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr[5]/td[6]/span");
    public static final Target CHECK_DAY2 = Target.the("We choose the first day and click on it").locatedBy("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[6]/span");
    public static final Target CHECK_BEDROOMS = Target.the("we choose the number of rooms").locatedBy("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[3]/div/button");
    public static final Target NUMBER_OF_ROOMS = Target.the("We add the number of desired rooms").locatedBy("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[3]/div[2]/button[2]");
    public static final Target NUMBER_OF_ADULTS = Target.the("We place the number of adults desired").locatedBy("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[1]/div[2]/button[2]");
    public static final Target NUMBER_OF_CHILDREN = Target.the("We introduce the number of children in the room").locatedBy("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[2]/div[2]/button[2]");
    public static final Target OPTION1 = Target.the("We select the age option").locatedBy("/html/body/div[4]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[3]/div[1]/div/select");
    public static final Target OPTION2 = Target.the("We select the age option").locatedBy("/html/body/div[4]/div/div[2]/div/div[1]/div/form/div[1]/div[3]/div/div/div/div/div[3]/div[2]/div/select");
    public static final Target AGE_CHILDREN1 = Target.the("we select the age range").locatedBy("/html/body/div[4]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[3]/div[1]/div/select/option[19]");
    public static final Target AGE_CHILDREN2 = Target.the("we select the age range two").locatedBy("/html/body/div[4]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[3]/div[1]/div/select/option[19]");
    public static final  Target BTN_READY  = Target.the("eleccion").locatedBy("/html/body/div[4]/div/div[2]/div/div[1]/div/form/div[1]/div[3]/div/div/div/button");

    public static final Target BTN_SEARCH= Target.the("Once all the elements are ready, we click on the search button").locatedBy("//button[@class =\"a83ed08757 c21c56c305 a4c1805887 f671049264 d2529514af c082d89982 aa11d0d5cd\"]");

}
