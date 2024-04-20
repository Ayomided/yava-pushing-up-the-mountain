package others;

public class Q1 {
    static <T> void f(Object o) {
        System.out.println("f(Object)");
    }
    static void f(String s) {
        System.out.println("f(String)");
    }
    static <T extends String> void g(T t) {
        f(t);
    }
    public static void main(String... args) {
        g("String");
    }
//    abstract class Animal { abstract int legs(); }
//    class Bison extends Animal { int legs() { return 4; } }
//    void process(Animal[] animals) {
//        System.out.println(animals[0].legs());
//    }
//    void method() {
//        Bison[] bison= new Bison[]{new Bison()};
//        process(bison);
//        Bison b = bison[0];
//        Animal[] animals = new Animal[]{new Bison()};
//        process(animals);
//    }

//    public static void main(String[] args) {
//        others.Q1 q = new others.Q1();
//        q.method();
//    }
}