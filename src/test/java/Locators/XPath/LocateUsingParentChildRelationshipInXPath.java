package Locators.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateUsingParentChildRelationshipInXPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        // direct child relationship
        List<WebElement> tableRows = driver.findElements(By.xpath("//tbody/tr"));
        System.out.println("Number of rows: " + tableRows.size());
        // descendant relationship
        List<WebElement> tableColumns = driver.findElements(By.xpath("//tbody//th"));
        System.out.println("Number of columns: " + tableColumns.size());
        driver.quit();
    }
}
