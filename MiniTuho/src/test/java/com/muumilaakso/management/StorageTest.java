package com.muumilaakso.management;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Muumilaakso
 */
public class StorageTest extends TestCase {

    Reference testiViite;
    Storage testiStorage;

    public StorageTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {

        String type = "type";
        ArrayList<String> author = new ArrayList<String>();
        author.add("author1");
        author.add("author2");
        String title = "title";
        int year = 1;
        String booktitle = "booktitle";
        String publisher = "publisher";
        String pages = "pages";
        String address = "address";

        this.testiViite = new Reference(type, author, title, year, publisher, booktitle, pages, address);

        this.testiStorage = new Storage();
    }

    /**
     * Test of addRef method, of class Storage.
     */
    public void testLisaaViite() {
        testiStorage.addRef(testiViite);

        assertTrue(testiStorage.getViitteet().contains(testiViite));
    }

    /**
     * Test of remRef method, of class Storage.
     */
    public void testPoistaViite() {
        testiStorage.remRef(testiViite);

        assertTrue(!testiStorage.getViitteet().contains(testiViite));
    }
}
