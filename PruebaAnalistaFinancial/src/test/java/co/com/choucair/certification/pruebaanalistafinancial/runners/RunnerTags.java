package co.com.choucair.certification.pruebaanalistafinancial.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/academyChoucair.feature",
        tags = "@stories",
        glue = "co/com/choucair/certification/pruebaanalistafinancial.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {

}
