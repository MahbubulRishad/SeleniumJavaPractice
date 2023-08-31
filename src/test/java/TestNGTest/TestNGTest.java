package TestNGTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNGTest extends BaseTest {
    @Test(priority = 1)
    public void VerifyLoginPainIsAvailable() {

        String loginText = driver.findElement(By.cssSelector("#leftPanel h2"))
                .getText().trim();
        Assert.assertEquals(loginText, "Customer Login");
    }

    @Test(priority = 2)
    public void VerifyAboutUsLinkWorkable() {
        WebElement aboutUsEl = driver.findElement(By.linkText("About Us"));
        aboutUsEl.isDisplayed();
        aboutUsEl.click();

//        String paraSoftDemoWebsiteText = driver.findElement(By.cssSelector
//                ("#rightPanel .title")).getText().trim();
//
//        Assert.assertEquals(paraSoftDemoWebsiteText, "ParaSoft Demo Website");
        Assert.assertTrue(driver.getPageSource().contains("888-305-0041"));
    }

    @Test(priority = 0)
    public void VerifyRegisterLink(){
        WebElement registerlink = driver.findElement(By.linkText("Register"));
        registerlink.isDisplayed();
        registerlink.click();

        String registerText = driver.findElement(By.cssSelector("#rightPanel .title"))
                .getText().trim();
        Assert.assertEquals(registerText, "Signing up is easy!");
    }
}
