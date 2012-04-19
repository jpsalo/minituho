/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muumilaakso.io;

import com.muumilaakso.management.Reference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import junit.framework.TestCase;

/**
 *
 * @author hannahir
 */
public class TestBibTex extends TestCase {
    
    Reference ref_1;
    Reference ref_2;
    HashMap<Integer, ArrayList<String>> map_1;
    HashMap<Integer, ArrayList<String>> map_2;
    ArrayList list_1;
    ArrayList list_2;
    ArrayList<Reference> refs;
    
    public TestBibTex(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        refs = new ArrayList<Reference>();
        //reference 1
        ref_1 = new Reference();
        map_1 = new HashMap();
        list_1 = new ArrayList<String>();

        list_1.add("Hannu");
        list_1.add("Huttunen");
        list_1.add("Jr.");
        map_1.put(1, list_1);
        
//        ref_1.setEntrytype("article");
        ref_1.setKey("artc1");
        ref_1.setAuthor(map_1);
        ref_1.setPages("200");
        ref_1.setYear("2011");
        ref_1.setMonth("oct");
        
        //reference 2
//        ref_2 = new Reference();
//        map_2 = new HashMap();
//        list_2 = new ArrayList<String>();
//        list_2.add("John");
//        list_2.add("Doe");
//        list_2.add("Sr.");
//        map_2.put(1, list_2);
//        
//        ref_2.setEntrytype("article");
//        ref_2.setKey("artc1");
//        ref_2.setAuthor(map_2);
//        ref_2.setPages("600");
//        ref_2.setYear("2010");
        
        refs.add(ref_1);
//        refs.add(ref_2);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testPrint() throws IOException {
        BibTex bt = new BibTex(refs);
        bt.printBibTex();
        
    }  
    
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
