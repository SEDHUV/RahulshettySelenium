package OOPS;

import org.testng.annotations.Test;

public class mainclass extends Inheritance{

    @Test
    public void child(){
        test();
        System.out.println(a);
        increment inc = new increment();
      System.out.println(inc.increase(4));
      increment2 inc2 = new increment2(6);
      int value = inc2.increase();
      System.out.println(value);
     System.out.println(inc2.multiplyby2());

    }
}
