package SeleniumWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        //click operation
        driver.findElement(By.cssSelector(".Solutions")).click();
        System.out.println("Solutions is clicked");

        // get text
        System.out.println(driver.findElement(By.linkText("Locations")).getText());

        // send keys and clear method
        driver.findElement(By.cssSelector("[name = 'username']"))
                .sendKeys("Rishad");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[name = 'username']")).clear();

        System.out.println(driver.findElement(By.linkText("Locations"))
                .getAttribute("href"));


        Thread.sleep(2000);
        driver.quit();
    }
}
