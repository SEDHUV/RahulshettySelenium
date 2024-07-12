package miscellanous_topics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class ssl_certificate_screenshot {
    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();//delete all cookies
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\SEDHU\\screenshot.png"));
        driver.quit();
        //if you want to delete session key cookie to logout from
        //page
        //driver.manage().deleteCookieNamed("sessionkey");
        //click anything on page
        //it will come to login screen and
        //check url
    }
}
