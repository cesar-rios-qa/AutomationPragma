package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "StepsDefinitions",
        features = "src/test/resources/features",
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CucumberTestSuite {}
