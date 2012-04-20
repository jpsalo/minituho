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
 * @author henriyli
 */
public class SearchTest extends TestCase {
    ArrayList<Reference> refs = new ArrayList();
    Reference testRef;
    Search haku; 
    public SearchTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.testRef = new Reference();
        String type = "type";
        HashMap<Integer, ArrayList<String>> author = new HashMap<Integer, ArrayList<String>>();
        ArrayList<String> arska = new ArrayList<String>();
        arska.add("author1");
        author.put(0, arska);
        String title = "title";
        String booktitle = "booktitle";
        String publisher = "publisher";
        String pages = "pages";
        String address = "address";
        this.testRef.setAddress(address);
        this.testRef.setPages(pages);
        this.testRef.setPublisher(publisher);
        this.testRef.setBooktitle(booktitle);
        this.testRef.setTitle(title);
        this.testRef.setType(type);
        this.testRef.setYear("1992");
        haku = new Search(refs);
        //this.testRef.setAuthor(author);
        
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of listMatching method, of class Search.
     */
    public void testListMatching_String() {
        System.out.println("listMatching");
        String haet = "booktitle";
        ArrayList expResult = new ArrayList();
        expResult.add(haet);
        ArrayList result = haku.listMatching(haet);
        assertEquals(expResult, result);
    }

}
