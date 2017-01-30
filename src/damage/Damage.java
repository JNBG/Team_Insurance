/**
 *
 */
package damage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Damage {
    public Damage() {
    }

    /**
     *
     * @param dDescrip Description of the Damage
     * @param dRelatedCustomerName Name of the Policyholder
     * @param dRelatedContractID Contract-ID of the related Insurance
     * @param dDateOfIncident Date the Incident happened in format dd.mm.yyyy
     * @param dDateOfReport Date the Incident was reported in format dd.mm.yyyy
     * @param dAmountOfLoss Monetary amount of damage
     * @param dReserve Available Money to regulate the damage.damage
     */
    public Damage (String dDescrip, String dRelatedCustomerName, int dRelatedContractID, String dDateOfIncident, String dDateOfReport, int dAmountOfLoss, int dReserve){
        this.description = dDescrip;
        this.relatedCustomerName = dRelatedCustomerName;
        this.relatedContractID = dRelatedContractID;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            this.dateOfIncident = formatter.parse(dDateOfIncident);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            this.dateOfReport = formatter.parse(dDateOfReport);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.amountOfLoss = dAmountOfLoss;
        this.reserve = dReserve;
    }

    public String description;
    public String relatedCustomerName;
    public int relatedContractID;
    public Date dateOfIncident;
    public Date dateOfReport;
    public int amountOfLoss;
    public int reserve;
}
