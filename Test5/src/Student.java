public class Studebt {
    public String name;
    public int age;

    public void setStudent(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void print() {
        System.out.println(this.name+ " => "+ this.age);
    }
}
