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
        refs.add(testRef);
        testRef.setAddress("Muumitalo");
        testRef.setTitle("Muumilaakson tarinat");
        testRef.setBooktitle("Pikkumyy");
    }

    /**
     * Test of listMatching method, of class Search.
     */
    public void testlistMatching() {
        Reference tulos = testSearch.listMatching("Muumilaakso").get(0);
        
        assertTrue(tulos.getAttr().containsValue("Muumilaakson tarinat"));       
    }    
    
    /**
     * Test of listMatching method, of class Search.
     */
    public void testlistMatching_title() {
        Reference tulos = testSearch.listMatching("Muumilaakson tarinat",true).get(0);       
        
        assertTrue(tulos.getAttr().containsValue("Muumilaakson tarinat"));       
    }
    
    /**
     * Test of listMatching method, of class Search.
     */
    public void testlistMatching_notTitle() {
        Reference tulos = testSearch.listMatching("Pikkumyy").get(0);
        
        assertTrue(tulos.getAttr().containsValue("Pikkumyy"));       
    }
    
    /**
     * Test of listMatching method, of class Search.
     */
    public void testlistMatching_notFound() {
        ArrayList tulos = testSearch.listMatching("Haisuli"); 
        
        assertTrue(tulos.isEmpty());     
    }
    
    /**
     * Test of listMatching method, of class Search.
     */
    public void testlistMatching_titleNotFound() {
        ArrayList tulos = testSearch.listMatching("Muumimamman räiskäleet",true);       
        
        assertTrue(tulos.isEmpty());   
}
    
}
