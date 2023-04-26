import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test0 {
    public static void fun3(int[] array) {
        int array3[] = new int[11];
        int j = 0, b = 6;
        for (int i = 0; i  < array.length/2; i++) {
            int tmp = array[i];
            array3[j] = array[i];
            array3[j] = tmp;
            j++;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您要插入到中间的数字：");
        array3[array3.length/2] = scan.nextInt();
        for (int i = array.length/2; i< array.length; i++) {
            int tmp = array[i];
            array3[b] = array[i];
            array3[b] = tmp;
            b++;
        }
        System.out.println("插入后的数组："+ Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println("从大到小排序:"+func2(array3));
//        return Arrays.toString(array3);
    }

    public  static String   func2(int[] array){
        int array2[] = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i>=0; i--) {
          array2[j] = array[i];
          j++;
        }
       String ret = Arrays.toString(array2);
        return ret;
    }
    public static int sum (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void func1(int[] array){
        Arrays.sort(array);
        System.out.println("数组的最小值"+array[0]);
        System.out.println("数组的最大值"+array[array.length-1]);
    }

    public static void main(String[] args) {
        Random random = new Random(0);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("所有数组的和:"+sum(array));
        System.out.println("所有数组的平均值:"+sum(array)*1.0/array.length);
       //求数组的最大最小值
        func1(array);
        System.out.println("数组正序排列:"+Arrays.toString(array));
        System.out.println("数组逆序排列:"+ func2(array));
        //在数组中间插入一个数组，并从大到校排列
//        int[] array3 = Arrays.copyOf(array,array.length+1);
         fun3(array);
//        System.out.println(Arrays.toString(array3));
        System.out.println("请输入要查找的元素");
        System.out.println("原数组为："+Arrays.toString(array));
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        int x = Arrays.binarySearch(array,key);
        System.out.println(key+"这个元素是第"+(x+1)+"个");
        //将数组扩容为20，前十个正向输出，后十个逆向输出
        int[] array4 = Arrays.copyOf(array,2*array.length);
        for (int i = array4.length; i <array4.length/2 ; i--) {
            array4[i] = array4[i/2];
        }
        System.out.println(Arrays.toString(array4));
    }
}
