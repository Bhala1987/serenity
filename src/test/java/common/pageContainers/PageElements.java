package common.pageContainers;

import net.serenitybdd.core.pages.WebElementFacade;


public class PageElements {

    @net.serenitybdd.core.annotations.findby.FindBy(css = "input[name='q']")
    private WebElementFacade input_googleSearchBar;

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//a/h3")
    private WebElementFacade text_googleResults;
}
