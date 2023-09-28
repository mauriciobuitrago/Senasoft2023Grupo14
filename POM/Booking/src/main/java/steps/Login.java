package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.LoginPage;


public class Login {
    LoginPage loginPage = new LoginPage();
@Step
    public void openBrowser(){
        loginPage.open();
    }

    public void satrt() {
        loginPage.getDriver().findElement(loginPage.getBTN_START())
                .click();
    }

    public void email(){
    loginPage.getDriver().findElement(loginPage.getTXT_EMAIL())
            .sendKeys("jhonsenapro@gmail.com");
    }
    public void continueButton(){
        loginPage.getDriver().findElement(loginPage.getBTN_CONTINUE())
                .click();
    }
    public void password(){
        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD())
                .sendKeys("123456789Smith");

    }
    public void signIn(){
    loginPage.getDriver().findElement(loginPage.getBTN_SIGN_IN())
            .click();
    }



}
