package steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utils.CommonMethod;

public class IndigenizationAppySteps extends CommonMethod {

    @When("user click on new application button")
    public void user_click_on_new_application_button() {
        driver.findElement(By.id("radix-:r8:")).click();
    }
    @When("select indigization Certificate")
    public void select_indigization_certificate() {
        driver.findElement(By.xpath("//span[normalize-space()='Indigenisation Certificate']")).click();
    }
    @When("Accepts terms and conidition")
    public void accepts_terms_and_conidition() {
        driver.findElement(By.cssSelector("#terms")).click();

    }
    @When("Clicks on starts application button")
    public void clicks_on_starts_application_button() {
        driver.findElement(By.cssSelector("div > div.mt-8 > button.inline-flex")).click();
        driver.findElement(By.cssSelector("#terms")).click();
        driver.findElement(By.cssSelector("div > div.mt-8 > button.inline-flex")).click();


    }

}
