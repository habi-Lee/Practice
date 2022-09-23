public class BubbleSort{
	public static void main(String[] args){
		int arr[] = {53,36,98,45,65,32};
		for (int i = 0;i < arr.length - 1 ;i++ ) {
			for (int j = 0;j<arr.length - 1 - i ;j++ ) {
				int temp = 0;
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
				System.out.println("\n" + "第"+(i+1)+"轮循环");
				for( j = 0;j<arr.length;j++){
					System.out.print(arr[j]+" ");
				}
				
			}
		}
	}
}