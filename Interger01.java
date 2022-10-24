package Wrapper;

public class Interger01 {
    public static void main(String[] args) {
        int n1 = 100;
        Integer integer1 = n1;
        int n2 = integer1;
        Double d = 100d;
        Float f = 1.5f;
        //Integer->String
        Integer i = 100;
        //方法1
        String str1 = i + "";
        //方法2
        String str2 = i.toString();
        //方法3
        String str3 = String.valueOf(i);
        //String -> Integer
        String str4 = "123456";
        //方法1
        Integer i2 = Integer.parseInt(str4);
        //方法2
        Integer i3 = new Integer(str4);

    }
}
