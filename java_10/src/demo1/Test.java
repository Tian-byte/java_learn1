package demo1;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author tian
 */
class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        if (this.age - o.age > 0){
            return 1;
        }else if (this.age - o.age <0){
            return -1;
        }else {
            return 0;
        }

//        return 0;
    }
}
// 如果要使用姓名来比较 java 提供了 Comparator
class AgeComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

public class Test {
    public static void bubbleSort(Comparable[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j].compareTo(array[j+1]) > 0){
                    Comparable tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("bit",10);
        students[1] = new Student("hello",40);
        students[2] = new Student("abc",5);
        bubbleSort(students);
//        AgeComparator ageComparator = new AgeComparator();
//        Arrays.sort(students,ageComparator);
        System.out.println(Arrays.toString(students));
    }




    public static void main2(String[] args) {
        String[] strings = {"abc","hello","bca"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }


    public static void main3(String[] args) {
////            Student[] students = new Student[3];
//        students[0] = new Student("bit",10);
//        students[1] = new Student("hello",40);
//        students[2] = new Student("abc",5);
//
//        Arrays.sort(students);
        //需要指定根据什么来比较 姓名？年龄？
 //       System.out.println(Arrays.toString(students));
        //ClassCastException 类型转换异常。
    }





    public static void main1(String[] args) {
        int[] array = {1,4,2,7,3,8,5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
