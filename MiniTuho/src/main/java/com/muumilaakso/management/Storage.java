/*
 * Viitteet sisältävä tietorakenne.
 * 
 * Lisäys, poisto, haku, listaus.
 */
package com.muumilaakso.management;

import java.util.ArrayList;

/**
 *
 * @author Muumilaakso
 */
public class Storage {

    ArrayList<Reference> refs;

    public Storage() {
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
}
