/*
 * Reference-tiedot.
 * 
 * Luokka hallitsee viitteeseen liittyviä tietoja.
 */
package com.muumilaakso.management;

import java.util.ArrayList;

/**
 *
 * @author Muumilaakso
 */
public class Reference {

    String type;
    ArrayList<String> author;
    String title;
    int year;
    String booktitle;
    String publisher;
    String pages;
    String address;

    /**
     * Viitteen tiedot
     *
     * @param type viitteen tyyppi
     * @param author tekijä(t)
     * @param title teoksen nimi
     * @param year tekovuosi
     * @param booktitle
     * @param publisher julkaisija
     * @param pages sivumäärä
     * @param address osoite
     */
    public Reference(String type, ArrayList<String> author, String title, int year,
            String booktitle, String publisher, String pages, String address) {
        this.type = type;
        this.author = author;
        this.title = title;
        this.year = year;
        this.booktitle = booktitle;
        this.publisher = publisher;
        this.pages = pages;
        this.address = address;
    }

    //
    // Getterit
    //
    public String getAddress() {
        return address;
    }

    public ArrayList<String> getAuthor() {
        return author;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public String getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    //
    // Setterit
    //
    public void setAddress(String address) {
        this.address = address;
    }

    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Viitteen tietojen tulostus.
     *
     * @return viite
     */
    @Override
    public String toString() {
        String viite = "";

        // Tyyppi
        if (!type.isEmpty()) {
            viite += "Type" + type + "\n";
        }

        // Tekijä
        if (!author.isEmpty()) {
            System.out.print("Author: ");
            for (String auth : author) {
                viite += auth + ", " + "\n";
            }
        }

        // Teoksen nimi
        if (!title.isEmpty()) {
            viite += "Title: " + title + "\n";
        }

        // Tekovuosi
        if (year != 0) {
            viite += "Year: " + year + "\n";
        }

        // Booktitle
        if (!booktitle.isEmpty()) {
            viite += "Book title: " + booktitle + "\n";
        }

        // Julkaisija
        if (!publisher.isEmpty()) {
            viite += "Publisher: " + publisher + "\n";
        }

        // Sivumäärä
        if (!pages.isEmpty()) {
            viite += "Pages: " + pages + "\n";
        }

        // Osoite
        if (!address.isEmpty()) {
            viite += "Address: " + address + "\n";
        }

        return viite;
    }
}