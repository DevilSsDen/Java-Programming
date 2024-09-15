import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter (A-G): ");
        char c = sc.next().charAt(0);

        switch(c) {
            case 'A':
                System.out.println("You entered Monday");
                break;
            case 'B':
                System.out.println("You entered Tuesday");
                break;
            case 'C':
                System.out.println("You entered Wednesday");
                break;
            case 'D':
                System.out.println("You entered Thursday");
                break;
            case 'E':
                System.out.println("You entered Friday");
                break;
            case 'F':
                System.out.println("You entered Saturday");
                break;
            case 'G':
                System.out.println("You entered Sunday");
                break;
            default:
                System.out.println("You entered a wrong choice");
        }

        sc.close();
    }
}
