package inner;

class OuterClass2{
    public int data1 = 1;
    int data2 = 2;
    public static int data3 = 3;

    public void test(){
        System.out.println("out::test()");

    }

    /**
     * 1. 如何获取静态内部类对象？
     *  OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
     * 2. 静态内部类当中不能访问外部类的非静态成员，外部类的非静态成员，需要通过外部类的引用才能访问
     *
     *
     */
    static class InnerClass2 {
        //静态内部内中是什么都可以定义
        public int data4 = 4;
        int data5 = 5;
        public static int data6 = 6;

        public void func(){
            System.out.println("out::test()");
            //data1与data2 是非静态的
            OuterClass2 outerClass2 = new OuterClass2();
            System.out.println(outerClass2.data1);
//            System.out.println(data1);
            System.out.println(outerClass2.data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }
    }



}
class Person {
    public int age  = 18;
    public String name = "bit";

    public void show(){
        System.out.println("姓名:"+name+"年龄:"+age);
    }
    // 注解 java 中的注解很多
    @Override  //帮你检查 你重新写的 对不对 充当检查的作用
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Test2 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.show();
        System.out.println(person);
    }


    public static void main2(String[] args) {
        Person person = new Person();
        System.out.println(person.age);
        System.out.println(person.name);


        System.out.println(new Person().age);
        System.out.println(new Person().name);
        new OuterClass2();  //new 一个对象，匿名对象只能使用一次，每次使用的时候必须new

        //匿名内部类
        new Person(){

        };
        //学完接口在来看
    }



    public void func(){
        //局部内部类；
        /**
         * 局部内部类只能在所定义的方法内部使用
         * 不能被public static 等修饰符修饰
         * 编译器也有自己独立的字节码文件，命名格式：外部类名字$数字内部类名字.class
         */
        class Inner {
            public void test() {
                System.out.println("adasdadalkdj");
            }
        }
        Inner inner = new Inner();
        inner.test();
    }

    public static void main1(String[] args) {
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
    }

}
