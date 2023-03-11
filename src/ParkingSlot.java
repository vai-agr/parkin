public class ParkingSlot {
    private int slotNo;
    private VehicleType vehicleType;
    boolean isTaken;

    public ParkingSlot(int slotNo, VehicleType vehicleType) {
        this.slotNo = slotNo;
        this.vehicleType = vehicleType;
        this.isTaken = false;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }
}
