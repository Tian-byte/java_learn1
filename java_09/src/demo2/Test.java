package demo2;

abstract class Shape{
    /**
     * 1.抽象类 使用abstract 修饰类。
     * 2.抽象类当中可以包含普通类所能包含的成员。
     * 3.抽象类和普通类不一样的是，抽象类当中可以包含抽象方法
     * 4.抽象发法是使用abstract 修饰的。这个方法没有具体的实现
     * 5.不能实例化抽象类 不能new
     * 6.抽象类存在的最大意义 就是被继承
     * 7.如果一个普通类，继承了一个抽象类，此时必须重写抽象类当中的方法。
     * 8.如果一个抽象类A 继承了一个抽象类B，此时A当中不需要重写B中的抽象方法，但是如果A在被普通类继承
     * ，就需要重写
     * 9.抽象方法不能能够是私有的，抽象方法是被重写的，子类的访问权限，要大于等于父类的访问权限。
     * 10.final 与 abstract 是矛盾的
     * 11.抽象类不一定包含抽象方法，但是有抽象方法的类不一定是抽象类
     *  12.抽象类中可以有构造方法，供子类创建对象是时，初始化父类的成员变量，为了方便子类直接调用
     */
    public static int a = 10;
    //抽象方法
    public abstract void draw();

    public void func(){

    }
//    {
//        System.out.println("画图形！");
//    }
}
abstract class A extends Shape {

}
class B extends A {
    @Override
    public void draw() {
        System.out.println("hjjhjhjhjhjh");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("矩形！");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画圆！");
    }
}

class Triangle extends Cycle {
    @Override
    public void draw() {
        System.out.println("画三角形！");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀！");
    }
}







public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
        //这部分叫做类的实现者
    }

    public static void main(String[] args) {

        //匿名对象传参
        //这种思想叫做多态
        drawMap(new Rect());
        drawMap(new Cycle());
        drawMap(new Triangle());
        //这部分叫做类的调用者
        drawMap(new Flower());
    }



    public static void main1(String[] args) {
        //    Shape shape = new Shape();
        Rect rect = new Rect();
    }


}
