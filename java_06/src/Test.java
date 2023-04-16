// private 私有的  default 默认的  protected 受保护的 public 公开的
//public 不管在哪里都可以访问  private 只能在当前类的内部进行访问
//
class Person1 {
    private String name;
    private int age;
    String sex; //默认是default权限，默认权限。在同一个包里面使用，即在同一个文件夹里面使用。
//    包：为了更好的管理，把多个类收集在一起成为一组，称为软件包、
    //包是对类，接口等的封装机制的体现，是一种对类或者接口的很好的组织方式，
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void show() {
        System.out.println("姓名："+ name + "年龄" + age);
    }

}




public class Test {
    public static void main(String[] args) {
        demo1.Test test = new demo1.Test();
    }
    public static void main11(String[] args) {
        Person1 person1 = new Person1();
//        person1.name = "bit"; 不可以直接访问name
        person1.setName("bit");  //提供公开的方法来访问 name
//        person1.age = 12;
        //获取name
        System.out.println(person1.getName());
    }
}
