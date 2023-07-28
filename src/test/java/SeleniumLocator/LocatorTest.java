package SeleniumLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com");

        driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("Rishad");

        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("123456");
        driver.findElement(By.linkText("About Us")).click();

        //xpath
        //class
        //id
        //partialLinkText
        //TagName

        Thread.sleep(2000);
        driver.quit();
    }
}
