package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "html:target/cucumber-reports/rapor.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = {"src/test/resources/Features/TC01.feature",
                "src/test/resources/Features/TC02.feature",
                "src/test/resources/Features/TC03.feature"},
        glue = {"stepdefinitions","hooks"},
        dryRun = false

)
public class Runner {

}
