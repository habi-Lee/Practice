public class OverLoad{
	public static void main(String[] agrs){
		MyCalculator t1 = new MyCalculator();
		t1.add(10,20);
		t1.add(10,2.2);
		t1.add(1.10,20);
		t1.add(2.10,1.20);
	}
}
class MyCalculator{
	public void add(int n,int m){
		System.out.println(n+m);
	}
	public void add(double n,double m){
		System.out.println(n+m);
	}
	public void add(double n,int m){
		System.out.println(n+m);
	}
	public void add(int n,double m){
		System.out.println(n+m);
	}
}