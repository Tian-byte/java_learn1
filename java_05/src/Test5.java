import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;

public class Test5 {
    //存在连续三个奇数的数组
    //给定一个整数数组arr，请你判断数组中是否存在连续三个元素都是奇数的情况，如果存在，返回ture，否则返回，false
    public static boolean fun4(int[] array) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            }else {
                count = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2,6,4,1};
        System.out.println(fun4(array));
    }
    //多数组元素，给定一个大小为n的数组，找到其中的多数组元素，多数组元素中出现次数大于[n/2]的元素
    //    例如：nums = [3,2,3];  输出：3；
//投票法
    public static int majorityElement(int[] array) {
        int ret = array[0];
        int count = 0;
        for (int i = 0; i < array.length;i++) {
            if (array[i] == ret) {
                count++;
            }else {
                count--;
            }
            if (count == 0) {
                ret = array[i+1];
            }
        }
        return ret;
    }
    public static void main9(String[] args) {
        int[] array = {2,2,1,1,1,2,2};
        int nums = majorityElement(array);
        System.out.println(nums);
    }
//    暴力求解
    public static int majorityElement2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > array.length/2) {
                return array[i];
            }
        }
        return -1;
    }
    public static void main8(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement2(nums));
    }
    //排序法
    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main7(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement1(nums));
    }
    //只出现一次数字
    //给定一个非空数组，除了某个元素只出现一次，其余每个元素均出现两次，找出那个只出现了一次的元素
    //例如 [2,2,1]  1  [4,1,2,1,2]  4
//    采用^ 异或
    public static int func3 (int[] array) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret = ret ^ array[i];
        }
        return ret;
    }

    public static void main6(String[] args) {
        int[] array4 = {1,2,3,2,1};

        System.out.println(func3(array4));
    }

    //两数之和，给定一个整数数组nums 和 一个整数目标值 target 请你在该数组中找出和目标值target 的那两个整数
    //并返回他们的数组下标， 例如：nums = {2，7，11，15} target = 9；输出：[0,1]
    public static int[] func2(int[] array,int target) {
        int[] ret = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] + array[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }
    public static void main5(String[] args) {

        int[] array = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(func2(array,target)));
    }

    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            int year = scan.nextInt();
            System.out.println("请输入年份");
            if (year == 2016 && year > 0) {
                System.out.println("输入正确");
                break;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
        while (true) {
            System.out.println("请输入月份");
            int month = scan.nextInt();
            if (month >= 1 && month <= 12 && month == 2) {
                System.out.println("输入正确");
                break;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
        System.out.println("请输入年份和月份");
        while (true) {
            int year = scan.nextInt();
            int month = scan.nextInt();
            if (month == 2)
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + "年" + month + "月" + "月是29天");
                    break;
                } else {
                    System.out.println(year + "年" + month + "月" + "月是28天");
                }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(year + "年" + month + "月" + "月是30天");
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println(year + "年" + month + "月" + "月是31天");
            }
        }
    }
    //奇数位于偶数之前
    //调整数组顺使得奇数位于偶数之前，调整之后，不关心大小顺序。
    //例如数组[1,2,3,4,5,6] 交换后 [1,5,3,4,2,6]
    public static void func1(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            while (i < j && array[i] % 2 != 0){
                i++;
            }
            while (i < j && array[j] % 2 == 0){
                j--;
            }
            int tmp =array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6};
        func1(array);
        System.out.println(Arrays.toString(array));

    }
    //改变原有数组元素的值
    //实现一个方法transform，以数组为参数，循环将数组中的每个元素 乘以2，并设置到对应的数组元素上，例如 原数组为{1，2，3}
    //修改之后{2，4，6}
    public static int[] transform(int[] array) {
        int[] tmpArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmpArr[i] = array[i]*2;
        }
        return tmpArr;
    }
    public static void main2(String[] args) {
        int[] array2 = {1,2,3};
        int[] ret = transform(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(ret));
    }
    public static void transform1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }
    public static void main1(String[] args) {
        int[] array1 = {1,2,3};
        transform(array1);
        System.out.println(Arrays.toString(array1));
    }
}
