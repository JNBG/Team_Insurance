/**
 *
 */
package document;

public class Document {
    public Document() {
    }

    public Document(String dName, String dType, int dDocumentID) {
        this.name = dName;
        this.name = dType;
        this.documentID = dDocumentID;
    }

    public String name;
    public String type;             // .txt .pdf .odt ...
    public int documentID;          // unique ID of the document.document, also stored in Database


    public boolean changeName(String newName){
        this.name = newName;
        // save change in DB
        // if (successfull){
            return true;
        // } else {
        //  return false;
        // }
    }

}
