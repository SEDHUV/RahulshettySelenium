package AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class demo {
    public static void main(String[] args) throws InterruptedException, IOException {
         String downloadpath = System.getProperty("user.dir");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadpath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/pdf_to_jpg");
        driver.findElement(By.id("pickfiles")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\SEDHU\\OneDrive - Capgemini\\Documents\\Rahul_shetty_selenium\\UploadFileAutoIT.exe");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTaskTextBtn")));
        driver.findElement(By.id("processTaskTextBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles")));
        driver.findElement(By.id("pickfiles")).click();
        File file = new File(downloadpath+"/inv_12190_page-0001.jpg");
        Thread.sleep(3000);
        if(file.exists()){
            System.out.println("file present");
            if(file.delete()){
                System.out.println("file deleted");
            }
        }else
            System.out.println("file not present");

    }
}
