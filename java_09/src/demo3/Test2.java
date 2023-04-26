package demo3;

/**
 * @author tian
 */

/**
 * 1.创建接口时，接口命名一般以大写字母I开头
 * 2.接口的命名一般是“形容词” 词性的单词
 * 3.阿里编码规范中约定，接口中的方法和属性不需要加任何修饰符，保持代码的间接性
 */
interface IShape{
    void draw();
}

// alt + enter
class Rect implements IShape{

    @Override
    public void draw() {
        System.out.println("矩形！");
    }
}
class Flower implements IShape{
    @Override
    public void draw() {
        System.out.println("花！");
    }
}
class Cycle implements IShape{
    @Override
    public void draw() {
        System.out.println("圆圈！");
    }
}
public class Test2 {
    public static void  drawMap(IShape iShape) {
        iShape.draw();
    }



    public static void main(String[] args) {
        Rect rect = new Rect();
        drawMap(rect);
        drawMap(new Cycle());
        drawMap(new Flower());
//        IShape iShape = new Cycle();
    }
}
