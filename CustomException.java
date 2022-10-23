package Exception_;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if (!(age >= 0 && age <= 120)) {
            throw new AgeException("年龄需要在0-120之间");
        }
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}