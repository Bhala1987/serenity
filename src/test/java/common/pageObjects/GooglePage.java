package common.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.mortbay.log.Log;
import org.openqa.selenium.Keys;

import java.util.List;

public class GooglePage extends PageObject {

    @FindBy(css = "input[name='q']")
    private WebElementFacade input_googleSearchBar;

    @FindBy(xpath = "//a/h3")
    private List<WebElementFacade> text_googleResults;

    public void openPage(String url) {
        getDriver().get(url);
        MatcherAssert.assertThat("Couldn't open up the page as the expected URL is : " + url + " but the current url is : " + getDriver().getCurrentUrl(), getDriver().getCurrentUrl().contains(url));
        Log.info("Launched the URL : " + url);
        getDriver().manage().window().maximize();
        Log.info("Maximized the window");
    }

    public void enterTextOnSearchBar(String searchText) {
        input_googleSearchBar.clear();
        input_googleSearchBar.sendKeys(searchText);
        input_googleSearchBar.sendKeys(Keys.ENTER);
        Log.info("Entered the text : " + searchText + " onto the Google Search Bar");
    }

    public void googleResultsCheck(String searchText) {
        MatcherAssert.assertThat("Not all Google results are displaying the text : " + searchText,
                text_googleResults.stream().allMatch(results -> results.getText().contains(searchText)));
        Log.info("All Google Results are displayed with the text : " + searchText);
    }
}
