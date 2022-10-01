public class Recoursion{
	public static void main(String[] agrs){
		int res,res1;
		Tools tool = new Tools();
		res = tool.fi(10);
		System.out.println("第10个斐波那契数="+res);
		peach p1 = new peach();
		res1 = p1.cnt(1);
		System.out.println("一共有"+res1+"个桃子");
	}
}
//斐波那契数列
class Tools{
	public int fi(int n){
		if (n==1 || n==2) {
			return 1;
		}
		else{
			return fi(n-1)+fi(n-2);
		}
	}
}
/*
猴子吃桃：有一堆桃子猴子每天吃一半并再吃一个，第十天只剩下1个，请问最开始有多少个桃子
*/
class peach{
	public int cnt(int n){
		if(n==10){
			return 1;
		}
		else if(n>=1 && n<=9){
			return (cnt(n+1)+1)*2;
		}else{
			System.out.println("你输入的不在范围内（1-10）");
			return -1;
		}
	}
}