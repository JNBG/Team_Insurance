package Insurance;

import java.util.Calendar;

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
    public int contactID

    //Methods
    //add new Damage.Damage to related Insurance.Insurance
    //TODO implement method. Try/Catch? or Boolean?
    public Damage[] newDamage(){
        //TODO fill array
        //Damage.Damage [] arr =
        return arr;
    }

    //edit Damage.Damage
    //TODO implement method
    public Boolean editDamage(){
        return true;
    }

    //toggle Active-Status of Insurance.Insurance, linked with endDate
    //TODO implement method
    public void toggleActive (){

    }

    //get corresponding damage to Insurance.Insurance
    //TODO implement method
    public Damage[] getRelatedDamage (){
        //TODO fill array
        //Damage.Damage [] arr =
        return arr;
    }
}
