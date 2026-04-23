package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.CommonMethod;

public class ValidloginStep extends CommonMethod {
    @Given("user navigate TO nilgs portal")
    public void user_navigate_to_nilgs_portal() {
        startBrowser();
    }
    @When("user clicks on loginbutoon")
    public void user_clicks_on_loginbutoon() {
       WebElement login1 = driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]"));
       login1.click();
    }
    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
        WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
        email.sendKeys("admin@algon.com");
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("Aynq0xn98@");
        WebElement submitBt = driver.findElement(By.cssSelector("button[type='submit']"));
        submitBt.click();
        WebElement dashb = getwait().until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/dashboard']")));
        Assert.assertTrue(dashb.isDisplayed());
        dashb.click();



    }
    @Then("user is successfully logged to begin application")
    public void user_is_successfully_logged_to_begin_application() {
        System.out.println(" code pending");
        WebElement applyBtn = driver.findElement(By.xpath("//span[normalize-space()='Applications']"));
        applyBtn.click();
    }
}
