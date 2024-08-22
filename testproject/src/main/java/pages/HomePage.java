package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.get("https://www.amazon.com.tr/");
    }

    public void clickAccountList() {
        WebElement accountListLink = driver.findElement(By.id("nav-link-accountList"));
        accountListLink.click();
    }

    public void searchFor(String keyword) {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(keyword);
        searchBox.submit();
    }
}
