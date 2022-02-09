package starter.Facebook.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Facebook.Step.LoginFacebookSteps;
import starter.Facebook.Step.VerificationSteps;

public class LoginFacebookStepDef {

    @Steps
    LoginFacebookSteps loginFacebookSteps;

    @Steps
    VerificationSteps verificationSteps;

    @Given("I open facebook login page")
    public void openFacebookLoginPage(){
        loginFacebookSteps.OpenFacebookPage();
    }

    @When("I input email and password")
    public void inputEmailandPassword(){
        loginFacebookSteps.InputEmailandPassword();
    }

    @When("I click button login")
    public void clickButtonLogin(){
        loginFacebookSteps.clickLoginButton();
    }

    @Then("I can see my news feed")
    public void seeMyNewsFee(){

//        verificationSteps.VerifynewsFeedPage();
    }
}
