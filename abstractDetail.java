package abstract_;

public class abstractDetail {
}
abstract class a{
    //抽象方法不能使用privat final static修饰
    //因为它们和重写违背
    public abstract void hi();
}
//如果一个类继承了抽象类
//它必须实现抽象类的所有方法
//或者声明为抽象类
class b extends a{
    @Override
    public void hi() {
        System.out.println("hi");
    }
}
abstract class c extends a{

}