package src.day1;

public class Vehicle {

//    States
//    make
    private String make;
//    model
    private String moddel;
//    vinNumber
    private long vinNumber;
//    axleCount
    private int axleCount;
//    wheelCount
    private int wheelCount;
//    vehicleCategory
    private String vehicleCategory;
//    vehicleType
    private String vehicleType;
//    engineType
    private String engineType;
//    maxSpeed
    private double maxSpeed;
//    milage
    private double milage;

//    Behaviours
//    canDrive
//


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModdel() {
        return moddel;
    }

    public void setModdel(String moddel) {
        this.moddel = moddel;
    }

    public long getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(long vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getAxleCount() {
        return axleCount;
    }

    public void setAxleCount(int axleCount) {
        this.axleCount = axleCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMilage() {
        return milage;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }
}
