Feature: Windows 11 Home Dizüstü Bilgisayar Arama

  Scenario: Windows 11 Home işletim sistemli dizüstü bilgisayarları filtreleme
    Given Kullanıcı Amazon Türkiye anasayfasındadır
    When Kullanıcı arama çubuğuna "dizüstü bilgisayar" yazar ve arar
    And Sonuçlar sayfasında "İşletim Sistemi" filtresinden "Windows 11 Home" seçeneğini işaretler
    Then Sonuçlarda sadece Windows 11 Home işletim sistemli dizüstü bilgisayarlar görüntülenir

  Scenario: Windows 11 Home işletim sistemli dizüstü bilgisayarları fiyata göre sıralama
    Given Kullanıcı Windows 11 Home işletim sistemli dizüstü bilgisayar sonuçları sayfasındadır
    When Kullanıcı "Sıralama" menüsünden "Fiyat: Düşükten yükseğe" seçeneğini seçer
    Then Sonuçlar fiyata göre artan sırada görüntülenir

  Scenario: Windows 11 Home işletim sistemli dizüstü bilgisayarları markaya göre filtreleme
    Given Kullanıcı Windows 11 Home işletim sistemli dizüstü bilgisayar sonuçları sayfasındadır
    When Kullanıcı "Marka" filtresinden "Lenovo" seçeneğini işaretler
    Then Sonuçlarda sadece Lenovo marka Windows 11 Home işletim sistemli dizüstü bilgisayarlar görüntülenir

  Scenario: Windows 11 Home işletim sistemli dizüstü bilgisayarları RAM kapasitesine göre filtreleme
    Given Kullanıcı Windows 11 Home işletim sistemli dizüstü bilgisayar sonuçları sayfasındadır
    When Kullanıcı "RAM Boyutu" filtresinden "16 GB" seçeneğini işaretler
    Then Sonuçlarda sadece 16 GB RAM'e sahip Windows 11 Home işletim sistemli dizüstü bilgisayarlar görüntülenir

  Scenario: Windows 11 Home işletim sistemli dizüstü bilgisayarın detaylarını kontrol etme
    Given Kullanıcı Windows 11 Home işletim sistemli dizüstü bilgisayar sonuçları sayfasındadır
    When Kullanıcı ilk ürüne tıklar
    Then Ürün detay sayfasında işletim sistemi "Windows 11 Home" olarak belirtilmiştir