/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muumilaakso.management;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Muumilaakso
 */
public class SearchTest extends TestCase {
    
    ArrayList<Reference> refs;
    Reference testRef;
    Storage testStorage;
    Search testSearch;
    
    public SearchTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        refs = new ArrayList<Reference>();
        this.testRef = new Reference();
        this.testStorage = new Storage();
        this.testSearch = new Search(refs);
    }

    /**
     * Test of listMatching(String haet) method, of class Search.
     */
    public void testlistMatching() {
        refs.add(testRef);
        testRef.setAddress("Muumitalo");
        testRef.setTitle("Muumilaakson tarinat");
        Reference tulos = testSearch.listMatching("Muumilaakso").get(0);
        
        assertTrue(tulos.getTitle().contains("Muumilaakson tarinat"));       
    }    
    
}
