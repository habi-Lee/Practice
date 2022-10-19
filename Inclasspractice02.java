package abstract_;

public class Inclasspractice02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });

    }
}
interface Bell{
    void ring();
}
class Cellphone{
    public void clock(Bell bell){
        bell.ring();
    }
}
