Feature: US_001 Jira'da issue type ekleyerek yeni bir sprint başlatmak istiyorum.

  @tc01
  Scenario:TC01 Jira'da issue type eklenerek bir sprint baslatilmali

    Given Kullanici "signInJira" adresine gider
    When Login ekraninin gorunur oldugu dogrulanir
    Then Email textboxinin gorunur ve islevsel oldugu dogrulanir
    Then Email textboxina gecerli "email" adresi girilir
    Then Continue butonunun gorunur ve aktif oldugu dogrulanir
    Then Continue butonuna tiklanir
    Then Password textboxinin gorunur ve aktif oldugu dogrulanir
    Then Password textboxina gecerli "password" bilgisi girilir
    Then Login butonunun gorunur ve aktif oldugu dogrulanir
    Then Login butonu tiklanir
    Then Uygulamaya giris yapildigi dogrulanir
    Then Sayfa kapatilir




