package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Link_count {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //used to find out all the links in the entire webpage
        System.out.println(driver.findElements(By.tagName("a")).size());
        //used to find links count in footer page
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));//limiting driver to a certain portion in entire page
        System.out.println(footerdriver.findElements(By.cssSelector("a")).size());
        //used to get links in column wise
        WebElement columndriver = driver.findElement(By.cssSelector("tbody tr td:nth-child(2) ul"));//limited webdriver scope to column level
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        //clicking each link
        List<WebElement> links = columndriver.findElements(By.tagName("a"));
       for (int i=1;i<links.size();i++){
          String clickonmLinktab =  Keys.chord(Keys.CONTROL,Keys.ENTER);
          links.get(i).sendKeys(clickonmLinktab);
          Thread.sleep(3000);
       }
       Set<String> opened_win= driver.getWindowHandles();
       Iterator<String> it = opened_win.iterator();
       while (it.hasNext()){
           driver.switchTo().window(it.next());
           System.out.println(driver.getTitle());
       }
        driver.quit();
    }
}
