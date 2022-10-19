package abstract_;

public class Inclasspractice {
    public static void main(String[] args) {

        f1(new IA(){
            @Override
            public void paint() {
                System.out.println("i am painting");
            }
        });
    }
    public static void f1(IA a){
        a.paint();
    }
}

interface IA{
    void paint();
}
