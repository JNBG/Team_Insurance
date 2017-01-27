/**
 *
 */
package insurance;

//Subclass for Car Fleets
public class FleetInsurance extends Insurance {
    public FleetInsurance() {
    }

    public FleetInsurance(int iCarCount, CarInsurance[] iData, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContactID) {
        super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContactID);
        this.carCount = iCarCount;
        this.data = iData;
    }

    //Attributes
    public int carCount;
    private CarInsurance[] data;

    //Methods
    //TODO implement method
    public CarInsurance[] getCarList() {

        return null;
    }

    //TODO implement method
    public void addCar(){   //EDGAR

    }

    //TODO implement methdo
    public void removeCar() {

    }
}