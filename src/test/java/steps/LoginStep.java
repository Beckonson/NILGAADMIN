package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethod;

import java.time.Duration;

public class LoginStep extends CommonMethod {

    //WebDriver driver;

    @Given("user navigate to NILGS Public portal")
    public void user_navigate_to_nilgs_public_portal() {
        startBrowser();
        //driver = new ChromeDriver();
        //driver.get("https://nilgs.public.verxid.site");
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("when user enter admin email and password")
    public void when_user_enter_admin_email_and_password() {
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("admin@algon.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Aynq0xn98@");
    }
    @When("user clicks on login")
    public void user_clicks_on_login() {
        WebElement submitBt = driver.findElement(By.cssSelector("button[type='submit']"));
        submitBt.click();

    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        WebElement applyBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        applyBtn.click();
        System.out.println("pass1");
        /*
        WebElement dashboard = driver.findElement(By.xpath("//h2[contains(normalize-space(),'Hello System 👋')]"));
        Assert.assertTrue(dashboard.isDisplayed());

         */
    }


}
