public class RideBookingDriver {

    // Test the class here 
    public static void main(String[] args) {
        // Instance a Taxi class
        Taxi taxiObj = new Taxi(Taxi.VehicleType.Suv);
        //Assign info for vehicle type, rego num, availability using setter
        taxiObj.setVehicle(Taxi.VehicleType.Sedan);
        taxiObj.setRegoNumber("BAH932");
        taxiObj.setStatus(true);
        //System.out.println(taxiObj);

        // Instance a RideBooking class instance
        RideBooking rbObj = new RideBooking("Jonny", taxiObj);
        //add different location
        rbObj.addLocationByIndex("Clayton", 0);
        rbObj.addLocationByIndex("Caulfield", 1);
        rbObj.addLocationByIndex("Parkville", 2);
        //print on console
        System.out.println(rbObj);
        //remove one location
        rbObj.removeLocationByIndex(1);
        //print again
        System.out.println("\n"+ rbObj);
        
    }


}
