import java.util.Scanner;

public class if_else_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int z;

        System.out.println("Enter the value for x:");
        x = sc.nextInt();
        System.out.println("Enter the value for y:");
        y = sc.nextInt();
        System.out.println("Enter the value for z:");
        z = sc.nextInt();

        if(x > y && x > z){
            System.out.println("X is the greatest number"+" "+x);
        }else if(y > x && y > z){
            System.out.println("Y is the greatest number"+" "+y);
        }else{
            System.out.println("Z is the greatest number"+" "+z);
        }
        sc.close();
    }
}
