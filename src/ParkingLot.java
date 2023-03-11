import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static final int TWOWHEELERCOST= 20;
    private static final int FOURWHEELERCOST= 40;
    private static ParkingLot parkingLot;
    private List<ParkingSlot> parkingSlots;


    //Singleton design pattern
    public ParkingLot getParkingLot() {
        if(parkingLot==null)
            parkingLot = new ParkingLot();
        return parkingLot;
    }

    public ParkingLot() {
        parkingSlots = new ArrayList<>();
    }

    public void addParkingSlots(int twoWheelerSlots, int fourWheelerSlots) {
        int slotNo = parkingSlots.size() + 1;
        for(int i=0; i<twoWheelerSlots; i++){
            parkingSlots.add(new ParkingSlot(slotNo, VehicleType.TWOWHEELER));
            slotNo++;
        }
        for(int i=0; i<fourWheelerSlots; i++){
            parkingSlots.add(new ParkingSlot(slotNo, VehicleType.FOURWHEELER));
            slotNo++;
        }
    }

    public Ticket park(Vehicle vehicle) throws Exception{
        try{
            for(ParkingSlot slot: parkingSlots){
                if(!slot.isTaken() && slot.getVehicleType() == vehicle.getVehicleType()){
                    slot.occupy();
                    Ticket ticket  = new Ticket(vehicle.getVehicleNo(), slot.getSlotNo());
                    return ticket;
                }
            }
            throw new Exception("Parking lot full");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public int unpark(Ticket ticket){
        ParkingSlot slot = parkingSlots.get(ticket.getSlotNo()-1);
        slot.vacate();
        if(slot.getVehicleType()==VehicleType.TWOWHEELER)
            return TWOWHEELERCOST;
        else return FOURWHEELERCOST;
    }
}
