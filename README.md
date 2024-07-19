Bu projede Jira'da bir proje olusturarak yeni bir Sprint baslatilması hedeflenmistir. 

İlk olarak 1 User Story ve 3 Test Case yazilarak manuel testler yapilmistir.

[US_001 TC01]
![Ekran görüntüsü 2024-07-19 145848](https://github.com/user-attachments/assets/3c609d8b-5d3d-4d54-abf5-356e6a530255)

[US_001 TC02]
![Ekran görüntüsü 2024-07-19 145939](https://github.com/user-attachments/assets/a310a105-f920-4aa7-aec2-097d7a00d624)

[US_001 TC03]
![Ekran görüntüsü 2024-07-19 150013](https://github.com/user-attachments/assets/033b4f54-1420-49aa-9d66-69e9c6627a28)

Manuel testler tamamlandıktan sonra otomasyon aracı olarak Selenyum, yazılım dili olarak Java, ortam gelistiricisi olarak IntelliJ ve 
Framework olarak Cucumber kullanilarak BDD formatıyla testcaseler otomasyonla test edilmistir.

pom.xml dosyasında; 

Selenyum için kullanilan kutuphane,

![image](https://github.com/user-attachments/assets/78649af5-3b12-49e4-9631-31865e42b793)


JUnit için kullanilan kutuphane,

![image](https://github.com/user-attachments/assets/6900e092-edc4-4aee-aaac-5ece28b66015)


Faker class için kullanilan kutuphane,

![image](https://github.com/user-attachments/assets/36872466-62bb-454a-98ac-7d08c0033ab9)


Allure report için kullanilan kutuphane,

![image](https://github.com/user-attachments/assets/be7ab778-056f-4c75-bbac-4684f67419de)



Page package'i altında Base classi olusturuldu.

![image](https://github.com/user-attachments/assets/88bbced4-0a95-4288-b1a4-da575a574b8c)

Base classi abstract olacak sekilde olusturuldu. Diger classlarda kullanilacak objeler, Base classında class seviyesinde tanimlandi ve initialize methodunda atamalari yapildi

![image](https://github.com/user-attachments/assets/8335a6dc-954f-4af6-aec4-0dddc348aeda)

initialize methodu Driver classından çagirilarak olustulan objeler Driver calistikca kullanimi kolaylastirilmis oldu 

![Ekran görüntüsü 2024-07-19 155905](https://github.com/user-attachments/assets/d382ccca-b8c7-47d8-b862-9a058742f795)

Diger classlarda ise Base classı extends edilerek Base classında olusturulan objelere erisim kolayligi saglandi 

![image](https://github.com/user-attachments/assets/3b0164f3-9635-404e-bfcb-5b00962b6e3a)

![image](https://github.com/user-attachments/assets/9e52506e-1733-493a-804b-1d5fdab2fd66)

![image](https://github.com/user-attachments/assets/db811243-7c6a-4fd3-98a6-db1e5f403c62)

![image](https://github.com/user-attachments/assets/506f6b0b-654b-4514-a046-8678619840c6)

Feature directorysi altinda TestCaseler feature uzantili dosyalar olarak BDD formatiyla olusturuldu 

TC01

![image](https://github.com/user-attachments/assets/4fcc41f2-53a8-4326-8ccc-d55dd4d93675)

TC02

![image](https://github.com/user-attachments/assets/b50976b1-e037-4afc-b347-8cca8b79e272)

TC03

![image](https://github.com/user-attachments/assets/147f84f2-b20c-4c4f-9ba7-85e5d2efa55f)

Testleri sirayla calistirmak icin Runner classinda Features alanina features dosyalarinin yolu eklendi

![Adsız](https://github.com/user-attachments/assets/5ecc81a9-da51-4971-b637-369ef09b3f2e)


<p><b>Test Raporlari</b></p>

Testleri calistirdiktan sonra hem Cucumber report'a hem Allure report'a bakilarak incelemeler yapilmistir.
Cucumber Rapor

![Ekran görüntüsü 2024-07-19 141030](https://github.com/user-attachments/assets/7b565c83-ada0-4f7f-9eeb-c178171de93c)

![Ekran görüntüsü 2024-07-19 141038](https://github.com/user-attachments/assets/f67980c6-217d-4193-ba3d-5af9fa737a0b)

![Ekran görüntüsü 2024-07-19 141044](https://github.com/user-attachments/assets/0c7418d9-a4d2-4f45-a227-410546fba295)


Allure Rapor

![Ekran görüntüsü 2024-07-19 141740](https://github.com/user-attachments/assets/b9ae1083-2f19-48e1-9036-88e456af993b)

![Ekran görüntüsü 2024-07-19 141750](https://github.com/user-attachments/assets/4659c000-3dc5-41a6-944c-3eda3e3cf614)

![Ekran görüntüsü 2024-07-19 141805](https://github.com/user-attachments/assets/4dd324e4-b999-4b65-b16f-573be5fb54a9)

![Ekran görüntüsü 2024-07-19 141811](https://github.com/user-attachments/assets/30f1699c-e72b-419e-8f6a-9e69393de084)















