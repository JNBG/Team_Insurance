package document;

/**
 * Created by Philipp on 04.01.2017.
 */
public class Document {
    public Document() {
    }

    public String name;
    public String type;             // .txt .pdf .odt ...
    public int documentID;          // unique ID of the document.document, also stored in Database
}
