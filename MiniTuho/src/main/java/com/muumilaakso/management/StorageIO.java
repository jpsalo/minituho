/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muumilaakso.management;

import java.util.ArrayList;

/**
 *
 * @author jusalo
 */
public interface StorageIO {
    public void addRef(Reference ref);
    public void remRef(Reference ref);
    public ArrayList<Reference> getRefs();
}
