package demo3;

/**
 * @author tian
 */

import java.util.Objects;

/**
 * object 是Java 默认提供的一个类，Java里面除了object类，所有的类都是存在关系的，默认会继承
 * object父类。即所有的对象都可以使用object的引用进行接受。
 *
 * object 类是参数的最高统一类型，但是object类也存在有定义好的一些方法。
 * 
 * 如果以后写了自定义类型，那么要注意要重写equals方法。
 *
 *
 * 1.hashcode 方法是用来缺定对象在内存中存储的位置是否相同
 * 2.事实上 hashcode() 在散列表中才有用，子其他情况下没有，在散列表中hashcode()的作用是获取对象
 * 散列码，进而确定该对象在散列表中的位置。
 */
class  Person {
    private String name;
    private int age;
    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Person per = (Person) obj;
       if (this.name.equals(per.name) && this.age == per.age ) {
           return true;
       }
       return false;
    }

    @Override
    public int hashCode() {
        //计算对象的位置
        return Objects.hash(name, age);
    }
}

class Students {

}

public class Test6 {
    public static void main(String[] args) {
        Person person1 = new Person("张三",18);
        Person person2 = new Person("张三",18);

        System.out.println(person1.equals(person2));//false 比较的是 person1和person2 的的地址。
        System.out.println("=================");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    
   
   
   
   
    }
    public static void func(Object obj){
        Person person = new Person("张三",18);
        Person person1 = new Person("李四",20);

        System.out.println(person1.equals(person));

    }
    public static void main1(String[] args) {
        func(new Person("zhan",10));
        func(new Students());
    }
}
