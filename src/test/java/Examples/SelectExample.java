package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://computer-database.gatling.io/computers/new");

        WebElement company = driver.findElement(By.id("company"));
        Select companySelect= new Select(company);
        //companySelect.selectByValue("2");
        //companySelect.selectByIndex(3);
        companySelect.selectByVisibleText("IBM");
    }
}
