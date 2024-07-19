package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.Base;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class JiraStepDefinition extends Base {

    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Then("Login ekraninin gorunur oldugu dogrulanir")
    public void login_ekraninin_gorunur_oldugu_dogrulanir() {
        String expectedUrl = "https://id.atlassian.com/login?continue=https%3A%2F%2Fteam.atlassian.com%2Fyour-work&application=atlas";
        assertTrue(expectedUrl.contains("login"));
    }

    @Then("Email textboxinin gorunur ve islevsel oldugu dogrulanir")
    public void email_textboxinin_gorunur_ve_islevsel_oldugu_dogrulanir() {
        jiraPage.verifyDisplayEnabled(jiraPage.textBoxEmail);
    }

    @Then("Email textboxina gecerli {string} adresi girilir")
    public void email_textboxina_gecerli_adresi_girilir(String email) {
        jiraPage.textBoxEmail.sendKeys(ConfigReader.getProperty(email));
    }

    @Then("Continue butonunun gorunur ve aktif oldugu dogrulanir")
    public void continueButonununGorunurVeAktifOlduguDogrulanir() {
        jiraPage.verifyDisplayEnabled(jiraPage.buttonContinue);
    }

    @Then("Continue butonuna tiklanir")
    public void continueButonunaTiklanir() {
        jiraPage.buttonContinue.click();
        ReusableMethods.wait(3);
    }

    @Then("Password textboxinin gorunur ve aktif oldugu dogrulanir")
    public void passwordTextboxininGorunurVeAktifOlduguDogrulanir() {
        jiraPage.verifyDisplayEnabled(jiraPage.textBoxPassword);
    }

    @Then("Password textboxina gecerli {string} bilgisi girilir")
    public void password_textboxina_gecerli_bilgisi_girilir(String password) {
        jiraPage.textBoxPassword.sendKeys(ConfigReader.getProperty(password));
    }

    @Then("Login butonunun gorunur ve aktif oldugu dogrulanir")
    public void login_butonunun_gorunur_ve_aktif_oldugu_dogrulanir() {
        jiraPage.verifyDisplayEnabled(jiraPage.buttonContinue);
    }

    @Then("Login butonu tiklanir")
    public void login_butonu_tiklanir() {
        jiraPage.buttonContinue.click();
        ReusableMethods.wait(2);
    }

    @Then("Uygulamaya giris yapildigi dogrulanir")
    public void uygulamaya_giris_yapildigi_dogrulanir() {
        jiraPage.verifyDisplay(jiraPage.jiraApps);
        ReusableMethods.wait(2);
    }

    @Then("Your apps bolumunde Jira app'ine tiklanir")
    public void your_apps_bolumunde_jira_app_ine_tiklanir() {
        ReusableMethods.wait(3);
        jiraPage.jiraApps.click();
    }

    @Then("Create project butonunun gorunur oldugu dogrulanir")
    public void create_project_butonunun_gorunur_oldugu_dogrulanir() {
        jiraPage.verifyDisplay(jiraPage.optionCreateProject);
    }

    @Then("Create project butonuna tiklanir")
    public void createProjectButonunaTiklanir() {
        jiraPage.optionCreateProject.click();
    }

    @Then("Sol bolumde Project Templates alaninda software development linkinin gorunur oldugu dogrulanir")
    public void sol_bolumde_project_templates_alaninda_software_development_linkinin_gorunur_oldugu_dogrulanir() {
        jiraPage.verifyDisplay(jiraPage.menuSoftwareDevelopment);
    }

    @Then("Software development linkine tiklanir")
    public void software_development_linkine_tiklanir() {
        jiraPage.menuSoftwareDevelopment.click();
    }

    @Then("Scrum'in gorunur oldugu dogrulanir")
    public void scrum_in_gorunur_oldugu_dogrulanir() {
        jiraPage.verifyDisplay(jiraPage.scrum);
    }

    @Then("Scrum'a tiklanir")
    public void scrum_a_tiklanir() {
        jiraPage.scrum.click();
    }

    @Then("Use Template butonuna tiklanir")
    public void use_template_butonuna_tiklanir() {
        jiraPage.buttonUseTemplate.click();
    }

    @Then("Select a team managed butonuna tilanir")
    public void select_a_team_managed_butonuna_tilanir() {
        jiraPage.buttonSelectTeamManaged.click();
        ReusableMethods.wait(2);
    }

    @Then("Name textboxina random bir proje ismi girilir")
    public void name_textboxina_random_bir_proje_ismi_girilir() {
        String projectName = faker.name().firstName();
        ReusableMethods.clickAndSendKeys(jiraPage.textBoxProjectName, projectName);
        ReusableMethods.wait(1);
    }

    @Then("Access dropdownundan limited option secilir")
    public void access_dropdownundan_limited_option_secilir() {
        jiraPage.accessDropdown.click();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
    }

    @Then("Next butonuna tiklanir")
    public void next_butonuna_tiklanir() {
        jiraPage.buttonNext.click();
        ReusableMethods.wait(4);
    }

    @Then("Proje olustugu dogrulanir")
    public void proje_olustugu_dogrulanir() {
        jiraPage.verifyDisplay(jiraPage.textProjectName);
        ReusableMethods.wait(2);
    }

    @Then("Olusturulan proje ismine tiklanir")
    public void olusturulan_proje_ismine_tiklanir() {
        jiraPage.tableProjectName.click();
    }

    @Then("Header bolumunde bulunan create butonuna tiklanir")
    public void header_bolumunde_bulunan_create_butonuna_tiklanir() {
        jiraPage.buttonCreateIssue.click();
    }

    @Then("Zorunlu textboxlara gecerli bilgiler girilerek issue type olusturulur")
    public void zorunlu_textboxlara_gecerli_bilgiler_girilerek_issue_type_olusturulur() {
        jiraPage.textBoxSummary.sendKeys(ConfigReader.getProperty("summary"));
        jiraPage.buttonIssueTypeCreate.click();
    }

    @Then("Sol bolumde Planning altinda bulunan Backlog linkine tiklanir")
    public void sol_bolumde_planning_altinda_bulunan_backlog_linkine_tiklanir() {
            jiraPage.linkBacklog.click();
            ReusableMethods.wait(2);
    }
    @Then("Backlogda olusturulan issue Sprint1'e suruklenir")
    public void backlogda_olusturulan_issue_sprint1_e_suruklenir() {
        actions.dragAndDrop(jiraPage.issueBacklog,jiraPage.areaSprintPlan).perform();
        ReusableMethods.wait(1);
    }
    @Then("Start sprint butonuna tiklanir")
    public void start_sprint_butonuna_tiklanir() {
        jiraPage.buttonStartSprint.click();
        ReusableMethods.wait(2);
    }
    @Then("Start butonuna tiklanir")
    public void start_butonuna_tiklanir() {
        jiraPage.buttonStart.click();
    }

    @Then("Sprintin basladigi dogrulanir")
    public void sprintin_basladigi_dogrulanir() {
        jiraPage.verifyDisplay(jiraPage.textProjectName);
        ReusableMethods.wait(2);
    }

    @Then("Sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.quitDriver();
    }
}
