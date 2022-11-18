package src.inheritance_polymorphism;

public class PassangerVehicle extends Automobile {
    private int passangerCapacity;
    private String travelRoute;
    private boolean hasCycleCarrier;
    private int cycleHoldingCapacity;

    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(int passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    public String getTravelRoute() {
        return travelRoute;
    }

    public void setTravelRoute(String travelRoute) {
        this.travelRoute = travelRoute;
    }

    public boolean isHasCycleCarrier() {
        return hasCycleCarrier;
    }

    public void setHasCycleCarrier(boolean hasCycleCarrier) {
        this.hasCycleCarrier = hasCycleCarrier;
    }

    public int getCycleHoldingCapacity() {
        return cycleHoldingCapacity;
    }

    public void setCycleHoldingCapacity(int cycleHoldingCapacity) {
        this.cycleHoldingCapacity = cycleHoldingCapacity;
    }
}
