package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowhandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector(".blinkingText")).click();
       Set<String> windows =  driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
       String parentwindow =  it.next();
       String childwindow = it.next();
       System.out.println(driver.switchTo().window(childwindow).getTitle());
       String pass = driver.findElement(By.cssSelector(".im-para.red")).getText();
       System.out.println(pass);
      String splitted =  pass.split("@")[1].split(".com")[0];
      System.out.println(splitted);
      driver.switchTo().window(parentwindow);
      driver.findElement(By.id("username")).sendKeys(splitted);
    }
}
