public class Ticket {
    private static int lastTicketNo = 0;

    private int ticketNo;
    private String vehicleNo;
    private int slotNo;

    public Ticket(String vehicleNo, int slotNo) {
        this.ticketNo = ++lastTicketNo;
        this.vehicleNo = vehicleNo;
        this.slotNo = slotNo;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
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
