/**
 *  Subclass to specify the Fleetinsurance
 *  uses Carinsurance to accumulate the insurances for all Vehicles of an Enterprise
 *  new Carinsurances are added here, they can also be removed here
 */
package insurance;

//Subclass for Car Fleets
public class FleetInsurance extends Insurance {
    public FleetInsurance() {
    }

    public FleetInsurance(int iCarCount, CarInsurance[] iData, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID) {
        super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
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