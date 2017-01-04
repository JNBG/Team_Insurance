import java.util.Calendar;

/**
 * Created by Philipp on 04.01.2017.
 */
public class Damage {
    public Damage() {
    }

    public String description;
    public String relatedCustomerName;
    public String relatedInsuranceName;
    public Calendar dateOfIncident;
    public Calendar dateOfReport;
    public int amountOfLoss;            // monetary Damage
    public int reserve;                 // available Money to regulate the Damage
}
