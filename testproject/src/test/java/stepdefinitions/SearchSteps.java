package stepdefinitions;

import io.cucumber.java.en.*;
import pages.SearchPage;
import utils.Driver;
import static org.junit.Assert.*;

public class SearchSteps {
    private SearchPage searchPage = new SearchPage(Driver.getDriver());

    @And("Sonuçlar sayfasında {string} filtresinden {string} seçeneğini işaretler")
    public void sonuclarSayfasindaFiltresindenSeceneginiIsaretler(String filtre, String secenek) {
        if (filtre.equals("İşletim Sistemi") && secenek.equals("Windows 11 Home")) {
            searchPage.clickWindows11HomeFilter();
        }
    }

    @Then("Sonuçlarda sadece Windows 11 Home işletim sistemli dizüstü bilgisayarlar görüntülenir")
    public void sonuclardaSadeceWindows11HomeIsletimSistemliDizustuBilgisayarlarGoruntulenir() {
        assertTrue(searchPage.areResultsWindows11Home());
    }

    @When("Kullanıcı {string} menüsünden {string} seçeneğini seçer")
    public void kullaniciMenusundenSeceneginiSecer(String menu, String secenek) {
        if (menu.equals("Sıralama") && secenek.equals("Fiyat: Düşükten yükseğe")) {
            searchPage.sortByPrice();
        }
    }
}
