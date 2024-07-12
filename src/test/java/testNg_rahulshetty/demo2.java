package testNg_rahulshetty;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo2 {
//@Parameters({"url","url1"})
    @Test(enabled = false)
    public void ademo32(String username,String password){

        System.out.println(username);
        System.out.println(password);
    }
    @Test(dataProvider = "data")
    public void datacatcher(String username , String password){
        Assert.assertTrue(false);
    System.out.println(username);
    System.out.println(password);


    }

    @DataProvider
    public Object[][] data(){

    Object[][] data = new Object[2][2];
        data[0][0]="firstusername";
        data[0][1]="pword";
        data[1][0]="secondusername";
        data[1][1]="pword2";
        return data;
    }
}
