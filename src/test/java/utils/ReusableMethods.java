package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import pages.Base;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

import static org.junit.Assert.assertTrue;

public class ReusableMethods extends Base {


    public static void clickAndSendKeys(WebElement element,String text){
        element.click();
        element.sendKeys(text);
        wait(2);
    }

    public static void wait(int secs) {

        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verifyDisplay(WebElement element){
        assertTrue(element.isDisplayed());

    }

    public static void verifyDisplayEnabled(WebElement element){
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());

    }




}
