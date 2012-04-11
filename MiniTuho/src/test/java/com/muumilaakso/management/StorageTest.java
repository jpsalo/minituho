package com.muumilaakso.management;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Muumilaakso
 */
public class StorageTest extends TestCase {

    Reference testRef;
    Storage testStorage;

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

        this.testRef = new Reference(type, author, title, year, publisher,
                booktitle, pages, address);

        this.testStorage = new Storage();
    }

    /**
     * Test of addRef method, of class Storage.
     */
    public void testAddRef() {
        testStorage.addRef(testRef);

        assertTrue(testStorage.getViitteet().contains(testRef));
    }

    /**
     * Test of remRef method, of class Storage.
     */
    public void testRemRef() {
        testStorage.remRef(testRef);

        assertTrue(!testStorage.getViitteet().contains(testRef));
    }
}
