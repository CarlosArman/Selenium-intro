package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {
    private static WebElement firstName;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo");

        WebElement firstName = driver.findElement(By.name("first_name"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Doe");
        WebElement businessName = driver.findElement(By.name("business_name"));
        businessName.sendKeys("QA Automation");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("jdoe@qa.com");

        WebElement header = driver.findElement(By.tagName("h1"));
        String headerText = header.getText();
        System.out.println(headerText);

        WebElement submit = driver.findElement(By.id("demo"));
        submit.click();


    }
}
