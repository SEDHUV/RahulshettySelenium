import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class histosonics {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://serviceportal-test-ncus-histosonics.azurewebsites.net/");
        System.out.println(driver.getTitle());
        WebElement ele = driver.findElement(By.xpath("(//div[@class='table'])[1]"));
        Actions actions = new Actions(driver);
        boolean boo = ele.isDisplayed();
        System.out.println(boo);

    }
}
