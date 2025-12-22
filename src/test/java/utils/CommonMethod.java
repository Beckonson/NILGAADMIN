package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;




public class CommonMethod {
    public static WebDriver driver;

    public void startBrowser() {
        driver = new ChromeDriver();
        driver.get("https://nilgs.public.verxid.site");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}

