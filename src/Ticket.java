public class Ticket {
    private String vehicleNo;
    private int slotNo;

    public Ticket(String vehicleNo, int slotNo) {
        this.vehicleNo = vehicleNo;
        this.slotNo = slotNo;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }
}
