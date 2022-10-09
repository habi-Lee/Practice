import java.util.Scanner;

class KY5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数字");
        int n = scanner.nextInt();
        a:
        while (true) {

            switch (n) {
                case 1:
                    System.out.println("恭喜您得大奖，一辆汽车!");
                    break a;
                case 2:
                    System.out.println("不错呀，您得到一台笔记本电脑!");
                    break a;
                case 3:
                    System.out.println("没有白来，您得到一台冰箱!");
                    break a;
                default:
                    System.out.println("你没有中奖！");
                    break a;
            }
        }
    }
}