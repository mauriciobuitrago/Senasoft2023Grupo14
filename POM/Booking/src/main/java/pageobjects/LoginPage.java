package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/")
public class LoginPage extends PageObject {
    By BTN_START = By.xpath("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[2]/div/a");

    By TXT_EMAIL = By.xpath("//*[@id=\"username\"]");
    By BTN_CONTINUE = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button");
    By TXT_PASSWORD = By.xpath("//*[@id=\"password\"]");
    By BTN_SIGN_IN = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button");


    public By getBTN_START() {
        return BTN_START;
    }

    public void setBTN_START(By BTN_START) {
        this.BTN_START = BTN_START;
    }

    public By getTXT_EMAIL() {
        return TXT_EMAIL;
    }

    public void setTXT_EMAIL(By TXT_EMAIL) {
        this.TXT_EMAIL = TXT_EMAIL;
    }

    public By getBTN_CONTINUE() {
        return BTN_CONTINUE;
    }

    public void setBTN_CONTINUE(By BTN_CONTINUE) {
        this.BTN_CONTINUE = BTN_CONTINUE;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getBTN_SIGN_IN() {
        return BTN_SIGN_IN;
    }

    public void setBTN_SIGN_IN(By BTN_SIGN_IN) {
        this.BTN_SIGN_IN = BTN_SIGN_IN;
    }
}
