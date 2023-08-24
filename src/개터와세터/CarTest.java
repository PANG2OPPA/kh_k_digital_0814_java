package 개터와세터;

public class CarTest {
    String manufacture;
    String modelName;
    String color;
    String Year;
    int maxSpeed;

    public CarTest(String manufacture, String modelName, String color) {
        this.manufacture = manufacture;
        this.modelName = modelName;
        this.color = color;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return Year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
