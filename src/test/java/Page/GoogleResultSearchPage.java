package Page;

import Page.GoogleBasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class GoogleResultSearchPage extends GoogleBasePage {

    @FindBy(xpath = "//div [@id='resultStats']")
    private WebElement resultStats;

    @FindBy(xpath = "//a [@aria-label='Page 2']")
    private WebElement linnkSecondPage;

    @FindBy(xpath = "//div [@class='srg']/div [@class='g']")
    private List<WebElement> searchResults;

    @FindBy(xpath = "//a [@aria-label='Page 2']")
    private WebElement secondPage;


    /**
     * Constructor of BasePage
     *
     * @param webDriver - webDriver instance
     */
    public GoogleResultSearchPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @Override
    public boolean isPageLoaded() {
        return resultStats.isDisplayed();
    }

    public WebElement waitUntilElementIsClickable () {
        return super.waitUntilElementIsClickable(linnkSecondPage, 10);
    }

    public List<String> getSearchResults() {
        List<String> searchResultsList = new ArrayList();
        for (WebElement searchResult : searchResults) {
            ((JavascriptExecutor) webDriver).executeScript(
                    "arguments[0].scrollIntoView();", searchResult);

            String searchResultText = searchResult.getText();
            searchResultsList.add(searchResultText);
        }
        return searchResultsList;
    }

    public GoogleResultSearchSecondPage clickOnSecondPage(){
        secondPage.click();
        return new GoogleResultSearchSecondPage(webDriver);

    }

}
