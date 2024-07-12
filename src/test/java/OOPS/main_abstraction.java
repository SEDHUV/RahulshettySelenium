package OOPS;

public class main_abstraction extends abstraction {

    public static void main(String[] args) {
        main_abstraction main = new main_abstraction();
        main.guide();
        main.measures();
        main.color();

    }



    public void color() {
        System.out.println("color");
    }
    //interface, need to use only public whereas in abstract we can every access modifier except private
    //we cannot able to create object for abstract class(incomplete class)
    //abstract contains non-implement and implement methods whereas interface contains only non-implemented methods.
}
