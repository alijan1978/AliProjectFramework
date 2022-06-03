package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializers {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication() {

        // Open the browser
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertiesValue("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        // Launching the application and to do so, we need to provide the url (link) of webpage we want to open
        driver.get(ConfigReader.getPropertiesValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        initializePageObject();
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static void sendText(WebElement element, String text) {
        element.sendKeys(text);
    }
}
