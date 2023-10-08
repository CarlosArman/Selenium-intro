package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("Peru");

        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);

        List<WebElement> btnK = driver.findElements(By.name("btnK"));
        btnK.get(0).click();
    }
}
