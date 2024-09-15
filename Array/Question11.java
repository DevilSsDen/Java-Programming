package Array_Dad_Questions;

import java.util.Arrays;

public interface Question11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 6};
        Arrays.sort(arr);
        int secondLargest = arr[arr.length-2];

        System.out.println("The second last number from array is"+secondLargest);
    }
}
