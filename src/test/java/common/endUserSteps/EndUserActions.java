package common.endUserSteps;

import common.pageObjects.GooglePage;
import net.thucydides.core.annotations.Step;

public class EndUserActions {
    GooglePage googlePage;

    @Step
    public void launchURL(String url) {
        googlePage.openPage(url);
    }

    @Step
    public void enterText(String searchText) {
        googlePage.enterTextOnSearchBar(searchText);
    }

    @Step
    public void resultsCheck(String searchText) {
        googlePage.googleResultsCheck(searchText);
    }


}