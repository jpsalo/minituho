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

    ArrayList<Reference> refs, matchinRefs;

    public Search(ArrayList<Reference> refs) {
        this.refs = refs;
    }

    /**
     * Haku.
     *
     * Hakutermillä haetaan viitteen kaikista attribuuteista ja osumat lisätään
     * listaan.
     *
     * @param haet Hakutermi
     * @return matchinRefs Hakua vastaavat viitteet.
     */
    public ArrayList<Reference> listMatching(String haet) {

        matchinRefs.clear();

//        luupataan viitteet läpi
        for (Reference reference : refs) {

            if (reference.getType().contains(haet)) {                   // tyyppi
                addMatchinRef(reference);
            } else if (reference.getBooktitle().contains(haet)) {       // otsikko
                addMatchinRef(reference);
            } else if (reference.getYear() == Integer.parseInt(haet)) { // vuosi
                addMatchinRef(reference);
            } else if (reference.getPublisher().contains(haet)) {       // julkaisija
                addMatchinRef(reference);
            } else if (reference.getAddress().contains(haet)) {         // osoite
                addMatchinRef(reference);
            } else {
                for (String auth : reference.getAuthor()) {             // tekijät
                    if (auth.contains(haet)) {
                        addMatchinRef(reference);
                        break;
                    }
                }
            }
        }
        return matchinRefs;
    }

    /**
     * Hakua vastaavat viitteet.
     *
     * @param ref Haettu viite
     */
    private void addMatchinRef(Reference ref) {
        if (matchinRefs == null) {
            matchinRefs = new ArrayList<Reference>();
        }
        matchinRefs.add(ref);
    }

    /**
     * Tulostaa löydetyt viitteet.
     */
    public void printMatches() {
        for (Reference reference : matchinRefs) {
            System.out.println(reference.toString());
        }
    }
}
