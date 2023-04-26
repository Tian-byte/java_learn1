package demo1;

class B {
    public B() {
        func();

        //当在父类当中，调用子类重写 方法的时候，此时会调用子类重写的方法
    }
    public void func() {
        System.out.println("B.func()");
    }
}

class D extends B {
    private int num = 1;

    public void func(){
        System.out.println("D.func()"+ num);
    }
}

public class TestDemo {
    public static void main(String[] args) {
        D d = new D();

    }
}