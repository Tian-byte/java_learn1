import demo1.Test;

import java.util.*;
// *不是一下都导入进来，使用什么导入什么
import java.sql.*;
import  static  java.lang.Math.*;
public class Test3 {

    public static void main(String[] args) {
        Test test = new Test();
//        System.out.println(test.a);
        //与dome1 不是一个包里面的不可以访问
    }
    public static void main2(String[] args) {
        double x = 30;
        double y = 40;
        //静态导入的方式写起来更加的方便一些
//        double result = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
       double result = sqrt(pow(x,2) + pow(y,2));
        System.out.println(result);
    }
    public static void main1(String[] args) {
      java.util.Date   date = new java.util.Date();
        //得到一个毫秒级别的时间戳
        System.out.println(date.getTime());
//        .

    }

}
