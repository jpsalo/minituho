/*
 * Viite
 */
package com.muumilaakso.management;

import java.util.ArrayList;

/**
 *
 * @author Muumilaakso
 */
public class Viite {
    String type;                // viitteen tyyppi
    ArrayList<String> author;   // tekijä(t)
    String title;               // teoksen nimi
    int year;                   // tekovuosi
    String booktitle;           // 
    String publisher;           // julkaisija
    String pages;               // sivumäärä'
    String address;
    
    /**
     * Viitteen tiedot
     * 
     * @param type
     * @param author
     * @param title
     * @param year
     * @param booktitle
     * @param publisher
     * @param pages
     * @param address 
     */
    public Viite(String type, ArrayList<String> author, String title, int year,
            String booktitle, String publisher, String pages, String address) {
        
    }
}
