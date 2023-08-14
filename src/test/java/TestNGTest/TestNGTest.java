package TestNGTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNGTest {
    @Test
    public void VerifyLoginPainIsAvailable(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String loginText = driver.findElement(By.cssSelector("#leftPanel h2"))
                .getText().trim();
        Assert.assertEquals(loginText, "Customer Login");
        driver.quit();
    }
}
