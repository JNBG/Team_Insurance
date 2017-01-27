/**
 *
 */
package damage;

import java.util.Calendar;

public class Damage {
    public Damage() {
    }

    public String description;
    public String relatedCustomerName;
    public String relatedInsuranceName;
    public Calendar dateOfIncident;
    public Calendar dateOfReport;
    public int amountOfLoss;            // monetary damage.damage
    public int reserve;                 // available Money to regulate the damage.damage
}
