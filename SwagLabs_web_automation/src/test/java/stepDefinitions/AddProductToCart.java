package stepDefinitions;

import browserDrivers.LaunchBrowsers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AddProductToCart extends LaunchBrowsers {
    WebDriverWait wait = new WebDriverWait(LaunchBrowsers.driver, Duration.ofSeconds(50));

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println();
        LaunchBrowsers.driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        LaunchBrowsers.driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        LaunchBrowsers.driver.findElement(By.cssSelector("#login-button")).click();

    }

    @When("click on add to cart")
    public void click_on_add_to_cart() {
        String title = LaunchBrowsers.driver.getTitle();
        System.out.printf(title);
        LaunchBrowsers.driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        LaunchBrowsers.driver.findElement(By.cssSelector(".shopping_cart_link")).click();


    }

    @Then("product will be add to the cart")
    public void product_will_be_add_to_the_cart() {
        String expectedText = LaunchBrowsers.driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        Assert.assertEquals(expectedText, "Sauce Labs Backpack");
        System.out.printf(expectedText);
    }


}