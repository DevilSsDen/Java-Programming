package Array_practice_Questions;
import java.util.Arrays;


public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int elementToDelete = 30;

        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] newArr = deleteElement(arr, elementToDelete);

        System.out.println("Array after deleting " + elementToDelete + ": " + Arrays.toString(newArr));
    }

    public static int[] deleteElement(int[] arr, int element) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return arr;
        }

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found in the array.");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }
}
