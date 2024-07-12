package Javastreams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class streams_filters {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("p");
     List<WebElement>  results =driver.findElements(By.xpath("//tr/td[1]"));
     results.stream().map(s->getprice(s)).forEach(p->System.out.println(p));
     results.stream().map(d->getdiscount(d)).forEach(q->System.out.println(q));
driver.quit();

    }
    public static String getprice(WebElement a){
      String prize = a.findElement(By.xpath("following-sibling::td[1]")).getText();
        return prize;
    }
    public static String getdiscount(WebElement a){
        String prize = a.findElement(By.xpath("following-sibling::td[2]")).getText();
        return prize;
    }
}
