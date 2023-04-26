package demo3;

/**
 * @author tian
 */

/**
 * 没有写成类的原因，Java当中只能有一个类，不能够继承多个类，但是可以实现多个接口。
 */
interface IFlying {
    void flaying();
}

interface ISwimming{
    void swimming();
}

interface IRunning {
    void running();
}


class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭！");
    }
}

class Dog extends Animal implements IRunning,ISwimming{

    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    public void swimming() {
        System.out.println(name+"正在游泳！");
    }

    @Override
    public void running() {
        System.out.println(name+"正在跑！");
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃饭！");
    }
}
    class Bird extends Animal implements  IFlying{
    //上面的顺序不能够交换，必须先继承，在实现。
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void flaying() {
            System.out.println(name+"正在飞!");
        }
    }

    class Duck extends Animal implements IFlying,IRunning,ISwimming {

        public Duck(String name, int age) {
            super(name, age);
        }

        @Override
        public void flaying() {
            System.out.println(name+"正在飞！");
        }

        @Override
        public void swimming() {
            System.out.println(name+"正在游泳！");
        }

        @Override
        public void running() {
            System.out.println(name+"正在跑!");
        }
    }
public class Test5 {
    public static void  walk(IRunning iRunning){
        iRunning.running();
    }
    public static void main(String[] args) {
        walk(new Dog("hello",18));
        walk(new Duck("hello1",19));
    }

}
