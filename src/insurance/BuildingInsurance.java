package insurance;

/**
 * Created by Joscha on 04.01.2017.
 */

//Subclass for Building-Insurances
public class BuildingInsurance extends Insurance{
    public BuildingInsurance() {
    }

    //Attributes
    public String city;
    public int zip;
    public String streetName;
    public String houseNumber;
    public String scope;        //Summary of all buildings additional to the building (Garage, Garden, etc.)
    public float value;
    public String riskValue;
}