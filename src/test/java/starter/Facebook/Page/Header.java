package starter.Facebook.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Header extends PageObject {

    @Step
    public void verifyHeader(){

        String header = $(By.id("headerTittle")).getText();
        //di website header tulisannya "Facebook.com Indonesia"

        Boolean Result =header.contains("Facebook.com");
        //result = true;

    }

}
