import java.util.Scanner;
public class Grades{
	public static void main(String[] args){
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("请输入上次考试成绩：");
		int a = scanner1.nextInt();
		System.out.println("请输入本次成绩:");
		int b = scanner1.nextInt();
		double c =  (b - a) *1.0/ a;
		System.out.println("成绩提高了"+c);
	}

}