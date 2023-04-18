package inherit;
// 子类和父类不存在同名成员变量
class Base {
    int a;
    int b;
    public void methodA(){
        System.out.println("Base中的methodA()");
    }
}
public class Derived  extends Base{
    int a;
    int c;
    public void methodA(){
        System.out.println("Base中的methodA()");
    }
    public void methodB(){
        System.out.println("Derived中的method()方法");
    }
    public void methodC() {
        methodB();   //访问子类自己的 methodB();
        methodA();   //访问子类自己的 methodA()
//        methodD();   //编译失败，在整个继承体系中没有发现methodD();
    }
    public void method() {
        super.a = 10;  //此时当 父类和子类 都拥有同名的时候，优先访问自己
        b = 20;
        c = 30;
        System.out.println(super.a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);;
    }

    /**
     *1.如果访问的成员变量子类中有，优先访问自己的成员变量
     * 2.如果访问的成员变量与子类中无，则访问父类继承下来的，如果父类也没有，则编译器报错
     * 3.如果访问的成员变量与父子成员变量同名，则优先访问自己的
     * @param args
     */
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.method();

//        Base base = new Base();
//        System.out.println(base.a);
    }
}
