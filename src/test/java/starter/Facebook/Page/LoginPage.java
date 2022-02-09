package starter.Facebook.Page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://www.facebook.com/")
public class LoginPage extends PageObject {


    @FindBy(id="email")
    WebElement fieldEmail;

    @FindBy(id="pass")
    WebElement fieldpassword;

    @FindBy(how= How.NAME, using="login")
    WebElement loginButton;


    public void inputEmail(){
        fieldEmail.sendKeys("email@gmail.com");
    }

    public void inputPassword(){
        fieldpassword.sendKeys("password");
    }

    public void clickLogin(){
        loginButton.click();
    }

}
