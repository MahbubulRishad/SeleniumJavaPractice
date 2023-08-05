package SelectDropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // select from drop-down
        Select select = new Select(driver.findElement(By.cssSelector("[name = 'country']")));

        select.selectByIndex(8);
        select.selectByValue("BANGLADESH");
        select.selectByVisibleText("CROATIA");

        // print all the options in the drop-down
        int countryCount = 0;
        for (WebElement element : select.getOptions()){
            System.out.println(element.getText());
            countryCount++;
        }
        System.out.println(countryCount - 1);

        Thread.sleep(2000);
        driver.quit();
    }
}
