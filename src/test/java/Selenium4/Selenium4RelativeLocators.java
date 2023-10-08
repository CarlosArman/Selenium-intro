package Selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium4RelativeLocators {
    private static WebDriver element2;

    public static void main(String[] args) throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.google.com/");
        WebElement logoGoogle = driver.findElement(By.className("lnXdpd"));

        WebElement imp = driver.findElement(with(By.tagName("input")).below(logoGoogle));
        imp.sendKeys("USA");

        WebDriver element = driver.switchTo().newWindow(WindowType.TAB);
        element.get("https://www.bing.com/");

        WebDriver element2 = driver.switchTo().newWindow(WindowType.WINDOW);
        element2.get("https://www.yahoo.com/");
        driver.quit();

    }
}
