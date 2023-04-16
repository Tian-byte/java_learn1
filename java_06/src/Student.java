public class Student {
    //构造方法没有返回值，方法名和类名是一致的。
    //构造方法也被称为构造器是一种特殊的成员的方法，名字必须与类名相同，在创建对象时，由编译器
    //自动调用，并且在整个对象的生命周期内
//    大多数情况下使用public来修饰，特殊场景下会被private修饰。
    public String name;
    public int age;
    public static String classes = "106java6班";  // 静态成员变量-》类变量 访问需要，类名. Student.classes
    //= "106java";//班级  静态的一个班级，如果被static 修饰就不在对象里面了，在方法区中
   //构造代码块或实例代码块
    {
        name = "lisa";
        System.out.println("实例代码块！");
    }
//静态代码块
    static {
        classes = "java1 班";
        System.out.println("静态代码块！");
    }
    public Student() {
        //调用本类中的其他构造方法，必须放在构造方法里面，必须是第一行，并且不能形成循环
//        this("wangwu",99);
        System.out.println("不带参数的构造方法");
    }
   public Student(String name, int age) {
       this();
        System.out.println("带两个参数的构造方法");
        this.name = name;
        this.age = age;

    }

    public void setStudent(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void print() {
        System.out.println(this.name+ " => "+ this.age + "=>" + Student.classes);
    }
    public static void  func2(){
     //print();  是非静态方法
       // 在静态方法内部不能访问非静态的数据成员和成员方法。
    }

    public static void main(String[] args) {
       Student student1 = new Student();
//        优先执行静态代码块
//        一般是在类加载的时候执行
        System.out.println("=================");
        Student student2 = new Student();
        //再次调用时 静态的不在被执行，静态的只会执行一次，而实例的构造的new一次执行一次
        System.out.println(Student.classes);
    }

    public static void main2(String[] args) {
        Student student1 = new Student("张三1",12);
        Student student2 = new Student("张三2",22);
        Student student3 = new Student("张三3",32);
        Student.classes = "106java";  // 不属于对象，属于类
        student1.print();
        student2.print();
        student3.print();
        //如果不在定义的时候赋值，不属于某一个对象
        Student.func2();

    }
    public static void main1(String[] args) {
        Student student = new Student(); //实例化对象时一定会调用构造方法
//        当我们 没有提供任何构造方法的时候，编译器会帮助我们提供一个不带参数的构造方法。
//        student.setStudent("bit",12);
        //在实列对象的时候才会调用构造方法。
//        当构造方法调用完成之后，对象才实际产生了
        //构造方法可以被重载的，
//        Student student1 = new Student("haha",23);
        student.print();
    }
}
//静态成员变量和方法的总结
//1.访问方式通过类名
//2.静态的，不依赖对象
//3.在静态方法内部 不能直接访问非静态的数据成员和成员方法。
//4.类变量从在于方法区当中
//5.生命周期伴随类的一身（随着类的加载而创建，随着类的卸载而销毁