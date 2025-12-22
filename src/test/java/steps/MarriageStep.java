package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethod;

public class MarriageStep extends CommonMethod {
    @When("User clicks on new application button")
    public void user_clicks_on_new_application_button() {
        driver.findElement(By.id("radix-:r8:")).click();
    }
    @When("user select marriage certificate")
    public void user_select_marriage_certificate() {
        WebElement mrg = driver.findElement(By.xpath("//span[normalize-space()='Marriage Certificate']"));
        mrg.click();
        //Select sel = new Select(mrg);
        //sel.deselectByVisibleText("Marriage Certificate");
        //sel.selectByVisibleText("Marriage Certificate");

        //System.out.println("my test passed");
    }
    @When("Clicks on new application")
    public void clicks_on_new_application() {
        WebElement newmrg = driver.findElement(By.xpath("//span[normalize-space()='New Application']"));
        newmrg.click();
    }
    @When("Check terms and condition")
    public void check_terms_and_condition() {
        driver.findElement(By.cssSelector("#terms")).click();
    }
    @Then("Click on start application button")
    public void click_on_start_application_button() {
        driver.findElement(By.xpath("//button[normalize-space()='Start Application']")).click();
    }
    @Then("Check Accepts consent")
    public void check_accepts_consent() {
        driver.findElement(By.cssSelector("#terms")).click();

    }
    @Then("validate marriage certificate application page")
    public void validate_marriage_certificate_application_page() {
        //driver.findElement(By.xpath("//button[contains(normalize-space(),'Start Application')]")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).isEnabled();
        WebElement marriage = driver.findElement(By.xpath("//h2[normalize-space()='Marriage Certificate']"));
        Assert.assertTrue(marriage.isDisplayed());
    }
    @When("user select state to marry at")
    public void user_select_state_to_marry_at() {
        WebElement stateMrg = driver.findElement(By.cssSelector("div.relative > div.flex > svg"));
        stateMrg.click();
        Select sel = new Select(stateMrg);
        sel.selectByVisibleText("ABIA");

    }

    @When("Select LGA to marry at")
    public void select_lga_to_marry_at() {
        System.out.println("pend test");
    }

    @When("Enter partner’s email address")
    public void enter_partner_s_email_address() {
        System.out.println("pend test");
    }

    @When("Provides valid email")
    public void provides_valid_email() {
        System.out.println("pend test");
    }

    @Then("permform search")
    public void permform_search() {
        System.out.println("pend test");
    }
}
