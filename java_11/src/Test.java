import java.util.Arrays;
import java.util.Locale;

/**
 * @author tian
 */

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        String str = "abcabcdabcdef";
        System.out.println(str.endsWith("cdef"));//判断是否以 某个字符结尾的 返回值是Boolean 类型
        System.out.println(str.startsWith("abc")); //判断是否以某个字符开始的
    }




    public static void main12(String[] args) {
        String str = "hello  hello      ";
        boolean flg = str.contains("hello"); //返回值是boolean // 判断是否有相同字符
        System.out.println(flg);


        String str1 = str.trim();  //去除左右两边的空格
        System.out.print(str1);
        System.out.println("ppppppppp");
    }


    //字符串的截取
    public static void main11(String[] args) {
        String str = "helloworld";
        String ret1 = str.substring(1,4);  //从1下标开始截取  左闭右开 字符串当中的库函数 基本上只要改变 返回值都是一个全新的对象
        System.out.println(ret1);
    }

    //多次拆封
    public static void main10(String[] args) {
        String str4 = "name=zhangsan&age=18";
        // str4.split("=&"); 这样写是不会分割的
        String[] ret4 = str4.split("&");
        for (String x:
             ret4) {
           // System.out.println(x);
        //再次进行分割
           String[] ss = x.split("=");
            for (String y:
                 ss) {
                System.out.println(y);
            }
        }
    }





    //字符串的拆分
    //可以将一个完整的字符串按照指定的分隔符划分为若干的字符串
    public static void main9(String[] args) {
        String str = "zhangsan&wangwu&zhaoliu&lisi";
        String[] ret = str.split("&",2); // 返回值是一个数组类型
        System.out.println(Arrays.toString(ret));


        System.out.println("==============");
        String str2 = "127.0.0.1";
        String[] ret2 = str2.split("\\.");  //使用. 无法完成分割，要使用转义字符
        //字符"|" "," "*","+" 都得加上转移字符，前面加上"\\"
        //而如果是"\" 那么就的写成"\\\\"
        //如果一个字符串中有很多个分隔符，那么可以用"|"作为连字符。
        for (String x:
             ret2) {
            System.out.println(x);
        }
        String str4 = "name=zhangsan&age=18";
        // str4.split("=&"); 这样写是不会分割的
         String[] ret4 = str4.split("=|=");
        System.out.println(Arrays.toString(ret4));
    }


    //字符串替换
    public static void main8(String[] args) {
        String str1 = "ababcabcdabcdef";
        //将里面的所有的ab 全部替换为 pk
        System.out.println(str1.replace('a', 'p'));
        System.out.println(str1.replaceAll("abc","pk"));
        System.out.println(str1.replaceFirst("abc","pkrg "));
    }




    //字符串转数组  s
    public static void main7(String[] args) {
        String str2 = "ABCDEFG";
        char[] chars = str2.toCharArray();
        System.out.println(Arrays.toString(chars));
        //数组转字符串
        String  s = new String(chars);
        System.out.println(s );

        //格式化
       String ret2 =  String.format("%d-%d-%d",2012,12,12);
        System.out.println(ret2);
    }
    //小写转大写
    public static void main6(String[] args) {
        String str = "hello";  //如果是大写就不用改变，如果不是字母就不改变
       String ret =  str.toUpperCase();
        System.out.println(ret);

        String str2 = "ABCDEFG";
        String ret1 = str2.toLowerCase();
        System.out.println(ret1);



    }



    //转换 数值和字符串转换
    public static void main5(String[] args) {
        String str = String.valueOf(123);
        System.out.println(str);
         String str1 =   String.valueOf(true);
        System.out.printf(str1);
        //类型转换为字符串
        String s4 = String.valueOf(new Student("Hanmeimei",18));
        System.out.println(s4);
        //字符串转换为类型
        System.out.println("===============");
        int val1 = Integer.parseInt("123");
        System.out.println(val1+1);

        double val2 = Double.parseDouble("1234");
        System.out.println(val2+2);
    }




    public static void main4(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }



    //字符串的查找
    public static void main3(String[] args) {
        String str = "abcdef";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            System.out.println(ch);
//        }
        System.out.println(str.indexOf('c'));// 找到c的下标 如果出现多个c 找到第一个就结束
        System.out.println(str.indexOf('c',3)); //从三位置开始找c
        System.out.println(str.indexOf("abc"));  //返回的是a的下标
        System.out.println(str.indexOf("abc",4)); //从四下标开始找相同的字符串


        System.out.println("##############");
        System.out.println(str.lastIndexOf('c')); //从后向前找,返回其下标
        System.out.println(str.lastIndexOf('c',4));

        System.out.println(str.lastIndexOf("abc"));
        System.out.println(str.lastIndexOf("abc",3));


    }



    public static void main2(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("Hello");
        String s3 = s1;
        System.out.println(s3);

        System.out.println(s1.length());
        System.out.println(s1 == s2 );
        System.out.println(s1.equals(s2 ));

        System.out.println(s1.equalsIgnoreCase(s2)); // 忽略大小写比较是否相同
        int ret1 =  s1.compareTo(s2); // s1,s2 比较 返回值是一个整数
        int ret = s1.compareToIgnoreCase(s2); // 忽略大小写
        if (ret > 0){
            System.out.println("s1>s2");
        }else if (ret == 0){
            System.out.println("s1=s2");
        } else {
            System.out.println("s1<s2 ");
        }
    }






    public static void main1(String[] args) {
        //字符串构造
        String str1 = "hello"; // hello 叫做字符串常量   str1 叫做引用变量
        System.out.println(str1);
        String str2 = new String("abc");
        System.out.println(str2);
        char[] chars = {'a','b','c'}; // 字符数组
        // 将字符串数组 转换为字符串
        String str3 = new String(chars);
        System.out.println(str3);
    }
}
