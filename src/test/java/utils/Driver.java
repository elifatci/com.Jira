package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Base;

import java.time.Duration;

public class Driver extends Base {

    static WebDriver driver;

    public static WebDriver getDriver() {
        String browser = ConfigReader.getProperty("browser");

        if(driver==null) {
            switch (browser) {
                case "chrome":
                    driver = new ChromeDriver();
                    Base.initialize();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;


            }
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;

    }

    public static void closeDriver(){
        if (driver!=null) {
            driver.close();
            driver=null;
        }
    }

    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }

    }
}


