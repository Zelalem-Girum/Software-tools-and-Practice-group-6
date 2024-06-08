package Tools;

import java.util.HashMap;
import java.util.Map;

public class LinkShortener {
    private Map<String, String> urlMap;

    public LinkShortener() {
        this.urlMap = new HashMap<>();
    }

    public String shorten(String originalUrl) {
        String shortUrl = generateShortUrl();
        urlMap.put(shortUrl, originalUrl);
        return shortUrl;
    }

    public String expand(String shortUrl) {
        return urlMap.get(shortUrl);
    }

    private String generateShortUrl() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            char c = (char) ((Math.random() * 26) + 'a');
            sb.append(c);
        }
        return "http://short.link/" + sb.toString();
    }
}
