package Tools;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearch {
    public static List<String> searchWords(String paragraph, String[] words) {
        List<String> foundWords = new ArrayList<>();
        
        for (String word : words) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(paragraph);
            
            while (matcher.find()) {
                foundWords.add(matcher.group());
            }
        }
        
        return foundWords;
    }
}
