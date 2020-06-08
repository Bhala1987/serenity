package common.stepDefinitions;

import common.endUserSteps.EndUserActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepDefs {
    @Steps
    EndUserActions endUserActions;

    @Given("^launch the google page url '(.*)'$")
    public void launchTheGooglePage(String url) {
        endUserActions.launchURL(url);
    }

    @When("^search for '(.*)'$")
    public void searchForSearchText(String searchText) {
        endUserActions.enterText(searchText);
    }

    @Then("^all the results should contain the text '(.*)'$")
    public void allTheResultsShouldContainTheTextSearchText(String searchText) {
        endUserActions.resultsCheck(searchText);
    }
}
