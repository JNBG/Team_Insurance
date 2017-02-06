/**
 * Subclass to specify a Carinsurance
 * is also used by Fleetinsurance to administrate the Carinsurances for a hole Fleet (e.g. in an Enterprise)
 */
package insurance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Subclass for Car-Insurances
public class CarInsurance extends Insurance {
    public CarInsurance() {
    }

    public CarInsurance(String iLicensePlate, String iBrand, String iModel, int iBuildYear, int iMileage, int iEstMileage, String iTuev, String[] iRegisteredDrivers, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
        super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.licensePlate = iLicensePlate;
        this.brand = iBrand;
        this.model = iModel;
        this.buildYear = iBuildYear;
        this.mileage = iMileage;
        this.estMileage = iEstMileage;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            this.tuev = formatter.parse(iTuev);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //TODO: check because Array
        this.registeredDrivers = iRegisteredDrivers;
    }

    //Attributes
    public String licensePlate;
    public String brand;
    public String model;
    public int buildYear;
    public int mileage;
    public int estMileage;
    public Date tuev;
    public String[] registeredDrivers;
}
