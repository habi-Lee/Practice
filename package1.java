import java.util.Arrays;

public class package1 {
    public static void main(String[] args) {
        int arr[] = {5, -2, 32, -9, 61, 99, 81, 32};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
