import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()){
            int age = scan.nextInt();
            p.setAge(age);
            System.out.println(p.getAge(age));
        }
    }
}

class Person {
    private int age;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(int age) {
        if (this.age < 0){
            return 0;
        } else if (this.age > 200){
            return 200;
        } else{
            return this.age;
        }
    }

}