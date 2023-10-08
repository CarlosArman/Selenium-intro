package Examples;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.className("gLFyf"));
        element.sendKeys("Peru");


    }
}
