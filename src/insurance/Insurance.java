package insurance;

import java.util.Calendar;
import damage.Damage;

/**
 * Created by Joscha on 04.01.2017.
 */

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
    public Calendar startDate;
    public Calendar endDate;
    public float currentBalance;
    protected Damage relatedDamages[];
    public int contactID;

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
