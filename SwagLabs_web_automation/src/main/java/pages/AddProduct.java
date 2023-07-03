package pages;

import browserDrivers.LaunchBrowsers;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProduct extends LaunchBrowsers {
    WebDriverWait wait;
    By TestUserName = By.cssSelector("#user-name");
    By TestUserPassword = By.cssSelector("#password");
    By clickOnLoginButton = By.cssSelector("#login-button");
    By GetExpected = By.xpath("//div[@class='inventory_item_name']");
    By GoToCart = By.cssSelector(".shopping_cart_link");
    By AddToCart = By.cssSelector("#add-to-cart-sauce-labs-backpack");

    public AddProduct(WebDriver driver) {
        LaunchBrowsers.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void loginUser() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TestUserName));
        LaunchBrowsers.driver.findElement(TestUserName).sendKeys("standard_user");
        LaunchBrowsers.driver.findElement(TestUserPassword).sendKeys("secret_sauce");
        LaunchBrowsers.driver.findElement(clickOnLoginButton).click();
    }

    public void addToCart() {
        String title = LaunchBrowsers.driver.getTitle();
        System.out.printf(title);
        LaunchBrowsers.driver.findElement(AddToCart).click();
    }

    public void clickOnCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(GoToCart)).click();
    }

    public void getExpected() {
        String expectedText = wait.until(ExpectedConditions.visibilityOfElementLocated(GetExpected)).getText();
        Assert.assertEquals(expectedText, "Sauce Labs Backpack");
        System.out.printf(expectedText);
    }
}