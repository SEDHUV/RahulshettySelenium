package OOPS;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Inheritance {
int a =8;
     @BeforeMethod
    public void bf(){
         System.out.println("run me first");
     }

     @AfterMethod
    public void af(){

         System.out.println("run me after method");
     }

     public void test(){

         System.out.println("parent class test");
     }


}
