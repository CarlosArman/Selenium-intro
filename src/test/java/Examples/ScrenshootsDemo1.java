package Examples;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScrenshootsDemo1 {
    public static void main(String[] args)  throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

     /*   WebElement element = driver.findElement(By.className("gLFyf"));
        element.sendKeys("Peru");*/


        TakesScreenshot src =(TakesScreenshot) driver;
        File src1 = src.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1, new File("src/test/resources/Screenshoots/result.png"));

        driver.quit();

    }
}
