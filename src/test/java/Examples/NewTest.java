package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class NewTest {

    @Test (groups = {"google"}, priority = 1)
    public void f() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");


        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.className("gLFyf"));
        element.sendKeys("Peru");
        driver.quit();
    }

    @Test(groups = {"yahoo"},priority = 2)
    public void d() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.yahoo.com");

        driver.quit();
    }
}
