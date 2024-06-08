package Tools;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkShortenerTest {
    @Test
    public void testShortenAndExpand() {
        LinkShortener shortenner = new LinkShortener();
        String originalUrl = "https://www.example.com";
        
        String shortUrl = shortenner.shorten(originalUrl);
        assertNotNull(shortUrl);
        
        String expandedUrl = shortenner.expand(shortUrl);
        assertEquals(originalUrl, expandedUrl);
    }
}
