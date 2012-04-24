/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muumilaakso.management;

import java.util.ArrayList;
import java.util.HashMap;
import junit.framework.TestCase;

/**
 *
 * @author tkairola
 */
public class ReferenceTest extends TestCase {
    
    ArrayList<String> nimi1;
    ArrayList<String> nimi2;
    ArrayList<String> nimi3;
    HashMap<Integer, ArrayList<String>> nameList;
    Reference testRef;
    
    public ReferenceTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        this.testRef = new Reference();
        nimi1 = new ArrayList<String>();
        nimi2 = new ArrayList<String>();
        nimi3 = new ArrayList<String>();
        nameList = new HashMap<Integer, ArrayList<String>>();
    }

    /**
     * Test of setAuthor method, of class Reference.
     */
    public void testSetAuthor() {
        nimi1.add("Mikko");
        nimi1.add("Mallikas");
        nameList.put(0, nimi1);

        nimi2.add("Pekka");
        nimi2.add("Pouta");
        nimi2.add("Jr");
        nameList.put(1, nimi2);
        testRef.setAuthor(nameList);
        
        assertEquals(("Mallikas, Mikko and Pouta, Jr, Pekka"), testRef.getAuthor());
    }
    
    /**
     * Test of setAuthor method, of class Reference.
     */
    public void testSetAuthor2() {
        nimi1.clear();
        nimi2.clear();
        nimi3.clear();
        
        nimi1.add("Mikko");
        nimi1.add("Mallikas");
        nameList.put(0, nimi1);

        nimi2.add("Pekka");
        nimi2.add("Pouta");
        nameList.put(1, nimi2);
        
        nimi3.add("Sini");
        nimi3.add("Sininen");
        nameList.put(2, nimi3);
        testRef.setAuthor(nameList);
        
        assertEquals(("Mallikas, Mikko and Pouta, Pekka and Sininen, Sini"), testRef.getAuthor());
    }
    
    /**
     * Test of setEditor method, of class Reference.
     */
    public void testSetEditor() {
        nimi1.add("Mikko");
        nimi1.add("Mallikas");
        nameList.put(0, nimi1);

        nimi2.add("Pekka");
        nimi2.add("Pouta");
        nimi2.add("Jr");
        nameList.put(1, nimi2);
        testRef.setAuthor(nameList);
        
        assertEquals(("Mallikas, Mikko and Pouta, Jr, Pekka"), testRef.getAuthor());
    }
    
    /**
     * Test of setEditor method, of class Reference.
     */
     public void testSetEditor2() {
        nimi1.clear();
        nimi2.clear();
        nimi3.clear();
        
        nimi1.add("Mikko");
        nimi1.add("Mallikas");
        nameList.put(0, nimi1);

        nimi2.add("Pekka");
        nimi2.add("Pouta");
        nameList.put(1, nimi2);
        
        nimi3.add("Sini");
        nimi3.add("Sininen");
        nameList.put(2, nimi3);
        testRef.setAuthor(nameList);
        
        assertEquals(("Mallikas, Mikko and Pouta, Pekka and Sininen, Sini"), testRef.getAuthor());
    }
    

}
