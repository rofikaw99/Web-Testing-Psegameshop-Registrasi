package starter.Facebook.Step;

import net.thucydides.core.annotations.Step;
import starter.Facebook.Page.LoginPage;

public class LoginFacebookSteps {

    LoginPage loginPage;

    @Step
    public void OpenFacebookPage(){
        loginPage.open();
    }

    @Step
    public void InputEmailandPassword(){
    loginPage.inputEmail();
    loginPage.inputPassword();
    }

    @Step
    public void clickLoginButton(){
    loginPage.clickLogin();
    }

}
