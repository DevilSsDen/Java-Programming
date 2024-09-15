package inheritance;
class Motorvehicle {
    private String modelName;
    private String modelNumber;
    private double modelPrice;

    public Motorvehicle(String modelName, String modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    public void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: $" + modelPrice);
    }

    public String getModelName() {
        return modelName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public double getModelPrice() {
        return modelPrice;
    }
}

class Car extends Motorvehicle {
    private double discountRate;

    public Car(String modelName, String modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate + "%");
    }

    public double discount() {
        return (getModelPrice() * discountRate) / 100;
    }

    public void displayFinalPrice() {
        double discountAmount = discount();
        double finalPrice = getModelPrice() - discountAmount;
        System.out.println("Final Price after discount: $" + finalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota Corolla", "2024-COR", 25000, 10);
        car.display();
        car.displayFinalPrice();
    }
}
