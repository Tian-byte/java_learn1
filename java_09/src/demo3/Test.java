package demo3;

/**
 * @author tian
 */

/**
 * 接口：
 * 1.使用interface 来修饰接口
 * 2.接口当中的成员方法，不能有具体的的实现
 *  1. 抽象方法，默认是 public abstract 的方法
 *  2. jdk 1.8开始允许有实现的方法，但是这个方法只能由 default 修饰的
 *  3. 可以实现一个静态方法，所有方法默认是 public
 * 3.成员变量默认是 public static final 修饰的
 * 4.接口不能被实例化.
 * 5.类和接口之间采用 implements 来实现多个接口。 通过，
 * 6.子类重写抽象方法，必须加上public。
 * 7.接口中不能有静态代码块和构造方法
 * 8.如果你不想实现接口的方法，那么就把接口这个类定义为抽象类。但是如果这个类被其他类继承，那么必须重写
 * 9。一个类可以实现多个接口。使用implements 用逗号隔开。【可以解决多继承的问题】
 */
interface  IText{
    public static final int size = 10;


    public abstract void draw();
    default public void func(){

        System.out.println("默认方法！");
    }
    public static void func2() {
        System.out.println("alkF");
    }
}


 class A implements IText {
     @Override
     public void draw() {
         System.out.println("这个方法的重写，是必须的");
     }

     @Override
     public void func() {
         System.out.println("这个方法的重写是可选择的！");
     }
 }

public class Test {
    public static void main(String[] args) {
//        IShape iShape = new IShape();
    }
}
