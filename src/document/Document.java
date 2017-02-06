/**
 * Basic data-Class for Documents
 */
package document;

public class Document {
    public Document() {
    }

    public String name;
    public String type;             // .txt .pdf .odt ...
    public int documentID;          // unique ID of the document.document, also stored in Database
}