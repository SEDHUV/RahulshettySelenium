package seleniunm4features;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class multiple_windows_webelement_screenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://rahulshettyacademy.com/#/index");
       Set<String> allwindows =  driver.getWindowHandles();
       Iterator<String> iterator = allwindows.iterator();
        String parentwindow = iterator.next();
        String childwindow = iterator.next();
        driver.switchTo().window(parentwindow);
        Thread.sleep(2000);
        driver.switchTo().window(childwindow);
        JavascriptExecutor executor = (JavascriptExecutor)driver ;
        executor.executeScript("window.scrollBy(0,2700)");
        String coursename = driver.findElement(By.xpath("//a[text()='Learn Postman for API Automation Testing with Javascript']")).getText();
        driver.switchTo().window(parentwindow);
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys(coursename);
       Point loc =  name.getLocation();
       System.out.println(loc.getX());
       System.out.println(name.getRect().getDimension().getHeight());
        File snap = name.getScreenshotAs(OutputType.FILE);
        File na = new File("C:\\Users\\SEDHU\\photo.png");
        FileUtils.copyFile(snap,na);
        Thread.sleep(3000);
        driver.quit();

    }
}
