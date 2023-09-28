package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HotelCostPage {

    public static final Target CHECK_STAR= Target.the("we select the filter of the highest hotel").locatedBy("//*[@id=\"filter_group_class_:r11:\"]/div[7]/label/span[3]/div/div/div/div/div");
    public static final Target BTN_AVAILABILITY= Target.the("We select the hotel that meets the expectations and click on the button").locatedBy("//*[@id=\"bodyconstraint-inner\"]/div[4]/div/div[2]/div[3]/div[2]/div[2]/div[3]/div[14]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/a");
}
