package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class click_addToCart {

    public static void main(String[] args) throws InterruptedException {
        //always use static locators instead of text because if you click button the text may change and from
        //next execution it points 0 from nxt webelement
        WebDriver d = new EdgeDriver();
        WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
        //d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait (globally)
        String[] wantedProducts = {"Cauliflower","Beetroot","Brocolli"};
        d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        d.manage().window().maximize();
        Thread.sleep(2000);
        click_addToCart cart = new click_addToCart();
        cart.addItems(d,wantedProducts);
        d.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
        d.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
         w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
d.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettycademy");
d.findElement(By.className("promoBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
String prmotext = d.findElement(By.xpath("//span[@class='promoInfo']")).getText();
System.out.println(prmotext);
         }
         public void addItems(WebDriver driver,String[] wantedProducts){

             List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
             for (int i =0;i<products.size();i++){
                 String[]  name =  products.get(i).getText().split("-");
                 String trimmed =  name[0].trim();
                 List finalproduct =  Arrays.asList(wantedProducts);
                 int k =0;
                 if(finalproduct.contains(trimmed)){
                     k++;
                     driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
                     if(k==wantedProducts.length)
                         break;;
         }
       }


    }
}
