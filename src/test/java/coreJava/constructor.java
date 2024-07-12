package coreJava;

public class constructor {

    //key points
    //1.if u don't created any constructor it will call default or implicit constructor
   // 2. if u created parametrized constructor and in main class u called default one , it will throw error as you crested parametrized constructor
//    e.g : in class
    public constructor(int a){
        System.out.println(a);
    }
    public constructor(){
    System.out.println("sedhu");
    }

    public static void main(String[] args) {
        constructor c = new constructor(); //it will error as u created parametrized constructor //for this u need to create another constructor default(second constructor created above)
    }
}


