package interface_packages_enumerations;

public class Recursive_Factorial {
    public int fact(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else if (a < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        } else {
            return a * fact(a - 1);
        }
    }

    public static void main(String[] args) {
        Recursive_Factorial rf = new Recursive_Factorial();
        int result = rf.fact(9);
        System.out.println("Factorial of 9 is: " + result);
    }
}
