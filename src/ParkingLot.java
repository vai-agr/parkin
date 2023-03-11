import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private List<ParkingSlot> parkingSlots;


    //Singleton design pattern
    public static ParkingLot getParkingLot() {
        if(parkingLot==null)
            parkingLot = new ParkingLot();
        return parkingLot;
    }

    //TODO
    public ParkingLot() {
        parkingSlots = new ArrayList<>();
    }

    public void addParkingSlots(int twoWheelerSlots, int fourWheelerSlots) {
        int slotNo = parkingSlots.size();
        for(int i=0; i<twoWheelerSlots; i++){
            parkingSlots.add(new ParkingSlot(slotNo, VehicleType.TWOWHEELER));
            slotNo++;
        }
        for(int i=0; i<fourWheelerSlots; i++){
            parkingSlots.add(new ParkingSlot(slotNo, VehicleType.FOURWHEELER));
            slotNo++;
        }
    }

}
