public class SalesTaxCalculator {
    float amount = 100.0f;
    float taxRate = 10.2f;

    public static void main(String[] args) {
        SalesTaxCalculator obj1 = new SalesTaxCalculator();
        SalesTaxCalculator obj2 = new SalesTaxCalculator();
        System.out.println("Amount in object1: " + obj1.amount);
        System.out.println("Tax rate in object1: " + obj1.taxRate);
        System.out.println("Amount in object2: " + obj2.amount);
        System.out.println("Tax rate in object2: " + obj2.taxRate);
    }
}
