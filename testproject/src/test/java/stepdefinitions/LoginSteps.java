package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.Driver;
import static org.junit.Assert.*;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage(Driver.getDriver());

    @And("E-posta {string} girer")
    public void epostaGirer(String eposta) {
        loginPage.enterEmail(eposta);
    }

    @And("Devam et butonuna tıklar")
    public void devamEtButonunaTiklar() {
        loginPage.clickContinue();
    }

    @And("Şifreyi {string} girer")
    public void sifreyiGirer(String sifre) {
        loginPage.enterPassword(sifre);
    }

    @And("Giriş yap butonuna tıklar")
    public void girisYapButonunaTiklar() {
        loginPage.clickSignIn();
    }

    @Then("{string} hata mesajı görüntülenir")
    public void hataMesajiGoruntulenir(String mesaj) {
        assertTrue(loginPage.getErrorMessage().contains(mesaj));
    }
}