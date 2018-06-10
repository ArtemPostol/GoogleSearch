package Test;

import Page.GoogleResultSearchPage;
import Page.GoogleResultSearchSecondPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class GoogleSearchTest extends GoogleSearchBaseTest {

    @Test
    public  void searchTest() {
     String searchTerm = "selenium";

        GoogleResultSearchPage googleResultSearchPage = googleSearchPage.search(searchTerm);

        googleResultSearchPage.waitUntilElementIsClickable();

        Assert.assertTrue(googleResultSearchPage.isPageLoaded(),
                "Google Result Search Page is not loaded");

        List<String> searchResultsList = googleResultSearchPage.getSearchResults();

        Assert.assertEquals(searchResultsList.size(), 10, "Count of search result items is wrong.");

        for (String searchResult:searchResultsList) {
            Assert.assertTrue(searchResult.toLowerCase().contains(searchTerm.toLowerCase()),
                    "Searchterm"+searchTerm+"was not found in: \n"+searchResult);
        }

        GoogleResultSearchSecondPage googleResultSearchSecondPage = googleResultSearchPage.clickOnSecondPage();

        Assert.assertTrue(googleResultSearchSecondPage.isPageLoaded(),
                "Google Result Search Page is not loaded");

        List<String> searchResultsSecondPageList = googleResultSearchPage.getSearchResults();

        Assert.assertEquals(searchResultsSecondPageList.size(), 10, "Count of search result items is wrong.");

        for (String searchResult:searchResultsList) {
            Assert.assertTrue(searchResult.toLowerCase().contains(searchTerm.toLowerCase()),
                    "Searchterm"+searchTerm+"was not found in: \n"+searchResult);
        }

    }

}
