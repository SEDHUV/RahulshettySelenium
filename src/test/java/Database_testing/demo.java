package Database_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class demo {
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";
       Connection con  =  DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/haema","root","Sedhu@14");
       Statement s = con.createStatement();
       ResultSet r = s.executeQuery("select * from employeeinfo where name ='sedhu'");
       while (r.next()) {
           System.out.println(r.getString("location"));
       
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.saucedemo.com/v1/");
           driver.findElement(By.id("user-name")).sendKeys(r.getString("location"));
       }
    }
}
