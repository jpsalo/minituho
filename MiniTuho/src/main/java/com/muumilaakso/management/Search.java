/*
 * Viitteiden haku.
 * 
 * Listaa hakusanaa vastaavat viitteet
 */
package com.muumilaakso.management;

import java.util.ArrayList;

/**
 *
 * @author Muumilaakso
 */
public class Search {

    ArrayList<Reference> refs;
    ArrayList<Reference> matchinRefs;

    public Search(ArrayList<Reference> refs) {
        this.refs = refs;
    }

    /**
     * Tyyppi.
     *
     * @param type Tyyppi
     * @return matchinRefs Hakua vastaavat viitteet.
     */
    public ArrayList<Reference> listMatchingType(String type) {
        for (Reference reference : refs) {
            if (reference.getType().contains(type)) {
                listRefs(reference);
            }
        }
        return matchinRefs;
    }

    /**
     * Tekijä.
     *
     * @param author Tekijä
     * @return matchinRefs Hakua vastaavat viitteet.
     */
    public ArrayList<Reference> listMatchingAuthor(String author) {
        for (Reference reference : refs) {
            for (String auth : reference.getAuthor()) {
                if (auth.contains(author)) {
                    listRefs(reference);
                    break;
                }
            }
        }
        return matchinRefs;
    }

    /**
     * Vuosi.
     *
     * @param year Vuosi
     * @return matchinRefs Hakua vastaavat viitteet.
     */
    public ArrayList<Reference> listYear(int year) {
        for (Reference reference : refs) {
            if (reference.getYear() == year) {
                listRefs(reference);
            }
        }
        return matchinRefs;
    }

    /**
     * Booktitle.
     *
     * @param booktitle Booktitle
     * @return matchinRefs Hakua vastaavat viitteet.
     */
    public ArrayList<Reference> listMatchingBooktitle(String booktitle) {
        for (Reference reference : refs) {
            if (reference.getBooktitle().contains(booktitle)) {
                listRefs(reference);
            }
        }
        return matchinRefs;
    }

    /**
     * Julkaisija.
     *
     * @param publisher Julkaisija
     * @return matchinRefs Hakua vastaavat viitteet.
     */
    public ArrayList<Reference> listPublisher(String publisher) {
        for (Reference reference : refs) {
            if (reference.getPublisher().contains(publisher)) {
                listRefs(reference);
            }
        }
        return matchinRefs;
    }

    /**
     * Osoite.
     *
     * @param address Osoite
     * @return matchinRefs Hakua vastaavat viitteet.
     */
    public ArrayList<Reference> listMatchingAddress(String address) {
        for (Reference reference : refs) {
            if (reference.getAddress().contains(address)) {
                listRefs(reference);
            }
        }
        return matchinRefs;
    }

    /**
     * Listaa kaikki viitteet.
     */
    public void listAll() {
        for (Reference reference : refs) {
            listRefs(reference);
        }
    }

    /**
     * Listaa viitteen tiedot.
     *
     * Hakumetodit kutsuvat tätä, kun löydetään osuma viitteestä.
     *
     * @param reference Viite
     */
    private void listRefs(Reference reference) {

        // Tyyppi
        String type = reference.getType();
        if (!type.isEmpty()) {
            System.out.println("Type: " + type);
        }

        // Tekijä
        ArrayList<String> author = reference.getAuthor();
        if (!author.isEmpty()) {
            System.out.print("Author: ");
            for (String auth : author) {
                System.out.print(auth + ", ");
            }
        }

        // Teoksen nimi
        String title = reference.getTitle();
        if (!title.isEmpty()) {
            System.out.println("Title: " + title);
        }

        // Tekovuosi
        int year = reference.getYear();
        if (year != 0) {
            System.out.println("Year: " + year);
        }

        // Booktitle
        String booktitle = reference.getBooktitle();
        if (!booktitle.isEmpty()) {
            System.out.println("Book title: " + booktitle);
        }

        // Julkaisija
        String publisher = reference.getPublisher();
        if (!publisher.isEmpty()) {
            System.out.println("Publisher: " + publisher);
        }

        // Sivumäärä
        String pages = reference.getPages();
        if (!pages.isEmpty()) {
            System.out.println("Pages: " + pages);
        }

        // Osoite
        String address = reference.getAddress();
        if (!address.isEmpty()) {
            System.out.println("Address: " + address);
        }
        addMatchinRef(reference);
    }

    private void addMatchinRef(Reference ref) {
        if (matchinRefs == null) {
            matchinRefs = new ArrayList<Reference>();
        }
        matchinRefs.add(ref);
    }
}
