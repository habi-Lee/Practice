package Exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
            System.out.println("going1");
        } catch (Exception e) {
            System.out.println("异常原因"+e.getMessage());
        }finally {
            System.out.println("going2");
        }
        System.out.println("going3");
    }
}
