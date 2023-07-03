package stepDefinitions;

import browserDrivers.LaunchBrowsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Hooks extends LaunchBrowsers {
    static Logger logger = Logger.getLogger(Hooks.class.getName());

    @Before
    public static void beforeAll() throws MalformedURLException {
        logger.info("test execution started");
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver_linux64/chromedriver");
        ChromeOptions cap = new ChromeOptions();
        cap.setCapability("browserVersion", "110.0");
        cap.setCapability("browserName", "chrome");
        cap.setCapability("platformName", "Linux");
        LaunchBrowsers.driver = new RemoteWebDriver(new URL(" http://172.23.0.3:4444/wd/hub"), cap);
        LaunchBrowsers.driver.manage().window().maximize();
        LaunchBrowsers.driver.get(baseURL);
        WebDriverWait wait = new WebDriverWait(LaunchBrowsers.driver, Duration.ofSeconds(50));
        LaunchBrowsers.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @After
    public void afterScenario() {

        logger.info("test execution complete");

    }
}