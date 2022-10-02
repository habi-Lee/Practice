public class Varparameter{
	public static void main(String[] args){
		Mytool t1 =	new Mytool();
		System.out.println(t1.add(1,2,3,4,5,6));
	}
}
class Mytool{
	public int add(int... nums){
		int res = 0;
		for (int i =0;i< nums.length;i++ ) {
			res += nums[i];
		}
		return res;
	}
}