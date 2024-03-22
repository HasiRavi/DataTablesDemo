package runnerPackage;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="feature",
		glue="stepDefinitions",
		tags = "@select",
		monochrome=true,
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		//plugin="usage"
		//plugin={"pretty","html:target/cucumber_reports","json:target/cucumber_reports.json","junit:target/cucumber_reports.xml"}
		//plugin={"pretty","json:target/cucumber_reports.json"}
		//plugin={"pretty","junit:target/cucumber_reports.xml"}
		dryRun = false
		)
public class LoginRunner{

}
