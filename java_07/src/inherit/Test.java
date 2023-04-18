package inherit;

class Animal {
    public String name;
    public int age;
    public void eat(){
        System.out.println(name+"正在吃饭！");
    }

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}

//class Dog extends Animal 让Dog 类继承 Animal 类
//Dog叫做子类  Animal 叫做父类
//子类也叫派生类   父类/基类/超类
//继承：就是对共性的抽取。从而达到对代码的复用【重复使用】

//一般情况下，继承不超过三层
//私有的成员可以被继承，但不能被访问
class Dog extends Animal{
    public void barks(){
        System.out.println(name+"汪汪叫 "+"年龄："+ age);
    }

}

class Cat extends Animal{

    public void catchMouse() {
        System.out.println(name+"正在抓老鼠");
    }
}
public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.age = 10;
        dog.barks();
        dog.eat();
    }
}
