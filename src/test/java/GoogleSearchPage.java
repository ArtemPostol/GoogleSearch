import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleSearchPage extends GoogleBasePage{

    @FindBy(id = "lst-ib")
    private WebElement searchField;


    /**
     * Constructor of BasePage
     *
     * @param webDriver - webDriver instance
     */
    public GoogleSearchPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }


    public GoogleResultSearchPage search(String searchTerm) {
        searchField.sendKeys(searchTerm);
        searchField.sendKeys(Keys.ENTER);

        return new GoogleResultSearchPage(webDriver);

    }

    @Override
    boolean isPageLoaded() {
        return false;
    }
}
