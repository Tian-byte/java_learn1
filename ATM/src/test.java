//package practise;
import java.util.Scanner;
public class test {
    static Scanner inScanner=new Scanner(System.in);
    public static void main(String[] args) {
        ATM();
    }
    //     判断密码方法
    public static void ATM() {
        System.out.println("请输入密码登录");
        int password;
        password =inScanner.nextInt();
//	进行密码判定，密码正确登录，错误提示再次输入密码
        if (password==12345) {
            System.out.println("登录成功，欢迎使用");
            Serive();
        }else {
            System.out.println("密码错误，请重新输入");
            password =inScanner.nextInt();
//		第一次输入密码错误，进行第二次判断，密码正确登录，错误提示再次输入密码
            if (password==12345) {
                System.out.println("登录成功，欢迎使用");
            }else {
                System.out.println("密码错误，请重新输入");
                password =inScanner.nextInt();
//			第三次进行密码判断，密码错误退出登录
                if (password==12345) {
                    System.out.println("登录成功，欢迎使用");
                }else {
                    System.out.println("密码错误，退出登录");
                }
            }
        }
    }
    //   服务项目的方法
    public  static void Serive() {
//	   提示所需要进行的项目
        System.out.println("请选择你所需要的项目");
        System.out.println("查询余额，存款，取款，退出");
//	定义初始为一万元
        int money=10000;
//	定义存款
        int deposit;
//	定义为取款
        int withdraw;
        String a;
        a =inScanner.next();
        do {
            if (a.equals("查询余额")) {
                System.out.println("您的余额为"+money);
                System.out.println("请选择您要进行的项目");
                a =inScanner.next();
            }else {
                if (a.equals("存款")) {
                    System.out.println("请输入存款数目");
                    deposit=inScanner.nextInt();
                    money+=deposit;
                    System.out.println("请选择您要进行的项目");
                    a =inScanner.next();
                }else {
                    if (a.equals("取款")) {
                        System.out.println("请输入取款数目");
                        withdraw=inScanner.nextInt();
                        if (withdraw>money) {
                            System.out.println("您的余额不足");
                            System.out.println("请选择您要进行的项目");
                            a =inScanner.next();
                        }else {
                            money-=withdraw;
                            System.out.println("请选择您要进行的项目");
                            a =inScanner.next();
                        }

                    } else {
                        if (a.equals("退出")) {
                            System.out.println("系统退出，欢迎下次使用");
                            break;
                        }
                    }
                }
            }
        } while(a.equals("查询余额")||a.equals("存款")||a.equals("取款")||a.equals("退出"));
    }
}


