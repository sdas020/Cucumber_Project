package BDD_Project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features", glue="" tags="@tags")


public class runnerUI {

}
