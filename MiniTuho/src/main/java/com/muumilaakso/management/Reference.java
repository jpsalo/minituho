/*
 * Reference-tiedot.
 * 
 * Luokka hallitsee viitteeseen liittyviä tietoja.
 */
package com.muumilaakso.management;

import com.muumilaakso.io.BibTex;
import java.io.IOException;
import java.util.*;

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
        if (address != null && !address.isEmpty()) {
            this.address = address;
            attr.put("address", this.address);
        }
    }

    public void setAnnote(String annote) {
        if (annote != null && !annote.isEmpty()) {
            this.annote = annote;
            attr.put("annote", this.annote);
        }
    }

    public void setAuthor(HashMap<Integer, ArrayList<String>> authors) {
        if (authors != null && !authors.isEmpty()) {

            String nimet = "";
            Set set = authors.entrySet();

            if (!set.isEmpty()) {

                Iterator iter = set.iterator();
                Map.Entry me;
                ArrayList<String> temp;

                if (authors.size() == 1) {
                    me = (Map.Entry) iter.next();
                    temp = (ArrayList) me.getValue();
                    if (temp.size() > 2) {
                        nimet += nimet + temp.get(1) + ", " + temp.get(2) + ", " + temp.get(0);
                    } else {
                        nimet += nimet + temp.get(1) + ", " + temp.get(0);
                    }
                    this.author = nimet;
                } else if (authors.size() > 1) {
                    while (iter.hasNext()) {
                        me = (Map.Entry) iter.next();
                        temp = (ArrayList) me.getValue();
                        if (temp.size() > 2) {
                            nimet += temp.get(1) + ", " + temp.get(2) + ", " + temp.get(0);
                        } else {
                            nimet += temp.get(1) + ", " + temp.get(0);
                        }
                        if (iter.hasNext()) {
                            nimet += " and ";
                        }
                    }
                    this.author = nimet;
                }
                attr.put("author", this.author);
            }
        }
    }

    public void setBooktitle(String booktitle) {
        if (booktitle != null && !booktitle.isEmpty()) {
            this.booktitle = booktitle;
            attr.put("booktitle", this.booktitle);
        }
    }

    public void setChapter(String chapter) {
        if (chapter != null && !chapter.isEmpty()) {
            this.chapter = chapter;
            attr.put("chapter", this.chapter);
        }
    }

    public void setCrossref(String crossref) {
        if (crossref != null && !crossref.isEmpty()) {
            this.crossref = crossref;
            attr.put("crossref", this.crossref);
        }
    }

    public void setEdition(String edition) {
        if (edition != null && !edition.isEmpty()) {
            this.edition = edition;
            attr.put("edition", this.edition);
        }
    }

    public void setEditor(HashMap<Integer, ArrayList<String>> editors) {
        if (editors != null && editors.isEmpty()) {

            String editorit = "";
            Set set = editors.entrySet();

            if (!set.isEmpty()) {

                Iterator iter = set.iterator();
                Map.Entry me;
                ArrayList<String> temp;

                if (editors.size() == 1) {
                    me = (Map.Entry) iter.next();
                    temp = (ArrayList) me.getValue();
                    if (temp.size() > 2) {
                        editorit += editorit + temp.get(1) + ", " + temp.get(2) + ", " + temp.get(0);
                    } else {
                        editorit += editorit + temp.get(1) + ", " + temp.get(0);
                    }
                    this.editor = editorit;
                } else if (editors.size() > 1) {
                    while (iter.hasNext()) {
                        me = (Map.Entry) iter.next();
                        temp = (ArrayList) me.getValue();
                        if (temp.size() > 2) {
                            editorit += temp.get(1) + ", " + temp.get(2) + ", " + temp.get(0);
                        } else {
                            editorit += temp.get(1) + ", " + temp.get(0);
                        }
                        if (iter.hasNext()) {
                            editorit += "and ";
                        }
                    }
                    this.editor = editorit;
                }
                attr.put("editor", this.editor);
            }
        }
    }

    public void setEntrytype(String entrytype) {
        if (entrytype != null && !entrytype.isEmpty()) {
            this.entrytype = entrytype;
        }
    }

    public void setEprint(String eprint) {
        if (eprint != null && !eprint.isEmpty()) {
            this.eprint = eprint;
            attr.put("eprint", this.eprint);
        }
    }

    public void setHowpublished(String howpublished) {
        if (howpublished != null && !howpublished.isEmpty()) {
            this.howpublished = howpublished;
            attr.put("howpublished", this.howpublished);
        }
    }

    public void setInstitution(String institution) {
        if (institution != null && !institution.isEmpty()) {
            this.institution = institution;
            attr.put("institution", this.institution);
        }
    }

    public void setJournal(String journal) {
        if (journal != null && !journal.isEmpty()) {
            this.journal = journal;
            attr.put("journal", this.journal);
        }
    }

    public void setKey(String key) {
        if (key != null && !key.isEmpty()) {
            this.key = key;
        }
    }

    public void setMonth(String month) {
        if (month != null && !month.isEmpty()) {
            this.month = month;
            attr.put("month", this.month);
        }
    }

    public void setNote(String note) {
        if (note != null && !note.isEmpty()) {
            this.note = note;
            attr.put("note", this.note);
        }
    }

    public void setNumber(String number) {
        if (number != null && !number.isEmpty()) {
            this.number = number;
            attr.put("number", this.number);
        }
    }

    public void setOrganization(String organization) {
        if (organization != null && !organization.isEmpty()) {
            this.organization = organization;
            attr.put("organization", this.organization);
        }
    }

    public void setPages(String pages) {
        if (pages != null && !pages.isEmpty()) {
            this.pages = pages;
            attr.put("pages", this.pages);
        }
    }

    public void setPublisher(String publisher) {
        if (publisher != null && !publisher.isEmpty()) {
            this.publisher = publisher;
            attr.put("publisher", this.publisher);
        }
    }

    public void setSchool(String school) {
        if (school != null && !school.isEmpty()) {
            this.school = school;
            attr.put("school", this.school);
        }
    }

    public void setSeries(String series) {
        if (series != null && !series.isEmpty()) {
            this.series = series;
            attr.put("series", this.series);
        }
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
            attr.put("title", this.title);
        }
    }

    public void setType(String type) {
        if (type != null && !type.isEmpty()) {
            this.type = type;
            attr.put("type", this.type);
        }
    }

    public void setUrl(String url) {
        if (url != null && !url.isEmpty()) {
            this.url = url;
            attr.put("url", this.url);
        }
    }

    public void setVolume(String volume) {
        if (volume != null && !volume.isEmpty()) {
            this.volume = volume;
            attr.put("volume", this.volume);
        }
    }

    public void setYear(String year) {
        if (year != null && !year.isEmpty()) {
            this.year = year;
            attr.put("year", this.year);
        }
    }
