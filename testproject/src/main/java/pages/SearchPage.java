package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickWindows11HomeFilter() {
        WebElement windows11HomeFilter = driver.findElement(By.xpath("//span[text()='İşletim Sistemi']/../following-sibling::ul//span[text()='Windows 11 Home']/../div/label/input"));
        windows11HomeFilter.click();
    }

    public void sortByPrice() {
        WebElement sortDropdown = driver.findElement(By.cssSelector("span.a-dropdown-label"));
        sortDropdown.click();
        // Implement logic to select "Price: Low to High" option
    }

    public boolean areResultsWindows11Home() {
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div[data-component-type='s-search-result']"));
        for (WebElement result : searchResults) {
            if (!result.getText().toLowerCase().contains("windows 11 home")) {
                return false;
            }
        }
        return true;
    }
}
