package demo1;

/**
 * @author tian
 */
class Money {
    public double m = 12.5;


}



class Person implements Cloneable{
    public int id;
    public Money money = new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}



public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person1 = (Person) person.clone();
        person1.money.m = 1999;
        System.out.println("person:"+person.money.m);
        System.out.println("person1:"+person1.money.m);
    }
}
