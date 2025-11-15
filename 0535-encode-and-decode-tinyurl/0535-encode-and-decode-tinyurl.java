public class Codec {
    Map<String, String> map = new HashMap<>();
    String base = "http://tinyurl.com/";
    int id = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = base + id; 
        map.put(shortUrl, longUrl);
        id++;
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
