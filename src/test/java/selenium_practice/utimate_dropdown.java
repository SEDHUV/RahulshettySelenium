package selenium_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utimate_dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        int i =1;
        while (i<7){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
//        for (int j=1;j<7;j++){
//            driver.findElement(By.id("hrefIncAdt")).click();
//        }

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("btnclosepaxoption")).click();
    }
}
