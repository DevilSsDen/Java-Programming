package Array_practice_Questions;
import java.util.Arrays;

public class Pairs_with_gives_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Arrays.sort(arr);
        for(int i = 0; i<=arr.length-1;i++){
            for(int j = i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==9){
                    System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");

                }
            }
        }
    }
}
