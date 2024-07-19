Feature:US_001 Jira'da issue type ekleyerek yeni bir sprint başlatmak istiyorum.

  @tc02
  Scenario: TC02 Create project butonu ile bir proje olusturulmalı

    Given Kullanici "signInJira" adresine gider
    When Email textboxina gecerli "email" adresi girilir
    Then Continue butonuna tiklanir
    Then Password textboxina gecerli "password" bilgisi girilir
    Then Login butonu tiklanir
    Then Your apps bolumunde Jira app'ine tiklanir
    Then Create project butonunun gorunur oldugu dogrulanir
    Then Create project butonuna tiklanir
    Then Sol bolumde Project Templates alaninda software development linkinin gorunur oldugu dogrulanir
    Then Software development linkine tiklanir
    Then Scrum'in gorunur oldugu dogrulanir
    Then Scrum'a tiklanir
    Then Use Template butonuna tiklanir
    Then Select a team managed butonuna tilanir
    Then Name textboxina random bir proje ismi girilir
    Then Access dropdownundan limited option secilir
    Then Next butonuna tiklanir
    Then Proje olustugu dogrulanir
    Then Sayfa kapatilir

