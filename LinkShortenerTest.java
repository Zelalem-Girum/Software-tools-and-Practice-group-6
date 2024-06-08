package Tools;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkShortenerTest {
    @Test
    public void testShortenAndExpand() {
        LinkShortener shortener = new LinkShortener();
        String originalUrl = "https://www.example.com";
        
        String shortUrl = shortener.shorten(originalUrl);
        assertNotNull(shortUrl);
        
        String expandedUrl = shortener.expand(shortUrl);
        assertEquals(originalUrl, expandedUrl);
    }
}
