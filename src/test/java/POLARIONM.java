import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class POLARIONM {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(65));
        driver.get("https://polarion.hrc.corp/polarion/#/project/Discovery/workitems/softwaretestcase?query=NOT%20HAS_VALUE%3Aresolution%20AND%20(4435)");
    driver.findElement(By.id("j_username")).sendKeys("sedhus");
    driver.findElement(By.id("j_password")).sendKeys("Qdg45kn(*^%^)%");
    driver.findElement(By.id("submitButton")).click();
    String text = driver.findElement(By.xpath("(//span[@style='overflow-wrap: anywhere'])[1]")).getText();
    System.out.println(text);
    driver.quit();


    }
}
