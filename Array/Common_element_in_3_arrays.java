package Array_practice_Questions;

import java.util.Arrays;

public class Common_element_in_3_arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 42, 43, 54, 85, 86, 7, 8};
        int[] arr3 = {1, 32, 53, 94, 85, 96, 7, 8};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        System.out.print("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                        System.out.println("The common elements int the arrays are"+arr1[i]);
                    }
                }
            }
        }
    }
}
