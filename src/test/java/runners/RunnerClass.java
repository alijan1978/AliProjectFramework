package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utils.CommonMethods;

@RunWith(Cucumber.class)
@CucumberOptions(
        // in features: we pass the path of our feature folder
        features = "src/test/resources/features",
        // in glue : we find the implementation of our feature files
        // So, we provide the path of our package to get all the steps definition

        glue = "steps",

        dryRun = false,
        // to set it False, it will run.... if set to True, it shows undefined steps

        monochrome = true,

        tags = "@addEmployee"
)
public class RunnerClass {


}
