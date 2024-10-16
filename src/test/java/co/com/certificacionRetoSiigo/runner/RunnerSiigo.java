package co.com.certificacionRetoSiigo.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/CrearClienteSiigo.feature",
        glue = {"co.com.certificacionRetoSiigo.stepdefinitions","co.com.certificacionRetoSiigo.util"},
        snippets = CucumberOptions.SnippetType.CAMELCASE )



public class RunnerSiigo
{
}
