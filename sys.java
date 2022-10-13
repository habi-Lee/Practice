package smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class sys {
    public static void main(String[] args) {
        //设置菜单
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String detail = "===============零钱通明细===============";
        double money;
        double balance = 0.0;
        Date date = null;//日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日期格式化
        String note;
        String s;
        do {
            System.out.println("===============零钱通菜单===============");
            System.out.println("\t\t\t  1 零钱通明细");
            System.out.println("\t\t\t  2 收益入帐");
            System.out.println("\t\t\t  3 消   费");
            System.out.println("\t\t\t  4 退   出");
            System.out.print("请选择1-4\n");
            String key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(detail);

                    break;
                case "2":
                    System.out.println("收益入账金额");
                    money = scanner.nextDouble();
                    if (money < 0) {
                        System.out.println("输入错误");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + "余额=" + balance;
                    break;
                case "3":
                    System.out.println("请输入消费金额");
                    money = scanner.nextDouble();
                    if (money < 0) {
                        System.out.println("输入错误");
                        break;
                    }
                    if (money>balance){
                        System.out.println("余额不足");
                    }
                    System.out.println("请输入消费说明");
                    note = scanner.next();
                    balance -= money;
                    detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额=" + balance;
                    break;
                case "4":
                    System.out.println("您确认退出吗（y/n）");
                    s = scanner.next();
                    if (s.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        } while (loop);
    }
}
