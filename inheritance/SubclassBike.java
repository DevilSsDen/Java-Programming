package inheritance;

class Bike extends SubClass {
    boolean kickstart;
    boolean buttonStart;

    Bike() {
        super();
        kickstart = true;
        buttonStart = false;
    }
    Bike(boolean ks, boolean bs) {
        super();
        kickstart = ks;
        buttonStart = bs;
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println("Bike created with kickstart: " + b.kickstart + ", buttonStart: " + b.buttonStart);
    }
}
