public class SortingArray {
    public static void main(String[] args) {
        int [] marks = {3,1,6,3,8,9};
        int temp , n;
        n = marks.length;
        System.out.println("The list of marks is");
        for(int i = 0; i<n;i++){
            System.out.println(marks[i]+ " ");
        }

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(marks[i]<marks[j]){
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        System.out.println("\n List of marks sorted in descending order is: ");
        for(int i = 0; i<n;i++){
            System.out.println(marks[i]+" ");
        }
    
    }
}
