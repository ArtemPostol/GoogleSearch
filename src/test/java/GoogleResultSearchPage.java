import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultSearchPage extends GoogleBasePage {

    @FindBy(xpath = "//div [@id='resultStats']")
    private WebElement resultStats;

    @FindBy(xpath = "//a [@aria-label='Page 2']")
    private WebElement linnkSecondPage;


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
    boolean isPageLoaded() {
        return resultStats.isDisplayed();
    }

    public WebElement waitUntilElementIsClickable () {
        return super.waitUntilElementIsClickable(linnkSecondPage, 10);
    }

}
