package co.com.choucair.certification.pruebatecnicautest.stepdefinitions;

import co.com.choucair.certification.pruebatecnicautest.tasks.OpenUp;
import co.com.choucair.certification.pruebatecnicautest.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreateUserStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that javier is on the uTest page$")
    public void thatJavierIsOnTheUTestPage() {
        OnStage.theActorCalled("Javier").wasAbleTo(
                OpenUp.thePage()
        );
    }

    @When("^he create an account entering all fields in the form$")
    public void heCreateAnAccountEnteringAllFieldsInTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.inThePage());
    }

    @Then("^he has a new user registered in uTest$")
    public void heHasANewUserRegisteredInUTest() {

    }

}
