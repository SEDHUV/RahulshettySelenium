package coreJava;

public class packageB {


    public static void main(String[] args) {
        packageA pa = new packageA();//we can create object for packageA in packageB without importing package name if both class belongs to same package
        pa.abc();

    }
}
