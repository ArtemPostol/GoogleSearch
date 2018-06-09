import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class GoogleSearchTest extends GoogleSearchBaseTest{

    @Test
    public  void searchTest() {
     String searchTerm = "selenium";

        GoogleResultSearchPage googleResultSearchPage = googleSearchPage.search(searchTerm);

        googleResultSearchPage.waitUntilElementIsClickable();

        Assert.assertTrue(googleResultSearchPage.isPageLoaded(),
                "Google Result Search Page is not loaded");







    }

}
