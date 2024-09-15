package inheritance;

class A {
    void doOverride(int k) {
        System.out.println("A's doOverride: " + k);
    }
}

class B extends A {
    @Override
    void doOverride(int k) {
        System.out.println("B's doOverride: " + k);
    }
}
class C extends A {
    @Override
    void doOverride(int k) {
        System.out.println("C's doOverride: " + k);
    }
}


public class code {
    public static void main(String[] args) {
        A[] a = new A[2];
        
        a[0] = new B();
        a[1] = new C();
        
        for (int i = 0; i < a.length; i++) {
            a[i].doOverride(12);
        }
    }
}
