import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入身高（m）：");
		double tall = scanner.nextDouble();
		System.out.println("请输入体重（kg）：");
		double weight = scanner.nextDouble();
		double result = tall / (weight * weight);
		if (result<18.5) {
			System.out.println(result + "过轻：低于18.5");
		}else if (18.5<=result&&result<25) {
			System.out.println(result + "正常：18.5-25");
		}else if (25<=result&&result<28) {
			System.out.println(result + "过重：25-28");
		}else if(28<=result&&result<32){
			System.out.println(result + "肥胖：28-32");
		}else {
			System.out.println(result + "非常肥胖：高于32");
		}

	}


}
