package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys(email);
    }

    public void clickContinue() {
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys(password);
    }

    public void clickSignIn() {
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();
    }

    public String getErrorMessage() {
        WebElement errorMessageBox = driver.findElement(By.id("auth-error-message-box"));
        return errorMessageBox.getText();
    }
}
