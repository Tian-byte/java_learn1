//通过一个类来描述具体的对象
class Person {
    //属性
    public int age;
    public  String name;

    //行为
    public void eat() {
        System.out.println("吃饭！");
    }
}
//class 类名 -> 大驼峰
class WashMachine {
    //属性【字段】 -》成员属性
    public String brand; // 品牌
    public String type; // 型号
    public double weight; // 重量
    public double length; // 长
    public double width; // 宽
    public double height; // 高
    public String color; // 颜色
    //行为【方法】 -》成员方法
    public void washClothes(){ // 洗衣服
        System.out.println("洗衣功能");
    }
    public void dryClothes(){ // 脱水
        System.out.println("脱水功能");
    }
    public void setTime(){ // 定时
        System.out.println("定时功能");
    }
}
class Dog{
    //成员变量
    public String name;
    public String  color;

    public void barks() {
        System.out.println(name + "汪汪汪");
    }
    public void wag() {
        System.out.println(name + "摇尾巴！");
    }
}


public class Test2 {
    public static void main(String[] args) {
        //实例化一个Dog对象
        Dog dog = new Dog();
        dog.name = "来福";
        dog.color = "黑色";
        System.out.println(dog.color);
        System.out.println(dog.name);
        //访问方法也是使用.号来实现的
        dog.barks();
        dog.wag();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        //通过一个类可以实例化无数个对象


    }
}
