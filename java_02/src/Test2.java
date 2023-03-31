import java.util.Scanner;

public class Test2 {

    //求斐波拉契数列 分别使用递归和迭代实现
    //迭代
    public static int fub4(int n) {
        int fib1 = 1;
        int fib2 = 1;
        int fib3 = 1;
        for (int i = 3; i <= n ; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib3;
    }
    public static void main(String[] args) {
        System.out.println(fub4(40));
    }
    //递归
    public static int fib(int n) {
        if (n==1 || n == 2) {
            return 1;
        } else {
            return (fib(n-1) + fib(n-2) );
        }
    }
    public static void main8(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fib = fib(n);
        System.out.println(fib);
    }
    //求阶乘的和 1！+2！+3!+.....+n!
    public static int fun (int a) {
        int sum = 1;
        for (int i = 1; i <=a ; i++) {
            sum *= i;
        }
        return sum;
    }
    public static void main7(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=1;
        for (int i = 1; i <= n ; i++) {
            sum += fun(i);
        }
        System.out.println(sum);
    }
    //求n的阶乘
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int sum = 1;
        if (a==0)
            sum = 0;
        for (; a>0; a--) {
            sum = sum * a;
        }
        System.out.println(sum);
    }
    //使用函数求最大值。创建方法求两个数的最大值 max2，随后写一个求三个数的最大值 max3.要求在这个max3这个函数中
    //调用max2函数，来实现3个数的最大值。
    public static int max2(int a, int b) {
        return a > b ? a : b;
    }
    public static int max3 (int a, int b, int c) {
        int max = max2(a,b);
        return max > c ? max : c ;
    }
    public static void main5(String[] args) {
        System.out.println(max3(1, 2, 3));

    }
    //最大公约数 辗转相除法
    //(319，377）：
    //∵ 319÷377=0（余319）
    //∴（319，377）=（377，319）；
    //∵ 377÷319=1（余58）
    //∴（377，319）=（319，58）；
    //∵ 319÷58=5（余29）
    //∴ （319，58）=（58，29）；
    //∵ 58÷29=2（余0）
    //∴ （58，29）= 29；
    //∴ （319，377）=29。
    public static void main4(String[] args) {
        int a = 24;
        int b = 18;
        int c =a % b; //6
        while (c!=0) {
            a = b; //18
            b = c;  //6
            c = a % b; //0
        }
        System.out.println(b);
    }

    //判断一个数是不是素数 素数能够被1和他本身整除
    //优化 n/2 还是比较大的，使用根号下n
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 2;
        for (;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                System.out.println(" 不是素数");
                break;
            }
        }
        if (i > Math.sqrt(n) ) {
            System.out.println(" 是素数");
        }
    }
    //优化n 比较大 使用n/2
    public static void main2(String[] args) {
        int n = 7;
        int i = 2;
        for (;i <= n/2; i++) {
            if( n % i == 0) {
                System.out.println(n+"不是素数");
                break;
            }
        }
        if (i > n/2) {
            System.out.println(n+"是素数");
        }
    }
    public static void main1(String[] args) {
        int n = 7;
        int i = 2;
        for (; i < n ; i++) {
            if(n % i == 0){
                System.out.println("不是素数 ");
            }
        }
        if (i==n) {
            System.out.println("是素数");
        }
    }
}
