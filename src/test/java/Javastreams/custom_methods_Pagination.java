package Javastreams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class custom_methods_Pagination
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        Thread.sleep(2000);
        List<String> finalprice;
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> originallist =    list.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(originallist.equals(sortedlist));
        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
            finalprice = rows.stream().filter(s -> s.getText().contains("Wheat")).map(s -> getpriceveggie(s)).collect(Collectors.toList());
            finalprice.forEach(p -> System.out.println(p));
            if (finalprice.size() < 1) {
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }
        } while (finalprice.size() < 1);
        Thread.sleep(2000);
        driver.quit();
    }
    public static String getpriceveggie(WebElement a){
        String price = a.findElement(By.xpath("following-sibling::td[1]")).getText();
        return price;

    }
}
