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
public class Storage implements StorageIO {

    ArrayList<Reference> viitteet;

    public Storage() {
        viitteet = new ArrayList<Reference>();
    }

    /**
     * Viitteen lisäys tietorakenteeseen.
     *
     * @param ref Lisättävä ref
     */
    @Override
    public void addRef(Reference ref) {
        if (!viitteet.contains(ref)) {
            viitteet.add(ref);
        } else {
            System.out.println("Viite on jo olemassa");
        }
    }

    /**
     * Viitteen poisto tietorakenteesta.
     *
     * @param viite Poistettava viite
     */
    @Override
    public void remRef(Reference viite) {
        if (viitteet.contains(viite)) {
            viitteet.remove(viite);
        } else {
            System.out.println("Kyseistä viitettä ei ollut");
        }
    }

    /**
     * Palauttaa viitetietorakenteen.
     *
     * @return viittet
     */
    @Override
    public ArrayList<Reference> getViitteet() {
        return viitteet;
    }
}
