import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    //冒泡排序
    public static void  bubbleSort(int[] array){
        //使用i控制躺数
        boolean flg = false;
        for (int i = 0; i < array.length-1; i++) {
            //优化了每一次比较的次数
            for (int j = 0; j < array.length-1-i; j++) {
                    if (array[j]>array[j+1]) {
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
            }
            if (flg = false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,12,14,15,6,7,89,4,35,536,123};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    //判断两个数组是否相等
    public static void main8(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {1,2,3,4,5,6,7};
        boolean flg = Arrays.equals(array1,array2);
        System.out.println(flg);
    }
    //数组的逆序
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (right > left) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main7(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    //查找数组中的指定元素
    //数组升序排列
    public static void main6(String[] args) {
        Integer[] array = {1,4,2,3,5,9,8,7,0};


        Arrays.sort(array);
//        System.out.println(Arrays.toString(array)); //不是冒泡排序，底层是快速排列。
        //降序排列需要比较器，目前只是储备不足
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                    return o1-o2;  //升序
//                  return o2-o1; //降序
            }
        });
        int index = Arrays.binarySearch(array,3);
        System.out.println(index);
        System.out.println(Arrays.toString(array));
    }
    //二分查找   建立在有序的情况下 Arrays.binarySearch(array,3);
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < key) {
                left = mid+1;
            }else if (array[mid] > key) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    //顺序查找
    public static int find(int[] array,int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
//        System.out.println(find(array,8));
        System.out.println(binarySearch(array,3));
    }
    //给一个整形数组，求平均值
    public static double avg(int[] array) {
        int sum = 0;
        for (int x:
             array) {
            sum += x;
        }
        return sum*1.0/array.length;
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(avg(array));
    }
    //Arrays.copyOf 局部的拷贝
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2 = array.clone(); //产生一个副本
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2 = Arrays.copyOfRange(array,2,5);
        //在Java中一般是左闭右开的，[2,5); 所有不包含5
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
    //数组的拷贝 copyOf  arraycopy  src 要拷贝的数组; srcPos 拷贝数组开始的位置; dest: 要拷贝到那个数组
    // desPos 目的地数组的位置  array.length 拷贝的长度
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2 = new int[array.length];
        System.arraycopy(array,0,array2,0,array.length);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }

}
