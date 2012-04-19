/*
 * Viitteen hallinta.
 * 
 * Tietojen muokkaus, viitteen poisto.
 */
package com.muumilaakso.management;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Muumilaakso
 */
public class Modify {

    ArrayList<Reference> matches;
    Scanner lukija;
    Reference muokattava;
//    Reference uusi;

    public Modify() {
    }
    
    // Kälissä Etsi -toiminto antaa searchille parametreina viitelistan josta
    // etsitään ja käyttäjän syöttämän hakusanan

    // Etsitään listasta hakusanaa vastaavat viitteet
    public void search(ArrayList<Reference> refs, String etsittava) {
        lukija = new Scanner(System.in);
        Search etsi = new Search(refs);
        matches = etsi.listMatching(etsittava);
        System.out.println(matches); //nämä printataan kälissä isoon laatikkoon
    }
    
    // Kälissä käyttäjä valitsee listasta viitteen jota haluaa muokata ja
    // muokattava-metodi saa parametrinä käyttäjän valitseman viitteen
    // metodi tulostaa vitteen tiedot isoon laatikkoon

    // Tulostetaan käyttäjän listasta valitseman viitteen tiedot  
    public void muokattava(Reference muokattava) {
        this.muokattava = muokattava;
        System.out.println("1 " + muokattava.getAddress());
        System.out.println("2 " + muokattava.getAuthor());
        System.out.println("3 " + muokattava.getBooktitle());
        System.out.println("4 " + muokattava.getPages());
        System.out.println("5 " + muokattava.getPublisher());
        System.out.println("6 " + muokattava.getTitle());
        System.out.println("7 " + muokattava.getType());
        System.out.println("8 " + muokattava.getYear());
    }

    // Kälissä käyttäjä valitsee nyt minkä tiedon haluaa muokata.
    // Käyttäjä kirjoittaa ??? kenttään uuden tiedon.
    // uusiTieto saa parametrina numeron joka kertoo mitä muokataan ja
    // Stringinä uuden tiedon mikä tallennetaan sinne.
    
    // Vaihdetaan käyttäjän valitsema tieto uudeksi
    public void uusiTieto(int which, String uusi) {
        switch (which) {
            case 1:
                muokattava.setAddress(uusi);
                break;
                
            case 2:
                ArrayList authors = muokattava.getAuthor();
                authors.clear();
                authors.add(uusi);
                muokattava.setAuthor(authors);
                break;
                
            case 3:
                muokattava.setBooktitle(uusi);
                break;
                
            case 4:
                muokattava.setPages(uusi);
                break;
                
            case 5:
                muokattava.setPublisher(uusi);
                break;
                
            case 6:
                muokattava.setTitle(uusi);
                break;
                
            case 7:
                muokattava.setType(uusi);
                break;
                
            case 8:
                muokattava.setYear(Integer.parseInt(uusi));
                break; 
                
//            case 9:
//                matches.remove(muokattava); // poistaa viitteen listasta?
//                break;
        }
    }
}
