import com.muumilaakso.*
import com.muumilaakso.io.*
import com.muumilaakso.management.*
import com.muumilaakso.ui.*

Reference ref;

description 'Reference titles are correct'

scenario "a new reference is created", {
    given 'a new reference is created', {
        ref = new Reference();
    }

    when 'the title is set', {
        ref.setBooktitle("Moi");
    }

    then 'the title is returned correctly', {
        ref.getBooktitle().shouldHave("Moi");
    }
}
