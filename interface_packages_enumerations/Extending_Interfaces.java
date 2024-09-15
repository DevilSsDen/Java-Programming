package interface_packages_enumerations;

public class Extending_Interfaces {
    interface A {
        void showA();
    }

    interface B extends A {
        void showB();
    }

    static class InDemo implements B {
        public void showA() {
            System.out.println("Overriden method of Interface A");
        }

        public void showB() {
            System.out.println("Overriden method of Interface B");
        }

        public static void main(String[] args) {
            InDemo d = new InDemo();
            d.showA();
            d.showB();
        }
    }
}
