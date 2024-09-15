public class Matrix_multiplication {
    public static void main(String[] args) {
        int n = 2;
        int i, j, k;
        int a[][] = {{3, 4}, {6, 7}};
        int b[][] = {{4, 3}, {2, 5}};
        int c[][] = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                c[i][j] = 0;
                for (k = 0; k < n; k++) {
                    c[i][j] = a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("The given matrix A: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The given matrix B: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("The matrix C after multiplication is:");
        for (i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
