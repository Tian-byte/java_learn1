import java.sql.Savepoint;
import java.util.Scanner;

public class Atm {
// 登录
    public static int passWord() {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int a = 3;
        while (count++ < 3){
            System.out.println("请输入密码");
            String password = scan.next();
            if (password.equals("123456")){
                System.out.println("密码正确，登录成功！");
                break;
            }else {
                System.out.println("密码错误,您还有"+ (--a)+"次机会");
            }
        }
        return a;
    }
    //存储阶段
    public static void storage() {
        System.out.println("1.查询余额 2.存储 3.取款 4.退出");
        Scanner scan = new Scanner(System.in);
         int a = 1;
        double surplus = 99999;
        while ( a > 0) {
            int num = scan.nextInt();
            switch (num) {
                case 1:
//                余额
                    System.out.println("卡内余额" + surplus);
                    System.out.println("1.查询余额 2.存储 3.取款 4.退出");
                    break;
                case 2:
//              存款
                    System.out.println("请输入存款金额");
                    double saveMoney = scan.nextDouble();
                    if (saveMoney > 0){
                        System.out.println("存款成功");
                        surplus=surplus+saveMoney;
                        System.out.println("账户余额"+ surplus);
                        System.out.println("1.查询余额 2.存储 3.取款 4.退出");
                    } else {
                        System.out.println("输入错误，请重新输入");
                        System.out.println("1.查询余额 2.存储 3.取款 4.退出");
                    }
                    break;
                case 3:
                    //取款
                    System.out.println("取款");
                    System.out.println("请输入取款金额：");
                    double getMoney = scan.nextDouble();
                    if (getMoney > 0) {
                        if (getMoney > surplus) {
                            System.out.println("对不起，账户余额不足");
                            System.out.println("1.查询余额 2.存储 3.取款 4.退出");
                        } else {
                            System.out.println("取款成功");
                            surplus=surplus-getMoney;
                            System.out.println("剩余余额" + surplus);
                            System.out.println("1.查询余额 2.存储 3.取款 4.退出");
                        }
                    }
                    break;
                case 4:
                    a = -1;
                    break;
            }
        }
    }

    public static void main(String[] args) {
   int a = passWord();
   if (a != 0)
    storage();
    }
}
