package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilitiesDemo {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");

    }
}
