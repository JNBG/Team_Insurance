/**
 *
 */
package insurance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import damage.Damage;


//Parent-Class for all Insurances
abstract class Insurance {
    //Constructor
    public Insurance() {
    }
    //Attributes

    public String customerType;
    public String insuranceType;
    public String name;
    public Boolean active;
    public Date startDate;
    public Date endDate;
    public float currentBalance;
    //TODO: add Damage-List to constructor
    protected Damage relatedDamages[];
    public int contractID;

    public Insurance(String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
        this.customerType = iCustomerType;
        this.insuranceType = iInsuranceType;
        this.name = iName;
        this.active = iActive;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            this.startDate = formatter.parse(iStartDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            this.endDate = formatter.parse(iEndDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.currentBalance = iCurrentBalance;
        this.contractID = iContractID;
    }

    //Methods
    //add new damage.damage to related insurance.insurance
    //TODO implement method. Try/Catch? or Boolean?
    public Damage[] newDamage(){
        //TODO fill array
        //damage.damage [] arr =
        return null;
    }

    //edit damage.damage
    //TODO implement method
    public Boolean editDamage(){
        return true;
    }

    //toggle Active-Status of insurance.insurance, linked with endDate
    //TODO implement method
    public void toggleActive (){

    }

    //get corresponding damage to insurance.insurance
    //TODO implement method
    public Damage[] getRelatedDamage (){
        //TODO fill array
        //damage.damage [] arr =
        return null;
    }
}
