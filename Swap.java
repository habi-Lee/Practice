public class Swap{
	public static void main(String[] agrs){
			int a=10;
			int b=20;
			AA aa = new AA();
			aa.swap(a,b);
			System.out.println("a=" + a+"b="+b);
			}
		}
class AA{
	public void swap(int a,int b){
		int temp = 0;
				temp=a;
				a=b;
				b=temp;
				System.out.println("a=" + a +"b="+b+"\n");
	}
}