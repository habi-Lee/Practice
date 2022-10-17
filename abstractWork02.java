package abstract_;

public class abstractWork02 {
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        aa.time();
        bb.time();

    }
}

abstract class temp {
    public abstract void job();

    public void time() {
        long star = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("时间为" + (end - star));
    }
}
class AA extends temp{
    @Override
    public void job() {
        int n = 0;
        for (int i = 1; i <= 100000; i++) {
            n +=i;
        }
    }
}
class BB extends temp{
    @Override
    public void job() {
        int n = 0;
        for (int i = 1; i <= 800000; i++) {
            n +=i;
        }
    }
}
