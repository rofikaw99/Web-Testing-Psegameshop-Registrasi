package starter.PseGameShop.Page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://www.psegameshop.com/")
public class HomePagePseGameShop extends PageObject {

    @FindBy(id="acf-field_5e758bca4e8cc")
    WebElement genrefield;

    @FindBy(how = How.XPATH ,using="//*[@id=\"acf-field_5e758bca4e8cc\"]/option[2]")
    WebElement action;

    @FindBy(id="acf-field_5e75905014c81")
    WebElement consolefield;

    @FindBy(how= How.XPATH, using="//*[@id=\"acf-field_5e75905014c81\"]/option[2]")
    WebElement Playstation;

    @FindBy(id="acf-field_5ea976d054e4e")
    WebElement HobbiesInterestfield;

    @FindBy(how= How.XPATH, using="//*[@id=\"acf-field_5ea976d054e4e\"]/option[2]")
    WebElement CulinaryOption;

    @FindBy(id="acf-field_5ea3be750efb3-male")
    WebElement genderoption;

    @FindBy(id="reg_email")
    WebElement fieldEmail;

    @FindBy(id="reg_password")
    WebElement fieldpassword;

    @FindBy(id="reg_confirm_password")
    WebElement reg_confirm_password;

    @FindBy(how= How.XPATH, using="//*[@id=\"customer_login\"]/div[2]/div/form/p[4]/button")
    WebElement customerRegister;

    @FindBy(how= How.XPATH, using="//*[@id=\"wrapper\"]/div")
    WebElement messageRegister;

    @FindBy(how= How.XPATH, using="//*[@id=\"customer_login\"]/div[2]/div/form/p[2]/span/div")
    WebElement weakPasswordMessage;

    @FindBy(how= How.XPATH, using="//*[@id=\"wrapper\"]/ul/li/div/text()")
    WebElement passwordDonotMatch;

    public void choseGenre(){genrefield.click();}
    public void GenreAction(){action.click();}
    public void choseConsole(){consolefield.click();}
    public void ConsolePlaystation(){Playstation.click();}
    public void HobbiesInterest(){HobbiesInterestfield.click();}
    public void Culinary(){CulinaryOption.click();}
    public void Gender(){genderoption.click();}
    public void inputEmail(String email){fieldEmail.sendKeys(email);}
    public void inputPassword(String password){fieldpassword.sendKeys(password);}
    public void confirmPassword(String ConfirmPassword){reg_confirm_password.sendKeys(ConfirmPassword);}
    public void registerbuttonObject(){customerRegister.click();}
    public String getregisterMessage(){return messageRegister.getText();}
    public String getWeakPasswordMessage(){return weakPasswordMessage.getText();}
    public String getmessagePasswordDoNotMatch(){return passwordDonotMatch.getText();}

}
