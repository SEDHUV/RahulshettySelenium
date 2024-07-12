package Javastreams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Sorting_webtable_javastreams {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
     List<String> originallist =    list.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(originallist.equals(sortedlist));
        driver.quit();
    }
}
