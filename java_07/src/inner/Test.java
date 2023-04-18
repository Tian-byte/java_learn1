package inner;

class OuterClass{
    public int data1 = 1;
    public int data2 = 2;
    public static int  data3 = 3;
//    public void test(){
//        System.out.println("OuterClass::test()");
//    }
    /**
     * 实例内部类，或非静态内部类
     * 1. 如何获取实例内部类对象
     * OuterClass.InnerClass  innerClass = outerClass.new InnerClass();
     * 2. 实例内部内不能够有静态成员变量  static 属于内的成员，内加载的时候才执行
     *  如果非要定义 那么只能是被static final 修饰的
     *  3. 在实例内部类当中，如何访问外部类，相同的成员变量？
     *      在实例内部类当中获取外部类的this：OuterClass.this.data1;
     *
     */
    class InnerClass {
        public int data1 = 111;
        public int data4 = 4;
        int data5 = 5;
        //public static int data6;   error
        public static  final int data6 = 6;  //final 是常量的意思
        public void func() {
            System.out.println("InnerClass::func()");
            System.out.println(OuterClass.this.data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);

        }
    }
    public void test(){
        //外部类当中，不能直接访问实例内部类当中的成员，如果要访问必须先创建内部类的对象
        System.out.println("OuterClass::test()");
        final int SIZE = 10; //定义常量 一般定义常量写为大写  常量是在程序编译的时候 确定的，
        //一但初始化就不能够在修改了
    }
}

public class Test {
    public static void main(String[] args) {
        //实例内部类对象的必在先有外部类的前提下才能创建
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass  innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
    public static void main1(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass  innerClass = outerClass.new InnerClass();
        OuterClass.InnerClass innerClass1 = new OuterClass().new InnerClass();
    }

}
