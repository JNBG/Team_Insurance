/**
 *
 */
package insurance;

//Subclass for Car-Insurances
public class CarInsurance extends Insurance {
    public CarInsurance() {
    }

    //Attributes
    public String licensePlate;
    public String brand;
    public String model;
    public int buildYear;
    public int mileage;
    public int estMileage;
    public int tuev;
    public String[] registeredDrivers;
}
