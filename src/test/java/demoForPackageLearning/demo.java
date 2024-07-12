package demoForPackageLearning;

import coreJava.packageA;
import coreJava.public_private;


public class demo extends public_private {

    public static void main(String[] args) {
        packageA pa = new packageA();//we can create object for packageA in demo class by importing package name if both class lies in diffrent package
        pa.abc();

        //java.lang - contains all basic classes which we need to execute java code and it won't be visible in class bcoz it is default package
        //java.util - contains collections(array etc)
        //java.io - contains file reading writing operations)

        public_private pp = new public_private();
        pp.sh();
        int r =pp.i;
        System.out.print(r);
        demo d = new demo();
        d.Protected();//we can use as we inherits public_private eventhough it is outside of package
//        pp.abc(); (it will throw error as the method abc is in default modifier not public)

    }
}
