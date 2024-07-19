Feature:US_001 Jira'da issue type ekleyerek yeni bir sprint başlatmak istiyorum.

  @tc03
  Scenario: TC03 Issue type ekleyerek Sprint başlatılmalı

    Given Kullanici "signInJira" adresine gider
    When Email textboxina gecerli "email" adresi girilir
    Then Continue butonuna tiklanir
    Then Password textboxina gecerli "password" bilgisi girilir
    Then Login butonu tiklanir
    Then Your apps bolumunde Jira app'ine tiklanir
    Then Olusturulan proje ismine tiklanir
    Then Header bolumunde bulunan create butonuna tiklanir
    Then Zorunlu textboxlara gecerli bilgiler girilerek issue type olusturulur
    Then Sol bolumde Planning altinda bulunan Backlog linkine tiklanir
    Then Backlogda olusturulan issue Sprint1'e suruklenir
    Then Start sprint butonuna tiklanir
    Then Start butonuna tiklanir
    Then Sprintin basladigi dogrulanir
    Then Sayfa kapatilir
