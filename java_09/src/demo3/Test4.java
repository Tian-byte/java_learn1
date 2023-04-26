package demo3;

/**
 * @author tian
 */

/**
 * 1.接口和接口之间 extends
 * 2.类和接口之间 implements
 */

interface A1 {
    public void func();
}

interface B1 {
    void func2();
}
interface D extends A1,B1{
    void func3();
}

class E implements D{

    @Override
    public void func() {

    }

    @Override
    public void func2() {

    }

    @Override
    public void func3() {

    }
}


class C1 implements A1,B1 {


    @Override
    public void func() {

    }

    @Override
    public void func2() {

    }
}

public class Test4 {

}
