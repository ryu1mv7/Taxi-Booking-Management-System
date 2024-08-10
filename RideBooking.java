import java.util.ArrayList;
import java.util.Date;

public class RideBooking {

    // instances variables 
    private String customerName; // 1-50
    private final Date CURRENT_DATE = new Date();
    private Taxi taxi;
    private ArrayList<String> locationList;


    // constructor 
    public RideBooking(String initCustomerName, Taxi initTaxi){
        setCustomerName(initCustomerName);
        addTaxi(initTaxi);
        locationList = new ArrayList<>();
    }

    // getter | accessor 
    public Date getCurrentDate() {
        return CURRENT_DATE;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    // setter | mutator 

    public boolean setCustomerName(String newCustomerName) {
        boolean retVal = false;
        if (newCustomerName != null && (1<= newCustomerName.length() && newCustomerName.length()<= 50))
        {
            retVal = true;
            customerName = newCustomerName;
        }
        return retVal;
    }
    // other methods 
    public void addTaxi(Taxi newTaxi){
        if (newTaxi != null)
        {
            taxi = newTaxi;
        }
    }

    public void addLocationByIndex(String newLocation, int indexPosition){
        boolean inExpectedRange = (0 <= indexPosition && indexPosition <= 24); //check range of user input
        boolean isValidIndex = (indexPosition <=locationList.size());  // indexPosition must be valid(not far awy num) ; otherwise index out of bounds error
        boolean InCapacity = (locationList.size() < 25);
        if (newLocation != null && isValidIndex && InCapacity && inExpectedRange)
        {
            locationList.add(indexPosition, newLocation);
        }
    }

    public void removeLocationByIndex(int locationIndex){
        boolean inExpectedRange = (0 <= locationIndex && locationIndex <= 24);
        boolean isValidIndex = (locationList.size() > locationIndex); // locationIndex must be valid (not far awy num); otherwise index out of bounds error
        // to check the location exists within the arrayList, locationList.size() > locationIndex ensure locationIndex is smaller than num of elem in the arrayList
        if (inExpectedRange && isValidIndex && locationList.get(locationIndex) != null)
        {
            locationList.remove(locationIndex);
        }
    }

    @Override
    public String toString(){
        String ret = "";
        ret+= "Customer Name: " + getCustomerName()+ "\n";
        ret+= "Start Date: " + getCurrentDate()+ "\n";
        ret+= "Destinations: " + locationList+ "\n";
        ret+= getTaxi().toString();
        return ret;

    }
}
