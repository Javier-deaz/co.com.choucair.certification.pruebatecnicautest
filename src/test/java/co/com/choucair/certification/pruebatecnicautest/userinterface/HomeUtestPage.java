package co.com.choucair.certification.pruebatecnicautest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class HomeUtestPage extends PageObject {
    public static final Target BUTTON_JOIN = Target.the("Button to enter the registration form").located(By.xpath("//a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
}
