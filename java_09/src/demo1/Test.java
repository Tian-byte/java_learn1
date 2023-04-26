package demo1;
/**
 * 多态的优点
 * 1.可以在这个过程中降低圈复杂度
 * 2.可扩展能力更强
 * 多态的缺陷
 * 1.代码运行效率降低
 *  1.属性没有多态性
 *  2.构造方法没有多态性
 */

import java.util.StringTokenizer;

class Shape {
    public void draw() {
        System.out.println("画图象！");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("画矩形！");
    }
}

class Cycle extends Shape{
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
    // 画一个圆，一个矩形，在画一朵花

    public static void drewShapes1() {
        String[] strings = {"cycle","rect","cycle","rect","flower"};

        for (String x:
        strings) {
            if (x.equals("cycle")) {
                Cycle cycle = new Cycle();
                cycle.draw();
            } else if (x.equals("rect")) {
                Rect rect = new Rect();
                rect.draw();
            } else {
                Flower flower = new Flower();
                flower.draw();
            }
        }
    }
    //使用多态
    public static void drewShapes(){
        Shape[] shapes = {new Cycle(),new Rect(),new Rect(),new Flower()};
        for (Shape x:
             shapes) {
            x.draw();
        }
    }

    public static void main(String[] args) {
            drewShapes();
    }





    /**
     * 1.在 drawMap() 方法当中，Shape shape 引用，引用的子类对象不一样，调用方法表现出来的
     * 行为不一样，我们把这种方法叫做多态。
     * @param shape
     */

    public static void drawMap(Shape shape) {
        shape.draw();
        //这部分叫做类的实现者
    }

    public static void main2(String[] args) {

        //匿名对象传参
        //这种思想叫做多态
        drawMap(new Rect());
        drawMap(new Cycle());
        drawMap(new Triangle());
        //这部分叫做类的调用者
        drawMap(new Flower());
    }




    public static void main1(String[] args) {
    Shape shape = new Rect();
        shape.draw();
        Shape shape2 = new Cycle();
        shape2.draw();
        Shape shape1 = new Triangle();
        shape1.draw();

    }
}
