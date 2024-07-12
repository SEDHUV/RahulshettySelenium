package Javastreams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_filters_matching {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("Potato");
        List<WebElement> results =driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> filtered = results.stream().filter(veggie->veggie.getText().contains("Potato")).collect(Collectors.toList());
        Assert.assertEquals(results.size(),filtered.size());

    }
}
