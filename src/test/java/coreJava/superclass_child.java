package coreJava;

public class superclass_child extends superclass_parent {

    public superclass_child(){
        super();
        System.out.println("child class constructor");
    }
    String name = "pavazha nagar";
    public void getData(){
        super.getData();
       System.out.println(super.name);
        System.out.println(name);
        System.out.println("child method");
    }

    public static void main(String[] args) {
        superclass_child sc = new superclass_child();
        sc.getData();
    }
}
