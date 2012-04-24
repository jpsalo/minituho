/*
 * Viitteet sisältävä tietorakenne.
 * 
 * Lisäys, poisto, haku, listaus.
 */
package com.muumilaakso.management;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Muumilaakso
 */
public class Storage {

    org.w3c.dom.Document document;
    DocumentBuilderFactory builderFactory;
    DocumentBuilder builder = null;
    ArrayList<Reference> refs;
    File store = new File("store.xml");
    FileWriter output;

    public Storage() throws IOException {  
        builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setValidating(true);
        builderFactory.setNamespaceAware(true);
        try {
            builder = builderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            System.out.println("Hobla habla cha-cha-cha");
        }

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
        String alku = "<?xml version=" + "\"1.0\"?>\n";
        output.append(alku);
        for (Reference reference : refs) {
            output.append("<reference>\n");
            output.append("<key>" + reference.getKey() + "</key>\n");
            output.append("<entryType>" + reference.getEntrytype() + "</entryType>\n");

            HashMap<String, String> attr = reference.getAttr();
            Iterator it = attr.entrySet().iterator();

            while (it.hasNext()) {
                String out = "";
                Map.Entry pairs = (Map.Entry) it.next(); 
                String attrKey = pairs.getKey().toString();
                String attrValue = pairs.getValue().toString();
                out += "<" + attrKey + ">" + attrValue + "</" + attrKey + ">\n";
                output.append(out);
            }

            output.append("</reference>\n");
        }
        output.close();
        importXML();
    }

    /**
     * Imports the database from a XML-file.
     */
    public void importXML() {
        File input = new File("store.xml");
        try {
            document = builder.parse(input);
        } catch (SAXException ex) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
        }        
        System.out.println("====");
        NodeList lista = document.getElementsByTagName("*");
        for (int i = 0; i < lista.getLength(); i++) {
            Element e = (Element) lista.item(i);
            System.out.println(e.getNodeName());
            NodeList arvot = e.getChildNodes();
            for (int j = 0; j < arvot.getLength(); j++) {
                System.out.println(arvot.item(j).getNodeValue());
            }
        }
        System.out.println("====");
    }
}
