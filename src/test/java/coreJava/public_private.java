package coreJava;

public class public_private {


    public int i =9;
    void abc(){ //default access modifier (not possible to access outside of this package eventhough if u import this package.class)
        System.out.println("hello");
    }

    public void sh(){ //public access modifier (possible to access outside of this class by importing package.classname)everywhere it is accessible
        System.out.println("sedhuHaema");
    }

    private void Private(){ //private access modifier (not possible to access outside of this class itself)
        System.out.println("sedhuHaema_private");
    }

    protected void Protected(){ //protected access modifier (can only access by inheriting this class)(access only to subclass)(this one similar to public but one point extra ->need to inheri this class)
        System.out.println("sedhuHaema_private");
    }

}
