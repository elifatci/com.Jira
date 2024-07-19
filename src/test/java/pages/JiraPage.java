package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class JiraPage extends Base {

    @FindBy(css = "[id=username]")
    public WebElement textBoxEmail;
    @FindBy(css = "[id=login-submit]")
    public WebElement buttonContinue;
    @FindBy(css = "#password")
    public WebElement textBoxPassword;
    @FindBy(xpath = "//a[@href='https://id.atlassian.com/login?login_hint=xaxon89615%40neixos.com&prompt=none&continue=https%3A%2F%2Fneixos-team-q5hqznn1.atlassian.net/secure/BrowseProjects.jspa?selectedProjectType=software']")
    public WebElement tableYourApps;
    @FindBy(xpath = "//*[text()='Jira']")
    public WebElement jiraApps;
    @FindBy(xpath = "(//*[@class='sc-jBoNkH hgMvhs'])[1]")
    public WebElement dropdownProjects;
    @FindBy(xpath = "(//*[text()='Create project'])[1]")
    public WebElement optionCreateProject;
    @FindBy(xpath = "//*[@title='Category navigation']/button[2]")
    public WebElement menuSoftwareDevelopment;
    @FindBy(xpath = "(//*[@aria-label='Scrum'])[1]")
    public WebElement scrum;
    @FindBy(xpath = "(//*[text()='Use template'])[1]")
    public WebElement buttonUseTemplate;
    @FindBy(xpath = "(//*[@class='css-178ag6o'])[36]")
    public WebElement buttonSelectTeamManaged;
    @FindBy(xpath = "//*[@name='project-name']")
    public WebElement textBoxProjectName;
    @FindBy(xpath = "//*[@data-testid='project-create.create-form.create-screen.submit-button']")
    public WebElement buttonNext;
    @FindBy(css = ".project-access__value-container.css-66zdpf")
    public WebElement accessDropdown;
    @FindBy(className = "css-1p15jwl")
    public WebElement textProjectName;
    @FindBy(xpath = "//tr[1]/td[2]")
    public WebElement tableProjectName;
    @FindBy(css="#createGlobalItem")
    public WebElement buttonCreateIssue;

    @FindBy(xpath = "//*[@name='summary']")
    public WebElement textBoxSummary;
    @FindBy(xpath = "(//*[text()='Create'])[2]")
    public WebElement buttonIssueTypeCreate;
    @FindBy(xpath = "//*[text()='Backlog']")
    public WebElement linkBacklog;
    @FindBy(xpath = "//*[@data-testid='software-backlog.card-list.card.card-contents.interaction-layer.accessible-card']")
    public WebElement issueBacklog;
    @FindBy(xpath = "//*[@data-test-id='software-backlog.card-list.empty-card-list']")
    public WebElement areaSprintPlan;
    @FindBy(xpath = "//*[text()='Start sprint']")
    public WebElement buttonStartSprint;
    @FindBy(xpath = "//*[text()='Start']")
    public WebElement buttonStart;

}
