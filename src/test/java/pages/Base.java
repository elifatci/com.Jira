package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public abstract class Base {

    public Base() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static JiraPage jiraPage;
    public static Actions actions;
    public static Faker faker;


    public static void initialize() {
        jiraPage = new JiraPage();
        actions = new Actions(Driver.getDriver());
        faker = new Faker();

    }
}
