package Interface;

public class main implements interface1,interface2{

    public static void main(String[] args) {
        interface1 it1 = new main();
        main m = new main();
        interface2 it2 = new main();
        //it1 accepts only interface1 implement methods
        it1.a();
        it1.b();
        //it2 accepts only interface2 implement methods
        it2.c();
        //m accepts all  methods inside main class
        m.a();
        m.b();
        m.c();
        m.d();

        //same concept like webdriver
        //webdriver is interface and classes like chrome, edge, firefox using that interface
        //Webdriver driver = new chromedriver();->in this we can only use webdriver implemented methods
        //Chromedriver driver = new Chromedriver();->in this we can use all chomedriver methods and webdriver methods (same for other classes)




    }



    public void a() {
        System.out.println("a");}


    public void b() {
        System.out.println("b");
    }
    public void d() {
        System.out.println("d");
    }


    public void c() {
        System.out.println("c");
    }
}
