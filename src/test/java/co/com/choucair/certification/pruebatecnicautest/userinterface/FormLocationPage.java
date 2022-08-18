package co.com.choucair.certification.pruebatecnicautest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormLocationPage {
    public static final Target INPUT_ZIP = Target.the("input to enter zip or postal code").located(By.id("zip"));

    //public static final Target SELECT_COUNTRY = Target.the("list of contries").located(By.xpath("(//div[@class='ui-select-match'])[2]"));

    //public static final Target OPTION_COUNTRY = Target.the("select country Colombia").located(By.xpath("(//span[contains(@class,'ui-select-choices-row-inner')])[52]"));
    public static final Target BUTTON_DEVICES = Target.the("button next devices, step three").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
