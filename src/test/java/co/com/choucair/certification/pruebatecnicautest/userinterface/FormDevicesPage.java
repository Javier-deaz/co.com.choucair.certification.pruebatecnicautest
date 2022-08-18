package co.com.choucair.certification.pruebatecnicautest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormDevicesPage {
    public static final Target SELECT_COMPUTER = Target.the("list of operating systems").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[1]"));

    public static final Target OPTION_COMPUTER = Target.the("select an computer windows").located(By.xpath("(//span[contains(@class,'ui-select-choices-row-inner')])[2]"));

    public static final Target SELECT_VERSION = Target.the("list of operating systems version").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[2]"));

    public static final Target OPTION_VERSION = Target.the("select operating systems Windows 10").located(By.xpath("(//span[contains(@class,'ui-select-choices-row-inner')])[26]"));

    public static final Target SELECT_LANGUAGE = Target.the("list of languages").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[3]"));

    public static final Target OPTION_LANGUAGE = Target.the("select language English").located(By.xpath("(//span[contains(@class,'ui-select-choices-row-inner')])[11]"));

    public static final Target SELECT_MOVILE = Target.the("list of moviles device").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[4]"));

    public static final Target OPTION_MOVILE = Target.the("select option Samsung").located(By.xpath("(//span[contains(@class,'ui-select-choices-row-inner')])[38]"));

    public static final Target SELECT_MODEL = Target.the("list of models moviles").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[5]"));

    public static final Target OPTION_MODEL = Target.the("select Galaxy Mini").located(By.xpath("(//span[contains(@class,'ui-select-choices-row-inner')])[57]"));

    public static final Target SELECT_SO = Target.the("list of Operating System").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[6]"));

    public static final Target OPTION_SO = Target.the("select Android 4.1.1").located(By.xpath("(//span[contains(@class,'ui-select-choices-row-inner')])[15]"));

    public static final Target BUTTON_LASTSTEP = Target.the("button last step to register user").located(By.xpath("//a/span[text()='Next: Last Step']"));


}
