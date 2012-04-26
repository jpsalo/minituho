/*
 * Reference-tiedot.
 * 
 * Luokka hallitsee viitteeseen liittyviä tietoja.
 */
package com.muumilaakso.management;

import java.util.*;

/**
 *
 * @author Muumilaakso
 */
public class Reference {

    private HashMap<String, String> attr;
    private String address;
    private String annote;
    private String author;
    private String booktitle;
    private String chapter;
    private String crossref;
    private String edition;
    private String editor;
    private String eprint;
    private String howpublished;
    private String institution;
    private String journal;
    private String key;
    private String month;
    private String note;
    private String number;
    private String organization;
    private String pages;
    private String publisher;
    private String school;
    private String series;
    private String title;
    private String type;
    private String url;
    private String volume;
    private String year;
    private String entrytype;
    private String tag;

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

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
            attr.put("authors", this.author);
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

    public void setEditor(String editor) {
        if (editor != null && !editor.isEmpty()) {
            this.editor = editor;
            attr.put("editors", this.editor);
        }
    }

    public void setEntrytype(String entrytype) {
        this.entrytype = entrytype;
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

    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        if (tag == null) {
            this.tag = tag;
        } else {
            this.tag += " " + tag;
        }
    }
}
