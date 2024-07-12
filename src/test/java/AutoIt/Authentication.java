package AutoIt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URI;
import java.util.function.Predicate;

public class Authentication {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("http://username:password@url"); syntax for giving authentication url if you give like this selenium will store username and password and use whenever authentication comes
        driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar");
    }
}
