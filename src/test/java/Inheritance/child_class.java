package Inheritance;

public class child_class extends parent_class {
     String name = "hema";

    public static void main(String[] args) {
       child_class cc = new child_class();
       cc.mtdA();
       cc.mtdC();
       cc.mtdB();
    }

    public void mtdC(){
        System.out.println(super.name);
    }

}
