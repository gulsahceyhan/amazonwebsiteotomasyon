package stepdefinitions;

import io.cucumber.java.en.*;
import pages.SignupPage;
import utils.Driver;
import static org.junit.Assert.*;

public class SignupSteps {
    private SignupPage signupPage = new SignupPage(Driver.getDriver());

    @And("Ad alanına {string} girer")
    public void adAlaninaGirer(String ad) {
        signupPage.enterName(ad);
    }

    @And("E-posta alanına {string} girer")
    public void epostaAlaninaGirer(String eposta) {
        signupPage.enterEmail(eposta);
    }

    @And("Şifre alanına {string} girer")
    public void sifreAlaninaGirer(String sifre) {
        signupPage.enterPassword(sifre);
    }

    @And("Şifreyi tekrar gir alanına {string} girer")
    public void sifreyiTekrarGirAlaninaGirer(String sifre) {
        signupPage.enterPasswordCheck(sifre);
    }

    @And("Hesap oluştur butonuna tıklar")
    public void hesapOlusturButonunaTiklar() {
        signupPage.clickContinue();
    }

    @Then("Hesap başarıyla oluşturulduğu mesajı görüntülenir")
    public void hesapBasariylaOlusturulduguMesajiGoruntulenir() {
        assertTrue(signupPage.isSuccessMessageDisplayed());
    }
}