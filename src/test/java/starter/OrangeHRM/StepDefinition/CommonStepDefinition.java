package starter.OrangeHRM.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OrangeHRM.Page.LoginPage;
import starter.OrangeHRM.step.LoginStep;

public class CommonStepDefinition {
    @Steps
    LoginStep loginStep;

    @Given("I already Login to the dashboard")
    public void alreadyLogin(){
        loginStep.openHRMLoginPage();
        loginStep.inputEmailAndPassword();
        loginStep.clickLoginButton();
    }



}
