package demo1;

//public class TestDemo2 {
//    public static void main(String[] args) {
//        TestDemo  testDemo = new TestDemo();
//        System.out.println(testDemo.a);
//    }
//
//}
class Base {
    public Base(String s){
        System.out.print("B");
    }
}
public class Derived extends Base {
public Derived (String s) {
    super(s);
    System.out.print("D");
}

    public static void main(String[] args) {
        new Derived("c");
    }
}