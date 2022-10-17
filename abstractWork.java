package abstract_;

public class abstractWork {
    public static void main(String[] args) {

    }
}
abstract class Employee{
    private String name;
    private int id;
    private double sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Employee(String name, int id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;

    }
    public abstract void work();
}
class worker extends Employee{


    public worker(String name, int id, double sal) {
        super(name, id, sal);
    }

    @Override
    public  void work() {
        System.out.println("员工"+ getName()+"正在工作");
    }
}
class manager extends Employee{

    public manager(String name, int id, double sal) {
        super(name, id, sal);
    }

    @Override
    public void work() {
        System.out.println("经理"+getName()+"正在工作");
    }
}
