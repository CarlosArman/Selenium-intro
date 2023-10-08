package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CssSelectorExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.cssSelector("textarea.gLFyf"));
        searchBox.sendKeys("Peru");

        Thread.sleep(3000);

        List<WebElement> btnK = driver.findElements(By.cssSelector("input.gNO89b"));
        btnK.get(0).click();

        driver.quit();

    }
}
