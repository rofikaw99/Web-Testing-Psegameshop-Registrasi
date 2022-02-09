package starter.OrangeHRM.step;

import net.thucydides.core.annotations.Step;
import starter.OrangeHRM.Page.DashboardPage;
import starter.OrangeHRM.Page.EmployeeListPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddEmployeeStep {

    DashboardPage dashboardPage;
    EmployeeListPage employeeListPage;

    @Step
    public void clickMenuEmployeeList(){
        dashboardPage.clickMenuPIM();
        dashboardPage.clickEmployeeList();
    }

    @Step
    public void checkEmployeeListPage(){
        assertTrue(employeeListPage.verifyEmployeeList());
    }

    @Step
    public void clickAdd(){
        employeeListPage.clickButtonAdd();
    }

    @Step
    public void veriyFormAppear(){
        assertEquals("Add Employee",employeeListPage.verifyAddEmployeeForm());
    }

    @Step
    public void fillemployeeData(String firstName, String lastname){
        employeeListPage.typeFirstName(firstName);
        employeeListPage.typeLastName(lastname);
    }

    @Step
    public void clickSaveButton(){
        employeeListPage.clickButonSave();
    }

    @Step
    public void verifyNameResult(String fullname){
        assertEquals(fullname,employeeListPage.getResult());
    }

}