//    public static void main(String[] args) throws IOException {
//
//        Reference ref_1;
//        Reference ref_2;
//        HashMap<Integer, ArrayList<String>> map_1;
//        HashMap<Integer, ArrayList<String>> map_2;
//        ArrayList list_1;
//        ArrayList list_2;
//        ArrayList<Reference> refs;
//
//
//
//        refs = new ArrayList<Reference>();
//        //reference 1
//        ref_1 = new Reference();
//        map_1 = new HashMap();
//        list_1 = new ArrayList<String>();
//
//        list_1.add("Hannu");
//        list_1.add("Huttunen");
//        list_1.add("Jr.");
//        map_1.put(0, list_1);
//
//        ref_1.setEntrytype("article");
//        ref_1.setKey("artc1");
//        ref_1.setAuthor(map_1);
//        ref_1.setPages("200");
//        ref_1.setYear("2011");
//        ref_1.setMonth("oct");
//
//        //reference 2
//        ref_2 = new Reference();
//        map_2 = new HashMap();
//        list_2 = new ArrayList<String>();
//        list_2.add("John");
//        list_2.add("Doe");
//        list_2.add("Sr.");
//        map_2.put(0, list_2);
//        ArrayList<String> list_3 = new ArrayList<String>();
//        list_3.add("Mary");
//        list_3.add("Sue");
//        list_3.add("Ms.");
//        map_2.put(1, list_3);
//
//        ref_2.setEntrytype("article");
//        ref_2.setKey("artc2");
//        ref_2.setAuthor(map_2);
//        ref_2.setPages("600");
//        ref_2.setYear("2010");
//
//        refs.add(ref_1);
//        refs.add(ref_2);
//
//        BibTex bt = new BibTex(refs);
//        bt.printBibTex();
//    }
}
