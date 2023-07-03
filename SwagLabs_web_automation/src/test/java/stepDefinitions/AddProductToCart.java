package stepDefinitions;

import browserDrivers.LaunchBrowsers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddProduct;

import java.time.Duration;

public class AddProductToCart extends LaunchBrowsers {
    WebDriverWait wait = new WebDriverWait(LaunchBrowsers.driver, Duration.ofSeconds(50));

    AddProduct User = new AddProduct(driver);

    @Given("I am on login page")
    public void i_am_on_login_page() {
        User.loginUser();
    }

    @When("click on add to cart")
    public void click_on_add_to_cart() {
        User.addToCart();
    }

    @Then("product will be add to the cart")
    public void product_will_be_add_to_the_cart() {
        User.clickOnCart();
        User.getExpected();
    }


}