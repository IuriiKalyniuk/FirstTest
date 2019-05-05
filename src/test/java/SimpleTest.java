import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class SimpleTest {

    @Test
    public void verifySearchPage() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/IuriiKalyniuk/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justanswer.com/archives/elastic-search.aspx?");
        driver.manage().window().maximize();

        WebElement searchField = driver.findElement(By.cssSelector(".JA_text.search-keywords"));
        searchField.sendKeys("Selenium");

        //click Search Button

        WebElement searchButton = driver.findElement(By.cssSelector(".search-button"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        //.search-results-heading

        WebElement searchResultText = driver.findElement(By.cssSelector(".search-results-heading"));
        String resultText = searchResultText.getText();
        System.out.println(resultText);

        Assert.assertEquals(resultText, "You searched for \"Selenium\". 3416 results found.");


    }
}
