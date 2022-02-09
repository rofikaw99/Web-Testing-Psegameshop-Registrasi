package starter.OrangeHRM.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OrangeHRM.Page.DashboardPage;
import starter.OrangeHRM.step.LoginStep;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("I open orangeHRM login page")
    public void i_open_orange_hrm_login_page() {
        loginStep.openHRMLoginPage();

    }
    @When("I input email and password in orangeHRM")
    public void i_input_email_and_password_in_orange_hrm() {
        loginStep.inputEmailAndPassword();
    }
    @When("I click button login orangeHRM")
    public void i_click_button_login_orange_hrm() {
        loginStep.clickLoginButton();
    }
    @Then("I can see my dashbord")
    public void i_can_see_my_dashbord() {
        loginStep.verifyDahsboard();
    }

}
