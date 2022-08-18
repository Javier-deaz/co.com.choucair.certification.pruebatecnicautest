package co.com.choucair.certification.pruebatecnicautest.tasks;

import co.com.choucair.certification.pruebatecnicautest.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterUser implements Task {
    public static RegisterUser inThePage() {
        return Tasks.instrumented(RegisterUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUtestPage.BUTTON_JOIN),
                Enter.theValue("Javier").into(FormPersonalPage.INPUT_FIRSTNAME),
                Enter.theValue("De Az").into(FormPersonalPage.INPUT_LASTNAME),
                Enter.theValue("javierdeaz@gmail.com").into(FormPersonalPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("July").from(FormPersonalPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("12").from(FormPersonalPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("1998").from(FormPersonalPage.SELECT_YEAR),
                Click.on(FormPersonalPage.BUTTON_NEXTLOCATION),
                Enter.theValue("48001").into(FormLocationPage.INPUT_ZIP),
                Click.on(FormLocationPage.BUTTON_DEVICES),
                Click.on(FormDevicesPage.SELECT_COMPUTER),
                Click.on(FormDevicesPage.OPTION_COMPUTER),
                Click.on(FormDevicesPage.SELECT_VERSION),
                Click.on(FormDevicesPage.OPTION_VERSION),
                Click.on(FormDevicesPage.SELECT_LANGUAGE),
                Click.on(FormDevicesPage.OPTION_LANGUAGE),
                Click.on(FormDevicesPage.SELECT_MOVILE),
                Click.on(FormDevicesPage.OPTION_MOVILE),
                Click.on(FormDevicesPage.SELECT_MODEL),
                Click.on(FormDevicesPage.OPTION_MODEL),
                Click.on(FormDevicesPage.SELECT_SO),
                Click.on(FormDevicesPage.OPTION_SO),
                Click.on(FormDevicesPage.BUTTON_LASTSTEP),
                Enter.theValue("E3457--av32132").into(FormLaststepPage.INPUT_PASSWORD),
                Enter.theValue("E3457--av32132").into(FormLaststepPage.INPUT_CONFIRMPASS),
                Click.on(FormLaststepPage.CHECK_OPTIONAL),
                Click.on(FormLaststepPage.CHECK_TERMS),
                Click.on(FormLaststepPage.CHECK_PRIVACY),
                Click.on(FormLaststepPage.BUTTON_COMPLETE)
                );
    }
}
