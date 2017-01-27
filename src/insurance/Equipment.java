/**
 *
 */
package insurance;

public class Equipment{

    public Equipment() {
    }

    public Equipment(String eqName, int eqEquipmentID, String eqDescription) {
        this.name = eqName;
        this.equipmentID = eqEquipmentID;
        this.description = eqDescription;
    }

    public String name;
    public int equipmentID;
    public String description;
}
