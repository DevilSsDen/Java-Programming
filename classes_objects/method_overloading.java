/**
 * method_overloading
 */
public class method_overloading {

    void max(float a, float b){
        System.out.println("max method with float argument invoked");
        if (a>b){
            System.out.println(a +"is the greater number");
        }else{
            System.out.println(b + "is the greater number");
        }
    }
    void max(double a, double b){
        System.out.println("max method with double argument invoked");
        if(a>b){
            System.out.println(a +"is the greater number");
        }else{
            System.out.println(b + "is the greater number");
        }
    }
    void max(long a, long b){
        System.out.println("max method with double argument invoked");
        if(a>b){
            System.out.println(a +"is the greater number");
        }else{
            System.out.println(b + "is the greater number");
        }
    }

    public static void main(String[] args) {
        method_overloading o = new method_overloading();
        o.max(23L,12L);
        o.max(2,3);
        o.max(54.0,35f);
        o.max(43f,35f);
    }
}