import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args){
		int arr[] = {1,2,3};
		char key = 'y';
		do{
		int arrnew [] = new int[arr.length + 1];
		for (int i = 0;i < arr.length ;i++ ) {
			arrnew[i] = arr [i];
		}
		System.out.println("请输入你要添加的元素：");
		Scanner scanner = new Scanner(System.in);
		arrnew[arrnew.length-1] = scanner.nextInt();
		arr = arrnew;
		System.out.println("---扩容后的数组---");
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		System.out.println("你是否还要继续输入： y/n");
		 key = scanner.next().charAt(0);
		}while(key=='y');
		if (key=='n') {
			System.out.print("程序结束");
		}
	}

}