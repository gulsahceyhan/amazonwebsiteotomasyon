Feature: Amazon Türkiye Giriş Yapma

  Scenario: Başarılı giriş yapma
    Given Kullanıcı Amazon Türkiye anasayfasındadır
    When Kullanıcı "Hesap ve Listeler" menüsüne tıklar
    And E-posta "test@example.com" girer
    And Devam et butonuna tıklar
    And Şifreyi "Test123!" girer
    And Giriş yap butonuna tıklar
    Then Kullanıcı başarıyla giriş yapmış olmalıdır

  Scenario: Yanlış şifre ile giriş yapmaya çalışma
    Given Kullanıcı Amazon Türkiye anasayfasındadır
    When Kullanıcı "Hesap ve Listeler" menüsüne tıklar
    And E-posta "test@example.com" girer
    And Devam et butonuna tıklar
    And Şifreyi "WrongPassword123!" girer
    And Giriş yap butonuna tıklar
    Then "Şifreniz yanlış" hata mesajı görüntülenir