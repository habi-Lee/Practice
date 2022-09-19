import java.util.Scanner;
public class Imput{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String name = myscanner.next();
		System.out.println("name="+name);
	}
}