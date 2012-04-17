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

//        matchinRefs.clear();

//        luupataan viitteet läpi
        for (Reference reference : refs) {

            for (String attribute : reference.getAttr().values()) {
                if (attribute != null && !attribute.isEmpty()) {
                    if (attribute.contains(haet)) {
                        addMatchinRef(reference);
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
