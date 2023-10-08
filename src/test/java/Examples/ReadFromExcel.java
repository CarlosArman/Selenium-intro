package Examples;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ReadFromExcel {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.className("gLFyf"));

        File file =new File("src/test/resources/Data/input.xlsx");
        FileInputStream fis = new FileInputStream(file);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Hoja1");

        Row row = sheet.getRow(0);
        String value = row.getCell(0).getStringCellValue();
        searchBox.sendKeys(value);


    }
}
