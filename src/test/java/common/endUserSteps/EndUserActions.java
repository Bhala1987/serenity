package common.endUserSteps;

import net.thucydides.core.annotations.Step;
import common.pageObjects.GooglePage;

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