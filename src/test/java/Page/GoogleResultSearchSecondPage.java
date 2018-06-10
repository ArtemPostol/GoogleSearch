package Page;

import Page.GoogleBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class GoogleResultSearchSecondPage extends GoogleBasePage {

    @FindBy(xpath = "//div [@id='resultStats']")
    private WebElement resultStats;

    @FindBy(xpath = "//div [@class='srg']/div [@class='g']")
    private List<WebElement> searchResults;

    /**
     * Constructor of BasePage
     *
     * @param webDriver - webDriver instance
     */
    public GoogleResultSearchSecondPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @Override
    public boolean isPageLoaded() {
        return resultStats.isDisplayed();
    }

}
