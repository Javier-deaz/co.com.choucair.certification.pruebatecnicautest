package co.com.choucair.certification.pruebatecnicautest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPersonalPage {
    public static final Target INPUT_FIRSTNAME = Target.the("input to enter first name").located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("input to enter last name").located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("input to enter email adress").located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("list of months").located(By.xpath("//select[@id='birthMonth']"));

    public static final Target SELECT_DAY = Target.the("list of days to 31").located(By.xpath("//select[@id='birthDay']"));

    public static final Target SELECT_YEAR = Target.the("list of years").located(By.xpath("//select[@id='birthYear']"));

    public static final Target BUTTON_NEXTLOCATION = Target.the("button to follow with second form").located(By.xpath("//a[@class='btn btn-blue']"));

}
