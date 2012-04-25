import com.muumilaakso.*
import com.muumilaakso.io.*
import com.muumilaakso.management.*
import com.muumilaakso.ui.*

Reference ref;
Reference reftwo;
ArrayList<Reference> refs;
ArrayList<Reference> matching;
Search etsi;

description 'Search function works'

scenario "an existing reference is searched for", {
    given 'a new reference is created', {
        ref = new Reference();
        refs = new ArrayList<Reference>();
        ref.setBooktitle("Moi");
        refs.add(ref);
    }

    when 'the title is searched for', {
        etsi = new Search(refs);
        matching = etsi.listMatching("Moi");        
    }

    then 'the title is returned correctly', {
        matching.get(0).getBooktitle().shouldHave("Moi");
    }
}

scenario "two matching references", {
    given 'two new reference is created', {
        ref = new Reference();
        reftwo = new Reference();
        refs = new ArrayList<Reference>();
        ref.setBooktitle("Moi");
        reftwo.setBooktitle("Moi taas");
        refs.add(ref);
        refs.add(reftwo);
    }

    when 'the title is searched for', {
        etsi = new Search(refs);
        matching = etsi.listMatching("Moi");        
    }

    then 'both titles are returned correctly', {
        matching.get(0).getBooktitle().shouldHave("Moi");
        matching.get(1).getBooktitle().shouldHave("Moi taas");
    }
}


