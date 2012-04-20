/*
 * Viitteet sisältävä tietorakenne.
 * 
 * Lisäys, poisto, haku, listaus.
 */
package com.muumilaakso.management;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Muumilaakso
 */
public class Storage {

    ArrayList<Reference> refs;
    File store = new File("store.txt");
    FileWriter output; 

    public Storage() throws IOException {
        refs = new ArrayList<Reference>();
        output = new FileWriter(store);
    }

    /**
     * Viitteen lisäys tietorakenteeseen.
     *
     * @param ref Lisättävä viite
     */
    public void addRef(Reference ref) {
        if (!refs.contains(ref)) {
            refs.add(ref);
        } else {
            System.out.println("Viite on jo olemassa");
        }
    }

    /**
     * Viitteen poisto tietorakenteesta.
     *
     * @param ref Poistettava viite
     */
    public void remRef(Reference ref) {
        if (refs.contains(ref)) {
            refs.remove(ref);
        } else {
            System.out.println("Kyseistä viitettä ei ollut");
        }
    }

    /**
     * Palauttaa viitetietorakenteen.
     *
     * @return viittet
     */
    public ArrayList<Reference> getRefs() {
        return refs;
    }

    /**
     * Exports the arraylist to XML-file for easy importing action.
     */
    public void exportXML() throws IOException {
        String out = "";
        for (Reference reference : refs) {
            HashMap<String, String> attr = reference.getAttr();

            Iterator it = attr.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry pairs = (Map.Entry) it.next();
                String attrKey = pairs.getKey().toString();
                String attrValue = pairs.getValue().toString();
                out += "<" + attrKey + ">" + ":" + attrValue + "</" + attrKey + ">\n";
                output.append(out);
            }
        }
    }

    /**
     * Imports the database from a XML-file.
     */
    public void importXML() {
    }
}
