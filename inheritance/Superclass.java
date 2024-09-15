package inheritance;

public class Superclass {
    int instanceVariable = 10;
    static int classVariable = 20;
}

class SubClass extends Superclass {
    int instanceVariable = 12;
    static int classVariable = 25;

    public static void main(String[] args) {
        Superclass s = new SubClass();
        System.out.println("Superclass Instance variable: " + s.instanceVariable);
        System.out.println("Superclass static variable: " + Superclass.classVariable);
        
        SubClass st = new SubClass();
        
        System.out.println("Subclass Instance variable: " + st.instanceVariable);
        System.out.println("Subclass static variable: " + SubClass.classVariable);
    }
}
