package co.com.choucair.certification.pruebatecnicautest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormLaststepPage {
    public static final Target INPUT_PASSWORD = Target.the("input to enter password").located(By.id("password"));

    public static final Target INPUT_CONFIRMPASS = Target.the("input to confirm password").located(By.id("confirmPassword"));

    public static final Target CHECK_OPTIONAL = Target.the("check if you want to receive email and updates").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));

    public static final Target CHECK_TERMS = Target.the("check if you read and accept Terms of Use and uTest Guidelines").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));

    public static final Target CHECK_PRIVACY = Target.the("check if you accept and read Privacy & Security Policy").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));

    public static final Target BUTTON_COMPLETE = Target.the("button to complete register").located(By.id("laddaBtn"));

}
