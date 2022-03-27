package starter.PseGameShop.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.PseGameShop.Step.RegisterPsegameshopSteps;

public class RegisterPsegameshopStepDef {

    @Steps
    RegisterPsegameshopSteps registerPsegameshopSteps;

    @Given("I open psegameshop home page")
    public void openpsegameshopPage(){
        registerPsegameshopSteps.OpenPseGameShopHomePage();
    }

    @When("I chose favorite Genre, Console, Hobbie & Interest, and Gender then I input email {}, password {} and confirm {}")
    public void IchosefavoriteGenreConsole(String email, String password, String ConfirmPassword){
        registerPsegameshopSteps.chosefavoriteGenreConsoleHobbieInterestandGenderthenIinputvalidemailpasswordandconfirm(email, password, ConfirmPassword);
    }

    @And("I click button register")
    public void clickButtonregister(){
        registerPsegameshopSteps.clickregisterButton();
    }

    @Then("Appear message thank you for register")
    public void appearMessageThankYouForRegister() { registerPsegameshopSteps.verifyregistermessage(); }

    @Then("Appear message weak password")
    public void appearMessageWeakPassword() { registerPsegameshopSteps.verifyweakPasswordMessage();
    }

    @Then("Appear password do not match")
    public void appearPasswordDoNotMatch() { registerPsegameshopSteps.appearPasswordDoNotMatch();
    }
}
