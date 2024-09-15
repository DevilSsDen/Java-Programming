package Array_practice_Questions;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,77,8,44,654,2};
        Arrays.sort(arr);

        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate number = "+arr[j]);
                    break;
                }
            }
        }   

        

        scanner.close();
    }
}
