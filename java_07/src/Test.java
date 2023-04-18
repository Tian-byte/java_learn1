class A {
    public static  void hello(){
        System.out.println("hello");
    }
}

public class Test {
    private static int x = 100;

    public static void main(String[] args) {
        Test hs1 = new Test();
        hs1.x++;  // 一般建议使用类名访问，使用hs1 来访问不会报错，但会出现警告
        Test hs2 = new Test();
        hs2.x++;
        hs1 = new Test();
        hs1.x++;
        Test.x--;
        System.out.println("x=" +x);
    }
    static boolean fly;
//    public int aMenthod() {
//       // static int i = 0;  static 修饰类的变量或类的方法，而不是方法的局部变量
//      //  i++;
//        return i;
//    }
    public static void main4(String[] args) {
        System.out.println(Test.fly);
        //在同一个类中，如果不在同一个类中，通过；类名来访问
    }
//    public static void main3(String[] args) {
//        Test test = new Test();
//        test.aMenthod();
//        int j = test.aMenthod();
//        System.out.println(j);
//    }
    public static void main2(String[] args) {
        A a = null;  // 表示a 这个指针不指向任何对象
        // 为静态的 并且不依赖于对象，所以A和a都可以调用hello方法
        A.hello();
        a.hello();
    }
    public static void main1(String[] args) {
        String s; //局部变量，必须初始化
//        System.out.println("s=" + s);
    }
}
