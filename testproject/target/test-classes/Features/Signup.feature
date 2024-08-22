Feature: Amazon Türkiye Üye Olma

  Scenario: Başarılı üye olma
    Given Kullanıcı Amazon Türkiye anasayfasındadır
    When Kullanıcı "Hesap ve Listeler" menüsüne tıklar
    And "Yeni müşteriyim. Hesap oluşturmak istiyorum." seçeneğine tıklar
    And Ad alanına "Test" girer
    And E-posta alanına "test@example.com" girer
    And Şifre alanına "Test123!" girer
    And Şifreyi tekrar gir alanına "Test123!" girer
    And Hesap oluştur butonuna tıklar
    Then Hesap başarıyla oluşturulduğu mesajı görüntülenir

  Scenario: Var olan e-posta ile üye olmaya çalışma
    Given Kullanıcı Amazon Türkiye anasayfasındadır
    When Kullanıcı "Hesap ve Listeler" menüsüne tıklar
    And "Yeni müşteriyim. Hesap oluşturmak istiyorum." seçeneğine tıklar
    And Ad alanına "Test" girer
    And E-posta alanına "existing@example.com" girer
    And Şifre alanına "Test123!" girer
    And Şifreyi tekrar gir alanına "Test123!" girer
    And Hesap oluştur butonuna tıklar
    Then "Bu e-posta adresi zaten kullanılıyor" hata mesajı görüntülenir