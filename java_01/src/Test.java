import java.util.Scanner;

public class Test {
    //获取一个二进制序列中所有的偶数位和奇数位，分别输出二进制序列
    public static void main(String[] args) {
        int n=7;
        for (int i = 31; i >= 1 ; i-=2) {
            System.out.print(((n>>i) & 1 )+ " ");
        }//偶数
        System.out.println();
        for (int i=30; i>=0; i-=2) {
            System.out.print(((n>>i) & 1) + " ");
        }// 奇数
    }
    //模拟登录 编写代码模拟三次密码输入的场景，最多输入三此密码，密码正确。提示：登录成功
    //密码错位，可重复输入，最多三次，三次均错。则提示退出程序。
    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=3;
        while ( count != 0){
            System.out.println("请输入密码，共有"+count+"次机会！");
            String poss = scanner.nextLine();
            if(poss.equals("123")) {     //poss == "123" 这样判读是错误的，在Java中字符串判断是否相等 要使用equals这个方法；
                 System.out.println("登录成功！");
                break;
            }else{
                System.out.println("登录失败！");
            }
            count--;
        }
    }





    //输出一个整数，输出每一位。例如：输入123，输出3，2，1。
    public static void main9(String[] args) {
        int a = 123;
        while (a!=0) {
            System.out.print(a%10+",");
            a/=10;
        }
    }

    //输出乘法口诀表
    public static void main8(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(i+"*" +j +"="+ i*j + " ");
            }
            System.out.println();
        }
    }

//    该任务是用*组成的x型图案。多组输入，一个整数（2~20），表示输入的行数，也表示组成“X”的反斜线
//    和正斜线的长度
public static void main7(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (scan.hasNextInt()) {
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for( int j = 0; j < n ; j++){
                if ((i==j) || (i+j == n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}





    //水仙花数指的是三位数，加深难度如果是六位数呐
    //1.算 是几位数
    //2.求每位数字是多少，位数的次幂算出来 求和
    public static void main6(String[] args) {
        for (int i = 10; i<=999999; i++){
            int count = 0;
            int tmp=i;
            int sum=0;
            while (tmp != 0){
                tmp/=10;
                count++;
            }
            //count 里面就存储了当前数字i时几位数
            tmp = i;
            while ( tmp != 0) {
               // Math.pow() 求次方的方法
             sum += Math.pow(tmp%10,count);
             //看某个方法的源码：1.鼠标点击到这个方法上2.按住ctr+鼠标左键 跳转
                tmp /= 10;
            }
            //sum存储了和
            if (sum == i){
                System.out.println(i);
            }
        }

    }

    //计算分数的值 1/1-1/2+1/3-1/4+1/5.....+1/99-1/100
    public static void main5(String[] args) {
        double sum=0.0;
        int j=1;
        for (int i=1;i<=100;i++){
            sum=sum+1.0/i*j;
            j=-j;
        }
        System.out.println(sum);
    }

    //求一个整数，在内存当中存储时，二进制1的个数
    public static void main4(String[] args) {
        int n = 15;
        int count=0;
        while (n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
    public static void main3(String[] args) {
        int n=-1;
        int count=0;
        while(n!=0){
            if((n & 1)!=0){
                count++;
            }
            n = n >>> 1;
        }
        System.out.println(count);
    }
    public static void main2(String[] args) {
        //移动次数过多
        int n=7;
        int count=0;
        for (int i=0;i<32;i++){
            if(((n >> i) & 1)==1) {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main1(String[] args) {
    char a=128;
    byte b=(byte) a;
        System.out.println(a +" " +b);
        System.out.println(b +" ");
        double x=2.0; int y=4; x/=++y;
        System.out.println(x + " " +y);
        //byte a=130;  报错 byte范围为-128~127
        //float b=3.5; 报错 float 应该在后面加f,如果不加f系统默认为double类型
    }


}
