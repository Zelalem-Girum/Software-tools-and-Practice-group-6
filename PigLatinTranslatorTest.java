package Tools;
import org.junit.Test;
import static org.junit.Assert.*;

public class PigLatinTranslatorTest {
	@Test
    public void testTranslate() {
        assertEquals("elloHay orldWay", PigLatinTranslator.translate("Hello World"));
        assertNotEquals("eThay uickqay ownfay umpedjay overay ethay azylay oxfay", PigLatinTranslator.translate("The quick brown fox jumped over the lazy dog"));
        assertNotEquals("applesay orangesay", PigLatinTranslator.translate("apple orange"));
    }
}


