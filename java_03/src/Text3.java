import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Text3 {
    //写数组的拷贝.拷贝的前提是你要有原内容，产生一个以某一样的内容
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};
//        int[] array2 = Arrays.copyOf(array,array.length-1);// 需要拷贝的数组，和数组的长度；
        //拷贝扩容
        int[] array2 = Arrays.copyOf(array,array.length+10);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    public static void main8(String[] args) {
        int[] array = {1,3,5,7,9};
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            array2[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    public static void main7(String[] args) {
        int[] array = {1,3,5,7,9};
        int[] array2 = array;
//        System.out.println(Arrays.toString(array2));
//        这不算是拷贝，因为根本没有产生新的内存空间
    }
    //自己设置一个方法，将整形算法进行打印输出，类似于toString
    public static String myToString(int[] tmp) {
        if (tmp==null)
        {
            return "null";
        }
        String ret = "[";
        for (int i = 0; i < tmp.length; i++) {
            ret += tmp[i];
            if ( i != tmp.length-1) {
                ret += ",";
            }
//            ret = ret + tmp[i] + ",";

        }
        ret = ret + "]";
        return ret;
    }
    public static void main6(String[] args) {
        int[] array = {1,2,3,4};
        String ret = myToString(array);
        System.out.println(ret);
    }
    // 数组转字符串
    public static void main5(String[] args) {
        int[] array = {1,2,3,4};
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }
    //写一个方法printArray 以数组为参数，循环访问数组中的没一个元素，打印每一个元素的值。
    //常见的数组的定义 int [] array1 = {1,2,3};   int array2 = new int[]{1,2,3,4};  int[] array3 = new int[10];

    //创建数组，并赋初始值。创建一个int 类型的数组，元素个数为100，并把每一个元素依次设置为1~100
    public static void main4(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i <array.length ; i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }
    //使用递归来求发斐波拉契数列
    public static int fib(int n) {
        if (n == 1 || n ==2) {
            return 1;
        }
        return ((fib(n-1)) + fib(n-2));
    }
    public static void main3(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sum = fib(n);
        System.out.println(sum);
    }
    //使用递归来求1+2+3+4+....+10
    public static int sum (int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum (num - 1);
    }

    public static void main2(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        sum=sum(num);
        System.out.println(sum);
    }

    //递归
    public static void print (int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
            print(n/10);
            System.out.println(n % 10);
        }

    public static void main1(String[] args) {
        print(123);
    }
}
