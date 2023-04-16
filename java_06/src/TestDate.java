public class TestDate {
    public int year;//年
    public int month;//月
    public int day;//日

    public TestDate() {

    }

    public void setDate(int year, int month, int day) {
        //局部变量优先  下面的赋值 相当于自己给自己赋值
//        根本没有赋值到成员变量中去，如果要想赋值到成员变量当中去使用this引用
        this.year = year;
       this.month = month;
        this.day = day;
    }
    public void printDate() {
        System.out.println(year + "-" + month + "-" + day );
    }
//  this 的三种使用方式
//    this.成员变量
//    this.访问成员方法
//    this(); 访问构造方法
//    成员方法
    public void  func() {
        this.printDate();
    }
//    this只能在成员方法中使用
    public static void main(String[] args) {
        TestDate testDate1 = new TestDate();
        TestDate testDate2 = new TestDate();
        TestDate testDate3 = new TestDate();
        testDate1.setDate(2023,4,13);
        testDate2.setDate(2023,4,14);
        testDate3.setDate(2023,4,15);
        testDate1.printDate();
        testDate2.printDate();
        testDate3.printDate();
    }
    public static void main1(String[] args) {
        TestDate testDate = new TestDate();
//        testDate.year = 2023;
//        testDate.month = 4;
//        testDate.day = 13;
        testDate.setDate(2023,4,13);
        testDate.printDate();
        //输出0-0-0
    }

}
