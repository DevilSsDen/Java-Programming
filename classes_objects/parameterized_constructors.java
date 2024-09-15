public class parameterized_constructors {
    double length , breadth , height , volume;
    parameterized_constructors(double l , double b , double h){
        length = l;
        breadth = b;
        height = h;

    }
    double volComp(){
        volume = height*breadth*length;
        return volume;
    }
    public static void main(String[] args) {
        parameterized_constructors r1 = new parameterized_constructors(14, 12, 10);
        parameterized_constructors r2 = new parameterized_constructors(16, 15, 11);
        System.out.println("The volumeof theroom is "+ r1.volComp());
        System.out.println("The volumeof theroom is "+ r2.volComp());

    }
}
