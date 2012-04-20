/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muumilaakso.io;

import com.muumilaakso.management.Reference;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muumilaakso
 */
public class BibTex {

    FileWriter out;
    BufferedWriter writer;
    ArrayList<Reference> viitteet;

    /**
     * Konstruktori
     * 
     * @param viitteet ArrayList
     */
    public BibTex(ArrayList<Reference> viitteet) {
        this.viitteet = viitteet;
        createWriter();
    }
/**
 * Luo uuden FileWriter
 */
    public final void createWriter() {
        try {
            out = new FileWriter("BibTex.bib");
            writer = new BufferedWriter(out);
        } catch (IOException ex) {
            Logger.getLogger(BibTex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void printBibTex() throws IOException {
        for (int i = 0; i < viitteet.size(); i++) {
            writer.write("@");
            writer.write(viitteet.get(i).getEntrytype());
            writer.write('{');
            writer.write(viitteet.get(i).getKey());
            writer.write(',');
            writer.write('\n');

            HashMap temp = viitteet.get(i).getAttr();
            Set set = temp.entrySet();
            Iterator iter = set.iterator();

            while (iter.hasNext()) {
                Map.Entry me = (Map.Entry) iter.next();
                writer.write(me.getKey().toString());
                writer.write('\t');
                writer.write("= ");
                writer.write("{" + me.getValue().toString() + "},");
                writer.write('\n');
            }
            writer.write('}');
            writer.write('\n');
            writer.write('\n');
        }
        writer.close();
    }
}
