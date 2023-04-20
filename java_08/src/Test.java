//class A {
//    @Override
//    public String toString() {
//            return  "111";
//    }
//}
//public class Test {
//    public static void main(String[] args)
//        A a = new A();  //这个与new A() 一样；
//        System.out.println(new A());
//    }
//}
class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal(String, int)");
    }

    public void eat(){
        System.out.println(name+"吃饭！");
    }
    public static void staticFunc(){

    }
}

/**
 * 1.this 会优先访问子类自己的，如果子类没有，访问的是父类的。
 * 2.super 只是一个关键字，在代码层面上，能狗达到易读的效果。
 * 有些书上说super是父类的引用，这种说法是错误的。
 *
 * 子类的访问权限，要大于等于父类的权限
 * private 的方法不可以重写
 * final修饰的方法我们叫做密封方法，不能被重写
 * 如果方法被static修饰也不能够被重写
 * 构造方法也不能被重写，构造方法只能是重载
 * 重写的方法可以使用@Override 注释来显示指定。
 */
/**
 * 重写和重载的去边是的什么？
 * 重载的三个条件：1.方法名称相同2.参数列表不同[数据类型，顺序，个数] 3.返回值不做要求
 * 重写的三个条件：一定发生在继承层次上
 * 1.方法名称相同2.返回值相同 返回值构成父子关系也可以的3.参数列表相同(数据类型，个数，顺序)
 */

/**
 * 重写
 * 重写也称为覆盖，重写是子类对父类非静态，非private修饰，非final 修饰，非构造方法等实现过程
 * 进行重新编写，返回值和形参都不能改变，既外壳不变，核心重写，重写的好处在于子类可以根据需要
 * ，定义特定属于自己的欣慰，也就是子类能够根据需要实现父类的方法
 *
 */
class Dog extends Animal {
    //傻狗 是狗的属性
    public boolean silly;
    //public String name = "hello"; //子类和父类同名优先访问自己的，如果自己没有就访问父类的
    public Dog(String name,int age,boolean silly){
        //1.先帮助父类部分初始化
        super(name,age);  //这个必须放在第一行，必须先帮父类初始化
        this.silly = silly;
        System.out.println("String,int,boolean");
    }

    public void houseGuard() {
        System.out.println(super.name+"正在看家护院！");
        //实例内部类当中，才会包含外部类的this
//        System.out.println(Animal.this.name+"看家护院！");
//       super.eat();
            staticFunc();

    }
    public static void staticFunc(){
//        System.out.println(super.name);
        //静态的方法中不能使用this和super
    }
    public void eat() {
        System.out.println(name+"正在吃狗粮！");
    }

}

class Cat extends Animal {
    public Cat() {
        super("mimi",10);
//        this("mimi",10);
    }

    public Cat(String name,int age){
        super(name,age);
    }

    //不加特有的属性
    public void catchMouse(){
        System.out.println(name+"抓老鼠！");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("hello",10,false);
        dog.eat();
    }











    public static void main1(String[] args) {
        //每一个类 都会生成 自己的字节码文件
        //局部变量
        //c++ 是可以多继承的，而Java是不可以多继承的，只能继承一个类
        Dog dog = new Dog("hello",10,false);
        dog.houseGuard();
        Cat cat = new Cat();

    }
}
//1.5由于设计不好，或者场景需要，子类和父类中可能会存在相同名称的成员，如果在子类中访问父类同名成员时
//该如何操作？Java提供了super关键字，该关键字主要作用：在子类方法中访问父类的成员。
/**
 * super.data 用来访问父类的普通成员变量
 * super.func() 调用父类的普通成员方法，静态方法不支持super调用的
 * super() 调用父类的构造方法。
 * super 和 this 的区别方法有何不同：
 */