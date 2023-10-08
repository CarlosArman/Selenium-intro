package Selenium4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Selenium4Demo {
    public static void main(String[] args) throws IOException {

        // Chrome

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.google.com/");
        WebElement logoGoogle = driver.findElement(By.className("lnXdpd"));
        File screem = logoGoogle.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screem, new File("google.png"));
        driver.close();

        // Edge

       WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.navigate().to("https://www.bing.com/");
        edgeDriver.manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);
        WebElement logoBing = edgeDriver.findElement(By.cssSelector("svg#bLogo.logo"));

        File screembing = logoBing.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screembing, new File("Bing.png"));
        edgeDriver.close();

    }
}
