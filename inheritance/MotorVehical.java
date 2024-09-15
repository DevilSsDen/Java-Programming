package inheritance;
public class MotorVehical {

    int maxSpeed;
    String modelName;
    int modelYear;
    int numberOfPassengers;

    MotorVehical() {
        maxSpeed = 200;
        modelName = "Ferrari";
        modelYear = 2004;
        numberOfPassengers = 2;
    }
    
    MotorVehical(int maxSpeed, String modelName, int modelYear, int numberOfPassengers) {
        this.maxSpeed = maxSpeed;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.numberOfPassengers = numberOfPassengers;
    }
}
