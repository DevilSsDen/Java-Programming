package inheritance;
class Motorvehicle {
    int i = 0;

    void doOverride(int k) {
        i = k;
    }
}

class B extends Motorvehicle { // Changed A to Motorvehicle
    @Override
    void doOverride(int k) {
        super.doOverride(k);
        i = 2 * k;
        System.out.println("The value of i is: " + i);
    }

    public static void main(String[] args) {
        B b = new B();
        b.doOverride(12);
    }
}
