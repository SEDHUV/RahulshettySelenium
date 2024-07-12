package ChromeDevtools;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;

public class printConsoleLogs {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.cssSelector("a[routerlink*='products']")).click();
        driver.findElement(By.linkText("Selenium")).click();
        driver.findElement(By.cssSelector(".add-to-cart")).click();
        driver.findElement(By.partialLinkText("Cart")).click();
        driver.findElement(By.id("exampleInputEmail1")).clear();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");
        LogEntries logs = driver.manage().logs().get(LogType.BROWSER); //creating logentries object
       List<LogEntry> logsList =  logs.getAll();//getting all the logs and stored in list
        for (LogEntry e:logsList) {
            System.out.println(e.getMessage());//using for each method getting individual log message
        }
    }
}