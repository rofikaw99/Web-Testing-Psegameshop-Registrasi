package starter.OrangeHRM.Page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeListPage extends PageObject {
    @FindBy(id ="search-results")
    WebElement employeeList;

    @FindBy(id ="btnAdd")
    WebElement addEmployee;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[1]/h1")
    WebElement addEmployeeForm;

    @FindBy(id ="firstName")
    WebElement firstName;

    @FindBy(id ="middleName")
    WebElement middleName;

    @FindBy(id ="lastName")
    WebElement lastName;

    @FindBy(id ="employeeId")
    WebElement employeeId;

    @FindBy(id="chkLogin")
    WebElement createLoginDetails;

    @FindBy(id="btnSave")
    WebElement saveButton;

    @FindBy(how = How.XPATH,using = "//*[@id=\"profile-pic\"]/h1")
    WebElement nameResult;

    public Boolean verifyEmployeeList(){
        return employeeList.isDisplayed();
    }

    public void clickButtonAdd(){
        addEmployee.click();
    }

    public String verifyAddEmployeeForm(){
        return addEmployeeForm.getText();
    }

    public void typeFirstName(String firstNameValue){
        firstName.sendKeys(firstNameValue);
    }

    public void typeLastName(String lastNameValue){
        lastName.sendKeys(lastNameValue);
    }

    public String getEmployeeId(){

        return employeeId.getAttribute("value");
    }

    public void markCreateLoginDetails(){
        createLoginDetails.click();
    }

    public void clickButonSave(){
        saveButton.click();
    }

    public String getResult(){
       return nameResult.getText();
    }


}
