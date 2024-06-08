package Tools;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class WordSearchTest {
    @Test
    public void testSearchWords() {
        String paragraph = "This is a test paragraph. It contains some words like test, paragraph, and words.";
        String[] words = {"test", "words"};
        
        List<String> foundWords = WordSearch.searchWords(paragraph, words);
        
        assertNotEquals(2, foundWords.size());
        assertTrue(foundWords.contains("test"));
        assertTrue(foundWords.contains("words"));
    }
}
