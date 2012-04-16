/*
 * Reference-tiedot.
 * 
 * Luokka hallitsee viitteeseen liittyviä tietoja.
 */
package com.muumilaakso.management;

import com.muumilaakso.io.BibTex;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Muumilaakso
 */
public class Reference {

    HashMap<String, String> attr;
    String address;
    String annote;
    String author;
    String booktitle;
    String chapter;
    String crossref;
    String edition;
    String editor;
    String eprint;
    String howpublished;
    String institution;
    String journal;
    String key;
    String month;
    String note;
    String number;
    String organization;
    String pages;
    String publisher;
    String school;
    String series;
    String title;
    String type;
    String url;
    String volume;
    String year;
    String entrytype;

    /**
     * Konstruktori
     */
    public Reference() {
        attr = new HashMap<String, String>();
    }

    // Getterit
    public String getAddress() {
        return address;
    }

    public String getAnnote() {
        return annote;
    }

    public String getAuthor() {
        return author;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public String getChapter() {
        return chapter;
    }

    public String getCrossref() {
        return crossref;
    }

    public String getEdition() {
        return edition;
    }

    public String getEditor() {
        return editor;
    }

    public String getEntrytype() {
        return entrytype;
    }

    public String getEprint() {
        return eprint;
    }

    public String getHowpublished() {
        return howpublished;
    }

    public String getInstitution() {
        return institution;
    }

    public String getJournal() {
        return journal;
    }

    public String getKey() {
        return key;
    }

    public String getMonth() {
        return month;
    }

    public String getNote() {
        return note;
    }

    public String getNumber() {
        return number;
    }

    public String getOrganization() {
        return organization;
    }

    public String getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getSchool() {
        return school;
    }

    public String getSeries() {
        return series;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getVolume() {
        return volume;
    }

    public String getYear() {
        return year;
    }

    public HashMap<String, String> getAttr() {
        return attr;
    }

    //Setterit
    public void setAddress(String address) {
        this.address = address;
        attr.put("address", this.address);
    }

    public void setAnnote(String annote) {
        this.annote = annote;
        attr.put("annote", this.annote);
    }

    public void setAuthor(HashMap<Integer, ArrayList<String>> authors) {
        String nimet = "";

        if (authors.size() == 1) {
            if (authors.get(0).size() > 2) {
                nimet += nimet + authors.get(0).get(1) + ", " + authors.get(0).get(2) + ", " + authors.get(0).get(0);
            } else {
                nimet += nimet + authors.get(0).get(1) + ", " + authors.get(0).get(0);
            }
            this.author = nimet;
        } else if (authors.size() > 1) {
            for (int i = 0; i < authors.size(); i++) {
                nimet += nimet + authors.get(0).get(0) + " " + authors.get(0).get(1) + " " + authors.get(0).get(2);
                if (i != authors.size() - 1) {
                    nimet += "and ";
                }
            }
            this.author = nimet;
        }
        attr.put("author", this.author);
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
        attr.put("booktitle", this.booktitle);
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
        attr.put("chapter", this.chapter);
    }

    public void setCrossref(String crossref) {
        this.crossref = crossref;
        attr.put("crossref", this.crossref);
    }

    public void setEdition(String edition) {
        this.edition = edition;
        attr.put("edition", this.edition);
    }

    public void setEditor(HashMap<Integer, ArrayList<String>> editors) {
        String edit = "";

        if (editors.size() == 1) {
            if (editors.get(0).size() > 2) {
                edit += edit + editors.get(0).get(1) + ", " + editors.get(0).get(2) + ", " + editors.get(0).get(0);
            } else {
                edit += edit + editors.get(0).get(1) + ", " + editors.get(0).get(0);
            }
            this.author = edit;
        } else if (editors.size() > 1) {
            for (int i = 0; i < editors.size(); i++) {
                edit += edit + editors.get(0).get(0) + " " + editors.get(0).get(1) + " " + editors.get(0).get(2);
                if (i != editors.size() - 1) {
                    edit += "and ";
                }
            }
            this.author = edit;
        }
        attr.put("editor", this.editor);
    }

    public void setEntrytype(String entrytype) {
        this.entrytype = entrytype;
    }

    public void setEprint(String eprint) {
        this.eprint = eprint;
        attr.put("eprint", this.eprint);
    }

    public void setHowpublished(String howpublished) {
        this.howpublished = howpublished;
        attr.put("howpublished", this.howpublished);
    }

    public void setInstitution(String institution) {
        this.institution = institution;
        attr.put("institution", this.institution);
    }

    public void setJournal(String journal) {
        this.journal = journal;
        attr.put("journal", this.journal);
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setMonth(String month) {
        this.month = month;
        attr.put("month", this.month);
    }

    public void setNote(String note) {
        this.note = note;
        attr.put("note", this.note);
    }

    public void setNumber(String number) {
        this.number = number;
        attr.put("number", this.number);
    }

    public void setOrganization(String organization) {
        this.organization = organization;
        attr.put("organization", this.organization);
    }

    public void setPages(String pages) {
        this.pages = pages;
        attr.put("pages", this.pages);
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
        attr.put("publisher", this.publisher);
    }

    public void setSchool(String school) {
        this.school = school;
        attr.put("school", this.school);
    }

    public void setSeries(String series) {
        this.series = series;
        attr.put("series", this.series);
    }

    public void setTitle(String title) {
        this.title = title;
        attr.put("title", this.title);
    }

    public void setType(String type) {
        this.type = type;
        attr.put("type", this.type);
    }

    public void setUrl(String url) {
        this.url = url;
        attr.put("url", this.url);
    }

    public void setVolume(String volume) {
        this.volume = volume;
        attr.put("volume", this.volume);
    }

    public void setYear(String year) {
        this.year = year;
        attr.put("year", this.year);
    }

    public static void main(String[] args) throws IOException {
        Reference uusi = new Reference();

        uusi.author = "puu, pekka";
        uusi.journal = "PUU";


        ArrayList<Reference> r = new ArrayList<Reference>();
        r.add(uusi);
        BibTex b = new BibTex(r);
        b.printBibTex();
    }
}
