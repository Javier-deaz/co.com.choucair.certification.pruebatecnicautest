package co.com.choucair.certification.pruebatecnicautest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/CreateUser.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.certification.pruebatecnicautest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
