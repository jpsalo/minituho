/*
 * Viitteet sisältävä tietorakenne
 */
package com.muumilaakso.management;

import java.util.ArrayList;

/**
 *
 * @author Muumilaakso
 */
public class Storage {

    ArrayList<Viite> viitteet;

    public Storage() {
        viitteet = new ArrayList<Viite>();
    }

    /**
     * Viitteen lisäys tietorakenteeseen
     * 
     * @param viite Lisättävä viite
     */
    public void lisaaViite(Viite viite) {
        if (!viitteet.contains(viite)) {
            viitteet.add(viite);
        } else {
            System.out.println("On jo");
        }
    }

    /**
     * Viitteen poisto tietorakenteesta
     * 
     * @param viite Poistettava viite
     */
    public void poistaViite(Viite viite) {
        if (viitteet.contains(viite)) {
            viitteet.remove(viite);
        } else {
            System.out.println("Ei ollut!");
        }
    }
}
