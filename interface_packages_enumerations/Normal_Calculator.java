package interface_packages_enumerations;

interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b);
}

public class Normal_Calculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Normal_Calculator c = new Normal_Calculator();
        System.out.println("Value after addition = " + c.add(5, 2));
        System.out.println("Value after subtraction = " + c.subtract(5, 2));
        System.out.println("Value after multiplication = " + c.multiply(5, 2));
        System.out.println("Value after division = " + c.divide(5, 2));
    }
}
