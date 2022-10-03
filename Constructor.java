public class Constructor{
	public static void main(String[] agrs){
		Person p1 = new Person();
		System.out.println(p1.age);
		Person p2 = new Person(20,"tom");
		System.out.println(p2.age + p2.name);
	}
}
class Person{
	String name;
	int age;
	public Person(){
		age = 18;
	}
	public Person(int page,String pname){
		age = page;
		name = pname;
	}
}