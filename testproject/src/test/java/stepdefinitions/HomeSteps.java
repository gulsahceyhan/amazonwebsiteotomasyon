package stepdefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import utils.Driver;

public class HomeSteps {
    private HomePage homePage = new HomePage(Driver.getDriver());

    @Given("Kullanıcı Amazon Türkiye anasayfasındadır")
    public void kullaniciAmazonTurkiyeAnasayfasindadir() {
        homePage.navigateTo();
    }

    @When("Kullanıcı {string} menüsüne tıklar")
    public void kullaniciMenuyeTiklar(String menuAdi) {
        homePage.clickAccountList();
    }

    @When("Kullanıcı arama çubuğuna {string} yazar ve arar")
    public void kullaniciAramaCubugunaYazarVeArar(String aranacakKelime) {
        homePage.searchFor(aranacakKelime);
    }
}