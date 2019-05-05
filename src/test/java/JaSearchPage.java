import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JaSearchPage {

    WebDriver driver;
    By searchField = By.cssSelector(".JA_text.search-keywords");
    By searchButton = By.cssSelector(".search-button");
    By searchResultText = By.cssSelector(".search-results-heading");

    public JaSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public JaSearchPage enterSearchValue(String searchText) {
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys(searchText);
        return this;
    }

    public JaSearchPage clickSearchButton() {
        driver.findElement(searchButton).click();
        return this;
    }

        public String searchResultSummary() {
            String resultTest = driver.findElement(searchResultText).getText();
            System.out.println(resultTest);
            return resultTest;
        }
    }

