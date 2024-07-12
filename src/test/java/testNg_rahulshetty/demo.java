package testNg_rahulshetty;

import org.testng.annotations.*;

public class demo {
    @Test (groups={"smoke"})      //(enabled = false)//used to skip the testcase
    public void demo(){

        System.out.println("sedhu");
    }
@Test
    public void demo2(){

        System.out.println("second");
    }
    @Test(dependsOnMethods = "demo")
    public void demo3(){

        System.out.println("Third");
    }
    @Test(timeOut = 4000)//used to make method wait until 4 seconds
    public void d(){

        System.out.println("Thirde");
    }
@Test
    public void other(){

        System.out.println("Thir");
    }

    @BeforeMethod
    public void bfmethod(){

        System.out.println("before method i will be executed");
    }
    @AfterMethod
    public void afmethod(){

        System.out.println("after method i will be executed");
    }
    @BeforeTest
    public void before(){
        System.out.println("I will execute first");
    }

    @AfterTest
    public void After(){
        System.out.println("I will execute last");
    }
    //before test and after test will be within scope of the test suite
    //in xml file, if you created one suite and added many classes
    // in one class you declared beforetest and after test
    //it will first execute before class then all testcase and at last afterclass
}
