package starter.OrangeHRM.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OrangeHRM.step.AddEmployeeStep;

public class AddEmployeeStepDefinition {

    @Steps
    AddEmployeeStep addEmployeeStep;

    @When("I clik menu Employee List")
    public void clickMenuEmployeeList() {
        addEmployeeStep.clickMenuEmployeeList();
    }

    @Then("Employee list page appear")
    public void employeeListPage() {
        addEmployeeStep.checkEmployeeListPage();
    }

    @When("I clik add")
    public void clickAdd() {
        addEmployeeStep.clickAdd();
    }

    @Then("Employee form appear")
    public void employeeFormAppear() {
        addEmployeeStep.veriyFormAppear();
    }

    @When("I fill the data with first name {string} and last name {string}")
    public void fillData(String firstName, String lastName) {
        addEmployeeStep.fillemployeeData(firstName, lastName);
    }

    @And("click save button")
    public void clickSaveButton() {
        addEmployeeStep.clickSaveButton();
    }

    @Then("employee {string} added")
    public void employeeAdded(String Fullname) {
        addEmployeeStep.verifyNameResult(Fullname);
    }

}
