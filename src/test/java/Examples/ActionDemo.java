package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/howto/howto_js_draggable.asp");

        WebElement draggale = driver.findElement(By.xpath("//*[@id='mydivheader']"));

        Actions builder = new Actions(driver);
        Action action =builder.dragAndDropBy(draggale,100,0).build();
        action.perform();


    }
}
