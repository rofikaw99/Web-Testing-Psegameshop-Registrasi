package starter.OrangeHRM.step;

import net.thucydides.core.annotations.Step;
import starter.OrangeHRM.Page.DashboardPage;
import starter.OrangeHRM.Page.LoginPage;
import static net.thucydides.core.matchers.BeanMatcherAsserts.shouldMatch;
import static org.junit.Assert.*;

public class LoginStep {
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Step
    public void openHRMLoginPage(){
        loginPage.open();
    }

    @Step
    public void inputEmailAndPassword(){
        loginPage.fillUsername();
        loginPage.fillPassword();
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyDahsboard(){
        assertTrue(dashboardPage.getLoggedinMessage().contains("Welcome"));
        assertEquals("Dashboard", dashboardPage.getDashboardHeader());
        assertTrue(dashboardPage.verifyLogo());

    }

    @Step
    public void verifyDashboardBody(){
        assertTrue(dashboardPage.verifyQuickLaunch());
        assertTrue(dashboardPage.verifyQuickLaunchTitle().contains("Quick Launch"));
    }

}
