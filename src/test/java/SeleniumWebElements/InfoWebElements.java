package SeleniumWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InfoWebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("Displayed:" + driver.findElement
                (By.cssSelector(".rct-text")).isDisplayed());

        System.out.println("Selected:" + driver.findElement
                (By.cssSelector(".rct-text")).isSelected());

        System.out.println("Enabled:" + driver.findElement
                (By.cssSelector(".rct-text")).isEnabled());

        //Get tag name
        System.out.println("Tag name: " + driver.findElement
                (By.cssSelector("[for = 'tree-node-home']")).getTagName());

        //Get Css Value
        System.out.println("Font-Size: " + driver.findElement
                        (By.cssSelector("[for = 'tree-node-home']"))
                .getCssValue("font-size"));

        driver.findElement(By.cssSelector("[for = 'tree-node-home']")).click();

        System.out.println("Selected:" + driver.findElement
                (By.cssSelector("[for = 'tree-node-home']")).isSelected());


        Thread.sleep(2000);
        driver.quit();
    }
}
