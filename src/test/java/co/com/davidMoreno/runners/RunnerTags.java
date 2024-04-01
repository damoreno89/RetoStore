package co.com.davidMoreno.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
      //  tags = "@Utest",
        glue = "co.com.davidMoreno.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerTags {}





