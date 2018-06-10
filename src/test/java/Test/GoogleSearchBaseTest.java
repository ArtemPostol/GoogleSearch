package Test;

import Page.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class GoogleSearchBaseTest {
    WebDriver webDriver;
    GoogleSearchPage googleSearchPage;

    @Parameters({"browserType", "envURL"})
    @BeforeMethod
    public void beforeTest(@Optional("firefox") String browserType,
                           @Optional("https://www.google.com/") String envURL) {
        switch (browserType.toLowerCase()){
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                break;
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
            default :
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
        }

        webDriver.navigate().to(envURL);
        googleSearchPage = new GoogleSearchPage(webDriver);
    }

    @AfterMethod
    public void after() {
        webDriver.close();
    }

}
