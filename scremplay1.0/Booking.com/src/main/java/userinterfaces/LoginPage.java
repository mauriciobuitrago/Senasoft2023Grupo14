package userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
public class LoginPage {

    public static final Target BTN_START = Target.the("In the home section we click on log in or create an account to access the benefits of the page").locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[2]/div/a");
    public static final Target BNT_LOGIN =Target.the("When the first button is not there, we start it from the login").locatedBy("/*[@id=\"b2indexPage\"]/div[2]/div/header/nav[1]/div[2]/div/a/span");
    public static final Target TXT_EMAIL = Target.the("we enter credentials such as email").locatedBy("//*[@id=\"username\"]");
    public static final Target BTN_CONTINUE = Target.the("Once the email has been entered, click on the continue button").locatedBy("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button");
    public static final Target TXT_PASSWORD = Target.the("we enter the password").locatedBy("//*[@id=\"password\"]");
    public static final Target  BTN_SIGN_IN = Target.the("We click on the log in or create account button").locatedBy("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button");

}
