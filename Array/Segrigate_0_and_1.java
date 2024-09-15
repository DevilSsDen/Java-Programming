package Array_practice_Questions;
import java.util.Arrays;

public class Segrigate_0_and_1 {
    public static void segregateArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0, 1, 0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,1,1,1,0,1 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        segregateArray(arr);
        System.out.println("Segregated Array: " + Arrays.toString(arr));
    }
}
