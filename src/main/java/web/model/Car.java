package web.model;

public class Car {

    private String carType;
    private String carNumber;
    private int liftingCapacity;

    public Car(String carType, String carNumber, int liftingCapacity) {
        this.carType = carType;
        this.carNumber = carNumber;
        this.liftingCapacity = liftingCapacity;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", liftingCapacity=" + liftingCapacity +
                '}';
    }
}
