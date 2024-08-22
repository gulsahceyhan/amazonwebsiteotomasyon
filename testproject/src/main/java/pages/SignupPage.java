package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
    private WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        WebElement nameField = driver.findElement(By.id("ap_customer_name"));
        nameField.sendKeys(name);
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys(password);
    }

    public void enterPasswordCheck(String password) {
        WebElement passwordCheckField = driver.findElement(By.id("ap_password_check"));
        passwordCheckField.sendKeys(password);
    }

    public void clickContinue() {
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
    }

    public boolean isSuccessMessageDisplayed() {
        WebElement successMessage = driver.findElement(By.xpath("//h1[contains(text(),'Hesabınız oluşturuldu')]"));
        return successMessage.isDisplayed();
    }
}
