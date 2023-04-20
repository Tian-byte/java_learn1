package demo2;

import demo1.TestDemo;

/**
 * 多态实现的条件
 * 1.必须在继承的条件下
 * 2.子类必须要对父类中的方法进行重写
 * 3.通过父类的引用调用重写的方法
 */
//组合 ： a part of    has-a 的关系
// 学生和老师 是学校的一部分   学校有学生和老师

class Student{

}

class Teacher {

}

class School {
    //组合 以后使用组合比较多
    public Student[] student;
    public Teacher[] teacher;
}
public class Test extends TestDemo {
    public static void function() {

    }
    public static void function(int a) {

    }
    public static void function(int a,int b) {

    }

    public static void main(String[] args) {
        //编译的时候 根据你传入的参数 能够确定你调用那哥哥方法 这种叫做 静态绑定 
        function();
        function(1);
        function(1,2);
    }
    public void fin2(){
            final int a = 20;
//            a = 100; 错误
        }
        //final 还可以继承方法 密封方法，
    //继承可以看作 is-a 的关系，

    public void test() {
//        TestDemo testDemo = new TestDemo();
//        System.out.println(testDemo.a);
        System.out.println(super.a);

    }

    public static void main1(String[] args) {
        Test test = new Test();
        test.test();
    }

}
