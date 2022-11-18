package src.inheritance_polymorphism;

public class Car extends Automobile {
    private String engineType;
    private String enginPower;
    private boolean hasHeatedSeat;
    private String interiorColor;
    private String seatingMaterial;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEnginPower() {
        return enginPower;
    }

    public void setEnginPower(String enginPower) {
        this.enginPower = enginPower;
    }

    public boolean isHasHeatedSeat() {
        return hasHeatedSeat;
    }

    public void setHasHeatedSeat(boolean hasHeatedSeat) {
        this.hasHeatedSeat = hasHeatedSeat;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getSeatingMaterial() {
        return seatingMaterial;
    }

    public void setSeatingMaterial(String seatingMaterial) {
        this.seatingMaterial = seatingMaterial;
    }
}
