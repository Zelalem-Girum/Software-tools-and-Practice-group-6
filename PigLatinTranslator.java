package Tools;

public class PigLatinTranslator {
    public static String translate(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            String pigLatinWord = restOfWord + firstLetter + "ay";
            result.append(pigLatinWord).append(" ");
        }
        
        return result.toString().trim();
    }
}

