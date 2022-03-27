package starter.PseGameShop.Step;

import net.thucydides.core.annotations.Step;
import starter.PseGameShop.Page.HomePagePseGameShop;

import static org.junit.Assert.assertEquals;

public class RegisterPsegameshopSteps {

    HomePagePseGameShop homePagePseGameShop;

    @Step
    public void OpenPseGameShopHomePage(){
        homePagePseGameShop.open();
    }

    @Step
    public void chosefavoriteGenreConsoleHobbieInterestandGenderthenIinputvalidemailpasswordandconfirm(String email, String password, String ConfirmPassword){
        homePagePseGameShop.choseGenre();
        homePagePseGameShop.GenreAction();
        homePagePseGameShop.choseConsole();
        homePagePseGameShop.ConsolePlaystation();
        homePagePseGameShop.HobbiesInterest();
        homePagePseGameShop.Culinary();
        homePagePseGameShop.Gender();
        homePagePseGameShop.inputEmail(email);
        homePagePseGameShop.inputPassword(password);
        homePagePseGameShop.confirmPassword(ConfirmPassword);
    }

    @Step
    public void clickregisterButton(){
        homePagePseGameShop.registerbuttonObject();
    }

    @Step
    public void verifyregistermessage(){
        assertEquals("Thank you for registering. Your account has to be activated before you can login. Please check your email.",
                homePagePseGameShop.getregisterMessage());
    }

    @Step
    public void verifyweakPasswordMessage(){
        assertEquals("Very weak - Please enter a stronger password",
                homePagePseGameShop.getWeakPasswordMessage());
    }

    @Step
    public void appearPasswordDoNotMatch(){
        assertEquals("Passwords do not matchd",
                homePagePseGameShop.getmessagePasswordDoNotMatch());
    }

}
