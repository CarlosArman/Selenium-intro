package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.pe/");

       /*WebElement image = driver.findElement(By.linkText("Imágenes"));
       image.click();*/

        WebElement image2 = driver.findElement(By.partialLinkText("genes"));
        image2.click();
    }
}
