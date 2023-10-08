package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBox.sendKeys("Peru");

        Thread.sleep(3000);

        WebElement btnK = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
        btnK.click();

    }
}
