package starter.OrangeHRM.Page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class LoginPage extends PageObject {
    @FindBy(id="txtUsername")
    WebElement username;
    @FindBy(id="txtPassword")
    WebElement password;
    @FindBy(id="btnLogin")
    WebElement btnLogin;

    public void fillUsername(){
        username.sendKeys("Admin");
    }

    public void fillPassword(){
        password.sendKeys("admin123");
    }

    public void clickLoginButton(){
        btnLogin.click();
    }



}
