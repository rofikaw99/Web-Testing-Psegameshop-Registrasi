package starter.OrangeHRM.Page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends PageObject {
    @FindBy(id="welcome")
    WebElement userLoggedIn;

    @FindBy(how = How.XPATH ,using="//*[@id='content']/div/div[1]/h1")
    WebElement dasboardHeader;

    @FindBy(id ="branding")
    WebElement logo;

    @FindBy(id = "menu_pim_viewPimModule")
    WebElement menuPIM;

    @FindBy(id ="menu_pim_viewEmployeeList")
    WebElement menuEmployeeList;

    @FindBy(id="panel_draggable_0_0")
    WebElement quickLaunch;

    @FindBy(how=How.XPATH, using = "//*[@id='panel_resizable_0_0']/legend")
    WebElement quickLaunchTitle;


    public String getLoggedinMessage(){
       return userLoggedIn.getText();
    }

    public String getDashboardHeader(){
        return dasboardHeader.getText();
    }

    public Boolean verifyLogo(){
        return logo.isDisplayed();
    }

    public void clickMenuPIM(){
        menuPIM.click();
    }

    public void clickEmployeeList(){
        menuEmployeeList.click();
    }

    public boolean verifyQuickLaunch (){
        return quickLaunch.isDisplayed();
    }

    public String verifyQuickLaunchTitle(){
        return quickLaunch.getText();
    }




}
