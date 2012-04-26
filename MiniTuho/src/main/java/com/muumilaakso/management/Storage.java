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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
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
        refs = new ArrayList<Reference>();
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
        output = new FileWriter(store);
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
//        importXML();
    }

    /**
     * Imports the database from a XML-file.
     */
    public void importXML() {
        
        builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setValidating(true);
        builderFactory.setNamespaceAware(true);
        File input = null;
        try {
            builder = builderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            System.out.println("Hobla habla cha-cha-cha");
        }
        try {
            input = new File("store.xml");
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
//            System.out.println(e.getNodeName());
            NodeList arvot = e.getChildNodes();
            for (int j = 0; j < arvot.getLength(); j++) {
                Reference curr = new Reference();
                if (arvot.item(j).getNodeValue() != null && !arvot.item(j).getNodeValue().contentEquals("\n")) {
                    System.out.println(arvot.item(j).getNodeValue());
                    if (e.getNodeName().equals("address")) {
                        curr.setAddress(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("annote")) {
                        curr.setAnnote(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("author")) {
                        //curr.setAuthor(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("booktitle")) {
                        curr.setBooktitle(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("chapter")) {
                        curr.setChapter(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("crossref")) {
                        curr.setCrossref(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("edition")) {
                        curr.setEdition(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("editor")) {
                        // curr.setEditor(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("eprint")) {
                        curr.setEprint(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("howpublished")) {
                        curr.setHowpublished(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("institution")) {
                        curr.setInstitution(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("journal")) {
                        curr.setJournal(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("key")) {
                        curr.setKey(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("month")) {
                        curr.setMonth(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("note")) {
                        curr.setNote(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("number")) {
                        curr.setNumber(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("organization")) {
                        curr.setOrganization(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("pages")) {
                        curr.setPages(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("publisher")) {
                        curr.setPublisher(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("school")) {
                        curr.setSchool(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("series")) {
                        curr.setSeries(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("title")) {
                        curr.setTitle(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("type")) {
                        curr.setType(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("url")) {
                        curr.setUrl(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("volume")) {
                        curr.setVolume(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("year")) {
                        curr.setYear(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("entrytype")) {
                        curr.setEntrytype(arvot.item(j).getNodeValue());
                    }
                    if (e.getNodeName().equals("tag")) {
                        curr.setTag(arvot.item(j).getNodeValue());
                    }
                    this.addRef(curr);
                }
            }
        }
        System.out.println("====");
    }
}
