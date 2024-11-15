package Locators.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateUsingAxisWithXPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");

        // locating using "following" axis
        List<WebElement> tableRows = driver.findElements(By.xpath("//tr/following::tr"));
        System.out.println("Number of rows: " + tableRows.size());

        // locating using "child" axis
        // List<WebElement> tableColumns = driver.findElements(By.xpath("//tr/child::th"));
        // System.out.println("Number of columns: " + tableColumns.size());

        // locating using "parent" axis
        WebElement tableRowParent = driver.findElement(By.xpath("//th/parent::tr"));

        // locating using "ancestor" axis
        List<WebElement> tableColumns = driver.findElements(By.xpath("//tbody//ancestor::th"));
        System.out.println("Number of columns: " + tableColumns.size());
        driver.quit();
    }
}
