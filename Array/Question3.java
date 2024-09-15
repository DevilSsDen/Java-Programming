package Array_Dad_Questions;

import java.util.Arrays;
//Modifying Elements of an Array
public class Question3 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};

        myArray[3] = 69;
        System.out.println("The modified array is as follows: " + Arrays.toString(myArray));
    }
}
