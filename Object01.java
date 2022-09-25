public class Object01{
public static void  main(String[] args){

	 	Cat cat_1 = new Cat();
	 	cat_1.name = "小白";
	 	cat_1.age = 3;
	 	cat_1.color = "白色";
	 	System.out.println("猫的名字是" + cat_1.name+"\n猫的年龄是" + cat_1.age+"\n猫的颜色是"+cat_1.color);
	 } 
}
class Cat{
	String name;
	int age;
	String color;
}