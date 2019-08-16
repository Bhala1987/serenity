package common.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import common.endUserSteps.EndUserActions;

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
